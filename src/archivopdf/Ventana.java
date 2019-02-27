
package archivopdf;

//import com.itextpdf.text.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Ventana {
    
  static JTextField t1,t2;
  static JCheckBox c1,c2,c3,c4;
  static JRadioButton r1,r2;
  static JButton b1,b2,b3;

    Ventana() {
        
        Componentes c=new Componentes();
        JFrame f=new JFrame();
        f.setSize(800, 800);
        f.setTitle("Generación de PDFS y Gráficos");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JLabel e1=c.getLabel("Nombre");
        JLabel e2=c.getLabel("Edad");
        JLabel e3=c.getLabel("Pasatiempos");
        
        t1 = c.getField(20);
        t2 = c.getField(20);
        
        b1 = c.getButton("Guardar");
        b2 = c.getButton("Graficar");
        b3 = c.getButton("Generar PDF");
        
        c1 = c.getCasilla("Cine");
        c2 = c.getCasilla("Natación ");
        c3 = c.getCasilla("Lectura");
        c4 = c.getCasilla("Baile");
        
        r1 = c.getRadio("Soltero(a)");
        r2 = c.getRadio("Casada(o)");
        
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(r1);
        bg.add(r2);
        
        f.add(e1);
        f.add(t1);
        
        f.add(e2);
        f.add(t2);
        
        f.add(e3);
        
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        
        f.add(r1);
        f.add(r2);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);

        b1.addActionListener(new Eventos());
        //b3.addActionListener(new Eventos());
        
        f.setVisible(true);

    }

}
