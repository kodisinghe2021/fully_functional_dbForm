/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawithdb;

import Bill.Invoice;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel;

/**
 *
 * @author Kasun
 */
public class JavaWithDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Login.setDefaultLookAndFeelDecorated(true);
            MainForm.setDefaultLookAndFeelDecorated(true);
            Registration.setDefaultLookAndFeelDecorated(true);
            Invoice.setDefaultLookAndFeelDecorated(true);
            
            LookAndFeel lk = new SubstanceMistAquaLookAndFeel();
            UIManager.setLookAndFeel(lk);
            new Login().setVisible(true);
        } catch (Exception e) {
        }
    }
    
}
