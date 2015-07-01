/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Malith
 */
public class NicReader {
    private String id;

    public NicReader() {
        
    }
    
    public void setSexnDOB(javax.swing.JTextField txtNic,javax.swing.JTextField txtSex, javax.swing.JTextField txtDOB ){
       // calculate male or female and setText at txtSex
        id = txtNic.getText();
        int day = 0;
        if(id.length() == 0){return;}
        if(id.length()<9 || id.length() >10){
            JOptionPane.showMessageDialog(null, "please enter a valid NIC number");
            txtNic.setText("");
            txtNic.requestFocus();
            return ;
        }
        try{
            day = Integer.parseInt(id.substring(2,5));
            if(day <366){txtSex.setText("Male");}
            else{txtSex.setText("Female");}
            
            Integer.parseInt(id.substring(0,9)); // to check the first 9 digits are only numeric
            
            
        }
        catch (NumberFormatException | StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,  "please enter a valid NIC number");
            txtNic.setText("");
            txtNic.requestFocus();
        }  
        
        // calculate DOB and set text at txtDOB
        int year = Integer.parseInt("19"+id.substring(0,2)); // after ~2020 this logic will fail..!!!!!!
        if(day == 0){return;}
        if(day>365){day-=500;}
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, day-1); // day-1, because in java day of a year starts with 0
        calendar.set(Calendar.YEAR, year);
        
        
        int month = calendar.get(Calendar.MONTH) + 1 ; // +1, because in java day of a month starts with 0
        int dayofMonth = calendar.get(Calendar.DAY_OF_MONTH);
        
        String date = dayofMonth +"/"+ month +"/" + year;
        txtDOB.setText(date);
       
    }
    
}
