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
    
    File f = new File("C:\\Users\\Omar\\Desktop\\horoscopos\\archivo.txt");
    
    public void Escribir(String mensaje) throws IOException {
        
        try (FileWriter fw = new FileWriter(f, true)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(mensaje);
            fw.close();
        }
    
    }
    
    public ArrayList< ArrayList<String> > Leer() throws FileNotFoundException {
        
        Scanner s = new Scanner(f);
        int contador = 0;
        String cadena = "";
        String c[];
        
        while(s.hasNextLine()) {
            
            contador++;
        }
        
        return cadena;
        
        //return s.nextLine();
        
    }
    
}
