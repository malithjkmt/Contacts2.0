/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

/**
 *
 * @author Malith
 */
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MyEmail{
    public void sendMail(){
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = "...This is a test mail";

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("malit.tilak@gmail.com", "Example.com Admin"));
            msg.addRecipient(Message.RecipientType.TO,
                             new InternetAddress("malit.tilak@gmail.com", "Malith"));
            msg.setSubject("Your Example.com account has been activated");
            msg.setText(msgBody);
            Transport.send(msg);

        } catch (AddressException e) {
            System.out.println(e.toString());
        } catch (MessagingException e) {
            System.out.println(e.toString());
}       catch (UnsupportedEncodingException ex) {  
            Logger.getLogger(MyEmail.class.getName()).log(Level.SEVERE, null, ex);
        }  
}
    public static void main(String[] args){
        new MyEmail().sendMail();
    }
}
