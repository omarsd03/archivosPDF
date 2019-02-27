/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivopdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Archivos {
    
    /*File f;
    
    Archivos(File f) {
        this.f = f;
    }*/
    
    File f = new File("C:\\Users\\Omar\\Desktop\\horoscopos\\pdf.txt");
    
    public void Escribir(String mensaje) throws IOException {
        
        try (FileWriter fw = new FileWriter(f, true)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(mensaje);
            fw.close();
        }
    
    }
    
    public ArrayList< ArrayList<String> > Leer() throws FileNotFoundException {
        
        Scanner s = new Scanner(f);
        
        ArrayList<ArrayList<String>>l=new ArrayList();
        l.add(new ArrayList());
        l.add(new ArrayList());
        
        int contador = 0;
        String cadena;
        String c[];
        
        while(s.hasNext()) {
            cadena = s.nextLine();
            c = cadena.split(",");
            /*for (int i = 0; i < c.length; i++){
                l.get(contador).add(c[i]);
                contador++;
            }*/
            l.get(1).add(c[0]);
            l.get(0).add(c[1]);
        }
        
        return l;
        
        //return s.nextLine();
        
    }
    
}
