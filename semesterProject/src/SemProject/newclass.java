package SemProject;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class newclass {
 newclass(){
     JFrame f1=new JFrame();
     f1.setBounds(200,200,1000,500);
     f1.setLayout(null);

     JTextArea h=new JTextArea();
     h.setBounds(0,0,200,200);
     h.setText("""
             Hey hello,
             how are you.
             """);

     f1.add(h);
     String chk=h.getText();
     JTextArea ta=new JTextArea(chk);
     ta.setBounds(200,200,200,200);
     f1.add(ta);
     f1.setVisible(true);
 }
}

