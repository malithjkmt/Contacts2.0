/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import javax.swing.JButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Malith
 */
public class MyDocumentListener implements DocumentListener {
    JButton btnUpdate;
    public MyDocumentListener(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        System.out.println("A");
        warn();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        System.out.println("B");
        warn();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        System.out.println("C");
        warn();
    }

    public void warn() {
        btnUpdate.setEnabled(true);
    }

}
