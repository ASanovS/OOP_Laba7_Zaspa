import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Interface implements ActionListener{


      private JFrame frame;
      private JPanel panel;
      private JButton b1;
      private JComboBox cb1;
      private TextField tf;


    //Creation graphics interface program

     void interfaceGUI(){

        frame = new JFrame("Laba 7 OOP Asanov S.V." );
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        tf = new TextField();
        tf.setBounds(20,20,200,200);
        tf.setVisible(true);
        panel.add(tf);


        b1 = new JButton("Create");
        b1.setActionCommand("create");
        b1.setBounds(90,320,120,20);
        b1.addActionListener( this);
        panel.add(b1);

        String[] name = {
                "Button phone",
                "Red button",
                "Escape",
                "Enter",
                "Shift",
        };

        cb1 = new JComboBox(name);
        cb1.setActionCommand("box1");
        cb1.addActionListener( this);
        cb1.setBounds(90,280,120,20);
        panel.add(cb1);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
