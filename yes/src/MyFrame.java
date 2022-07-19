import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.swing.*;


public class MyFrame extends JFrame {
    JButton button;
    JLabel labled;
    MyFrame(){
        button = new JButton();
        button.addActionListener(e -> System.out.println("x"));
        button.setText("Download");
        button.setVisible(true);
        button.setBounds(360,360,100,20);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());

        labled = new JLabel();
        labled.setVisible(true);
        labled.setText("S");
        labled.setBounds(30,30,50,30);



    }
}
