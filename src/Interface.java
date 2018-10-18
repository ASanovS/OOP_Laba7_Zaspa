import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


class Interface implements ActionListener{


      private JFrame frame;
      private JPanel panel;
      private JButton b1;
      private JComboBox cb1;
      private TextArea ta;


    //Creation graphics interface program

     void interfaceGUI(){

        frame = new JFrame("Laba 7 OOP Asanov S.V." );
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        String[] counter = {"1","2","3","4","5"};
        ta = new TextArea();
        ta.setBounds(20,20,200,200);
        ta.setVisible(true);
        panel.add(ta);


        b1 = new JButton("Create");
        b1.setActionCommand("create");
        b1.setBounds(90,320,120,20);
        b1.addActionListener( this);
        panel.add(b1);


        String[] names = {"Button phone","Button","Escape","Enter","Shift",};
        String[] colors = {"Red", "Grey", "Blue", "Orange", "Black", "White"};

        cb1 = new JComboBox(counter);
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
