/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivopdf;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class ArchivoPDF {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        /*Archivos a = new Archivos();
        
        ArrayList<ArrayList<String>> v = a.Leer();
        
        DatosLista datosLista = new DatosLista();
        
        datosLista.Bidimensional(v);*/
        
        new DatosLista().Bidimensional(new Archivos().Leer());
        
    }
    
}
