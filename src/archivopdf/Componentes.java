/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivopdf;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class Componentes {
    
    public JButton getButton(String titulo) {
        JButton b = new JButton(titulo);
        // b.setText(titulo);
        return b;
    }
    
    public JLabel getLabel(String titulo) {
        JLabel e = new JLabel(titulo);
        return e;
    }
    
    public JTextField getField(int tam) {
        JTextField t = new JTextField(tam);
        return t;
    }
    
    public JCheckBox getCasilla(String msg) {
        JCheckBox ch = new JCheckBox(msg);
        return ch;   
    }
    
    public JTextArea getArea(int r, int c) {
        return new JTextArea(r, c);
    }
    
    public JRadioButton getRadio(String desc) {
        JRadioButton r = new JRadioButton(desc);
        return r;
    }
    
}
