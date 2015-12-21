package app;

import vo.Person;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import dialog.GroupsViewer;
import dialog.NewContact;
import dao.DbConnector;
import dao.PersonDAO;
import dialog.BranchFinder;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malith - malith.13@cse.mrt.ac.lk
 */
public class ContactsBook extends javax.swing.JFrame {

    
    PersonDAO personDAC;
    Connection myConn;
    
            
    /**
     * Creates new form ContactsBook
     */
    public ContactsBook() {
       
     
        initComponents();
        setLocationRelativeTo(null);
        //make them transparent
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        
        ImageIcon img = new ImageIcon(this.getClass().getResource("/pics/team2.png"));
        this.setIconImage(img.getImage());
        
        try {
           
            this.myConn =  DbConnector.getInstance().getMyConn();
            // make a DAO for Person class by sending in the DB Connection from dbConnector
            personDAC = new PersonDAO(myConn);

        } catch (IOException | SQLException ex) {
            JOptionPane.showMessageDialog(ContactsBook.this, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        btnSearch.doClick();
        refreshQuicViewPanelDefault();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNewContact = new javax.swing.JButton();
        btnUpdateContact = new javax.swing.JButton();
        btnDeleteContact = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        comboPara = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuickPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("People's Contacts Book beta");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setOpaque(false);

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Last Name", "Malith", "NIC", "Account No"
            }
        ));
        table.setOpaque(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Search by");

        btnNewContact.setText("Add New Contact");
        btnNewContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewContactActionPerformed(evt);
            }
        });

        btnUpdateContact.setText("Update Contact");
        btnUpdateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateContactActionPerformed(evt);
            }
        });

        btnDeleteContact.setText("Delete Contact");
        btnDeleteContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteContactActionPerformed(evt);
            }
        });

        jButton4.setText("Groups");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Tags");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNewContact, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteContact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewContact)
                    .addComponent(btnUpdateContact)
                    .addComponent(btnDeleteContact)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        comboPara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "NIC", "AccountNumber", "Phone", "All" }));

        jButton1.setText("NIC reader");

        jButton2.setText("AC No reader");

        jButton3.setText("Branch Seeker");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setOpaque(false);

        txtQuickPane.setEditable(false);
        txtQuickPane.setBorder(null);
        txtQuickPane.setContentType("text/html"); // NOI18N
        txtQuickPane.setToolTipText("");
        txtQuickPane.setOpaque(false);
        jScrollPane2.setViewportView(txtQuickPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPara, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(comboPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        try {
            // Get keyWord to search from the text field
            String keyWord = txtSearch.getText();
            // get what to search from combo box
            String searchPara = comboPara.getSelectedItem().toString();

            List<Person> person = null;

            // Call DAC and get persons relevent to the "searchpara"
            if (keyWord != null && keyWord.trim().length() > 0) {
                person = personDAC.searchPerson(keyWord, searchPara);
            } else {
                // If last name is empty, then get all employees
                person = personDAC.getAllPerson();
            }

            // when there is no search results to show, clear the table
            if (person.isEmpty()) {
                String[] columnNames = {"Last Name", "First Name", "NIC", "Account No"};
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                table.setModel(model);
                 // new update*****************************************************************************************************by Malith
            String temp = "<html><font  size=\"4\" color=\"red\"><center>No records!</center></font>";
            if (keyWord != null & !"".equals(keyWord)) {
                temp = "<html><font  size=\"4\" color=\"red\"><center>No records for \"" + keyWord + "\" under \"" + searchPara + "\"</center></font>";
            }
             txtQuickPane.setText(temp);
                return;
            }

            // create the model and update the "table"
            PersonTableModel model = new PersonTableModel(person);
            table.setModel(model);
              refreshQuicViewPanelDefault();

        } catch (Exception exc) {
            Logger.getLogger(ContactsBook.class.getName()).log(Level.SEVERE, null, exc);
            JOptionPane.showMessageDialog(ContactsBook.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewContactActionPerformed
        try {
            //create dialog
            NewContact newContactDialog = new NewContact(this, rootPaneCheckingEnabled, personDAC, null, false, ContactsBook.this, myConn);
            //show dialog
            newContactDialog.setVisible(true);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(ContactsBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnNewContactActionPerformed

    private void btnUpdateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateContactActionPerformed
        // get the selected row
        int row = table.getSelectedRow();

        //make sure a row is selected
        if (row < 0) {
            JOptionPane.showMessageDialog(ContactsBook.this, "You must select a contact first!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // get the selected current Person
        Person tempPerson = (Person) table.getValueAt(row, PersonTableModel.OBJECT_COL);

        // open the update dialog box (same as add new contact)
        try {
            //create dialog
            NewContact dialog = new NewContact(this, rootPaneCheckingEnabled, personDAC, tempPerson, true, ContactsBook.this, myConn);
            // show dialog
            dialog.setVisible(true);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(ContactsBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateContactActionPerformed

    private void btnDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteContactActionPerformed
        try {
            //get selected row
            int row = table.getSelectedRow();

            //make sure a row is selected
            if (row < 0) {
                JOptionPane.showMessageDialog(rootPane, "You must select a contact", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //get confirmation from the user before deleting
            int response = JOptionPane.showConfirmDialog(rootPane, "This will delete this Contact!!!", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response != JOptionPane.YES_OPTION) {
                return;
            }
            // get the current Person
            Person tempPerson = (Person) table.getValueAt(row, PersonTableModel.OBJECT_COL);

            // delete the person
            personDAC.deletePerson(tempPerson.getNic());

            // refresh GUI
            refreshGUI();

            // show success message
            JOptionPane.showMessageDialog(ContactsBook.this, "Contact deleted successfully", "Contact deleted", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(ContactsBook.this, "Error deleting the contact" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteContactActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
        refreshQuicViewPanel();


    }//GEN-LAST:event_tableMousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new GroupsViewer(this, true, myConn).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new BranchFinder(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        refreshQuicViewPanel();
    }//GEN-LAST:event_tableKeyReleased
    public void refreshQuicViewPanel() {
        // get the selected row
        int row = table.getSelectedRow();
        // get the current Person
        Person tempPerson = null;
        tempPerson = (Person) table.getValueAt(row, PersonTableModel.OBJECT_COL);
        // get values
        txtQuickPane.setText(tempPerson.getSummary());

    }

    public void refreshQuicViewPanelDefault() {
        // get the selected row
        int row = 0;
        // get the current Person
        Person tempPerson = null;
        try {
            tempPerson = (Person) table.getValueAt(row, PersonTableModel.OBJECT_COL);
            // get values
            txtQuickPane.setText(tempPerson.getSummary());
        } catch (Exception e) {
            txtQuickPane.setText("<html><font  size=\"4\" color=\"red\"><center>No  records!</center></font>");
        }

    }

    /**
     * method will refresh the GUI showing the latest update on the table
     *
     */
    public void refreshGUI() {
        try {
            // get all person theough the DAC to a tempory List
            List personList = personDAC.getAllPerson();

            // create the model and update the "table"
            PersonTableModel model = new PersonTableModel(personList);
            table.setModel(model);

        } catch (Exception exc) {
            JOptionPane.showMessageDialog(ContactsBook.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactsBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteContact;
    private javax.swing.JButton btnNewContact;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateContact;
    private javax.swing.JComboBox comboPara;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JEditorPane txtQuickPane;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
