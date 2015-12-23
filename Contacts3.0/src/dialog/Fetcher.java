/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Malith
 */
public class Fetcher implements Runnable {

    private String fileName2 = "/ContactPictures/image.jpg";

    NewContact newContact;
    Fetcher(NewContact newContact) {
        this.newContact = newContact;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("Fetcher started************************");
            BufferedImage originalImage = ImageIO.read(new File(getClass().getResource(fileName2).toURI()));
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
            
            BufferedImage resizedImage = resizeImage(originalImage, type);
            ImageIcon ii = new ImageIcon(toImage(resizedImage));
            newContact.setPic(ii);
            NewContact.contactImage = ii;
           
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write( resizedImage, "jpg", baos );
            baos.flush();
            newContact.contactByteImage = baos.toByteArray();
            baos.close();
            originalImage.flush();
            resizedImage.flush();
            
        } catch (IOException ex) {
            Logger.getLogger(Fetcher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Fetcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Image toImage(BufferedImage bufferedImage) {
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());
    }
    private BufferedImage resizeImage(BufferedImage image, int type){
        int WIDTH = image.getWidth();
       
        int HEIGHT = image.getHeight();
        int height;
        int width;
        if(WIDTH < HEIGHT){
             height = 300;
             width = 300*WIDTH/HEIGHT;
        }
        else{
             width = 240;
             height = 240*HEIGHT/WIDTH;
        }
        
        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D graphic = resizedImage.createGraphics();
        graphic.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphic.drawImage(image, 0, 0, width, height, null);
        graphic.dispose();
        return resizedImage;
    }
    
}
