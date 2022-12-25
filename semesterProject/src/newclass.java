import javax.swing.*;
import java.awt.*;

public class newclass {
    newclass(){
        JFrame f1=new JFrame();
        f1.setBounds(200,200,500,500);

        JPanel p4=new JPanel();
        p4.setBounds(400, 0, 500, 400);
        p4.setLayout(null);
        p4.setBackground(Color.black);
        p4.setVisible(false);
        f1.add(p4);
        f1.add(p4);
    }
}
