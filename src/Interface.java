import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;


class Interface implements ActionListener{


      private JFrame frame;
      private JPanel panel;
      private JButton b1;
      private JComboBox cb1;
      private JLabel lb;
      private TextField tf;


    //Creation graphics interface program

     void interfaceGUI(){

        frame = new JFrame("Laba 7 OOP Asanov S.V." );
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        String[] index = {"1","2","3","4","5"};
         tf = new TextField();
         tf.setBounds(20,20,550,200);
         tf.setVisible(true);
        panel.add(tf);


         b1 = new JButton("Create");
         b1.setActionCommand("create");
         b1.setBounds(260,320,120,20);
         b1.addActionListener( this);
         panel.add(b1);

         String[] names = {"Button phone","Button","Escape","Enter","Shift",};
         String[] colors = {"Red", "Grey", "Blue", "Orange", "Black", "White"};

         List<Button> buttons = new LinkedList<Button>();

         for(int i=0; i<5; i++) {
             Button item;
             Random r = new Random();
             String weigth = "" + r.nextInt(50);
             String height = "" + r.nextInt(10);
             String color = colors[r.nextInt(colors.length)];
             String name = names[r.nextInt(names.length)];

             if(Math.random() > 0.5) {
                 item = new KeyboardButton(weigth, height, color, name);
             } else {
                 item = new Button(weigth, height, color);
             }
             buttons.add(item);
         }

        cb1 = new JComboBox(index);
        cb1.setActionCommand("box1");
        cb1.addActionListener( this);
        cb1.setBounds(260,280,120,20);
        panel.add(cb1);

        lb = new JLabel();
        lb.setBounds(10,345,400,20);
        panel.add(lb);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         switch (e.getActionCommand()) {
              case "create":
                  tf.setText("Create objects");
                  lb.setText("Set text objects button");
                  break;
         }
    }
}
