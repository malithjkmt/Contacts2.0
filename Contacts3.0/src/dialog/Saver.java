/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Malith
 */
public class Saver implements Runnable {

    private String imageUrl = "http://192.168.1.2:8080/photoaf.jpg";
    private String destinationFile = "src/ContactPictures/image.jpg";

    @Override
    public void run() {
        InputStream is = null;
            OutputStream os = null;
        try {
            URL url = new URL(imageUrl);
            
            is = url.openStream();
            os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }
        } catch (ConnectException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Please start cam server in the phone!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception er) {
            System.out.println(er.toString());
        } finally {
            try {
                os.close();
                is.close();
                System.out.println("saver sleep");
                Thread.sleep(6000);
                System.out.println("saver wokeup");
            } catch (IOException ex) {
                Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saver.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }

    }

}
