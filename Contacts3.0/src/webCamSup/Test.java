/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webCamSup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author Malith
 */
public class Test {
    public static void main(String[] args) throws Exception {
		String imageUrl = "http://192.168.1.5:8080/photoaf.jpg";
		String destinationFile = "ContactPictures//image.jpg";

		saveImage(imageUrl, destinationFile);
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
                InputStream is = null;
                OutputStream os = null;
		try{
                is = url.openStream();
		os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
                }
                catch (ConnectException e){
                    //"Error: " + e, "Error", JOptionPane.ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null,"Please start cam server in the phone!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                finally{
                    if(is != null){is.close();}
                    if(os != null){os.close();}
                    
                }
		
	}
}
