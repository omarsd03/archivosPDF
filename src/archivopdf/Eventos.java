/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivopdf;

import static archivopdf.Ventana.b1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar
 */
public class Eventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(b1)) {
            
            try {
                new Archivos().Escribir(new Datos().Guardar());
            } catch (IOException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}
