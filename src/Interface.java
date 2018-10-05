import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Interface implements ActionListener{

      private KeyboardButton keyboardButton;
      private JFrame frame;
      private JPanel panel;
      private JButton b1;
      private JComboBox cb1;


    //Создание графического интерфейса программы

     void interfaceGUI(){

        frame = new JFrame("Laba 7 OOP Asanov S.V." );
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        b1 = new JButton("Create");
        b1.setActionCommand("create");
        b1.setBounds(90,320,120,20);
        b1.addActionListener( this);
        panel.add(b1);

        String[] out = {
                "Button phone",
                "A",
                "Escape",
                "Enter",
                "Shift",
        };
        cb1 = new JComboBox(out);
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
