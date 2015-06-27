/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Malith
 */
public class QuickViewPanel extends JEditorPane {
    public void show(Person person){
        String inputToHtml = "<html>\n" +
"    <head>\n" +
"        <title>TODO supply a title</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <div><b>"+person.getLastName()+"</b></div>\n" +
"    </body>\n" +
"</html>\n" +
"";
        File f = new File ("G:\\Data\\CampainsProjectsMtg\\ContactsDataBaseSystemForBankManager2015\\Contacts2.0\\Contacts2.0\\src\\web\\test.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(inputToHtml);
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ContactsBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // set HTML page to quickView jEditorPane
            this.setPage(getClass().getResource("/web/test.html"));//this should be something like c:\\User\\Documents
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(this, "Error url: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
