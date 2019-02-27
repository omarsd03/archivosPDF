/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivopdf;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class DatosLista {
    
    public ArrayList<String> Lista() {
        
        ArrayList<String> lista = new ArrayList();
        
        System.out.println(lista.isEmpty());

        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        
        return lista;
        
    }
    
    public void recibeLista(ArrayList<String> l) {
        
    }
    
    public void Bidimensional(ArrayList< ArrayList<String> > listaBD) {
        
        for (int i = 0; i < listaBD.get(0).size(); i++) {
            for (int j = 0; j < listaBD.size(); j++) {
                System.out.print(listaBD.get(j).get(i) + " ");
            }
            System.out.println("\n");
        }
        
    }
    
}
