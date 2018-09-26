import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Interface implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JButton b1;
    private JComboBox cb1,cb2;
    private JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    private JRadioButton rb1,rb2, rb3;
    private JCheckBox coffee, wifi;
    private JTextArea ta;
    private JLabel l1, l2,l3,l4,l5,l6,l7,l8,l9;


    //Создание графического интерфейса программы

     void interfaceGUI(){

        frame = new JFrame("Заказ билета: ЗПЗ-164 Асанов С.В.");
        frame.setSize(530,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        ta = new JTextArea();
        ta.setBounds(250,10,240,230);
        panel.add(ta);

        b1 = new JButton("Print Ticket");
        b1.setActionCommand("pt");
        b1.setBounds(300,270,120,20);
        b1.addActionListener( this);
        panel.add(b1);

        l1 = new JLabel("Departure");
        l1.setBounds(10,150,100,20);
        panel.add(l1);
        l2 = new JLabel("Arrival");
        l2.setBounds(120,150,100,20);
        panel.add(l2);
        l3 = new JLabel("Select additional services");
        l3.setBounds(10,260,200,20);
        panel.add(l3);
        l4 = new JLabel("Seat");
        l4.setBounds(10,215,100,20);
        panel.add(l4);
        l5 = new JLabel("Price");
        l5.setBounds(120,215,100,20);
        panel.add(l5);
        l6 = new JLabel("Ferst name");
        l6.setBounds(10,170,100,20);
        panel.add(l6);
        l7 = new JLabel("Last name");
        l7.setBounds(120,170,100,20);
        panel.add(l7);
        l8 = new JLabel("Ticket #:");
        l8.setBounds(10,70,100,20);
        panel.add(l8);
        l9 = new JLabel("Date:");
        l9.setBounds(10,90,100,20);
        panel.add(l9);


        tf1 = new JTextField();
        tf1.setBounds(10,190,100,20);
        panel.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(120,190,100,20);
        panel.add(tf2);
        tf3 = new JTextField();
        tf3.setBounds(10,240,100,20);
        panel.add(tf3);
        tf4 = new JTextField();
        tf4.setBounds(120,240,100,20);
        panel.add(tf4);
        tf5 = new JTextField();
        tf5.setBounds(120,70,40,20);
        panel.add(tf5);
        tf6 = new JTextField();
        tf6.setBounds(120,90,90,20);
        panel.add(tf6);
        tf1.setEnabled(false);
        tf2.setEnabled(false);
        tf3.setEnabled(false);

        rb1 = new JRadioButton("Bus Ticket");
        rb1.setBounds(10,10,100,20);
        rb1.addActionListener( this);
        rb1.setActionCommand("bt");
        panel.add(rb1);

        rb2 = new JRadioButton("Train Ticket");
        rb2.setActionCommand("tt");
        rb2.addActionListener( this);
        rb2.setBounds(10,30,130,20);
        panel.add(rb2);

        rb3 = new JRadioButton("Train Ticket Lux");
        rb3.setActionCommand("ttl");
        rb3.addActionListener(this);
        rb3.setBounds(10,50,150,20);
        panel.add(rb3);


        ButtonGroup group = new ButtonGroup();
        rb1.setSelected(true);
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        coffee = new JCheckBox("Coffee");
        coffee.setActionCommand("coffee");
        wifi = new JCheckBox("Internet");
        wifi.setActionCommand("wifi");
        coffee.setBounds(10,280,75,20);
        wifi.setBounds(100,280,100,20);
        coffee.setEnabled(false);
        wifi.setEnabled(false);
        panel.add(coffee);
        panel.add(wifi);

        String[] out = {
                "Krakov",
                "Kyiv",
                "Cherkassy",
                "Lviv",
                "Smila",
                "BilaCerkva",
        };
        cb1 = new JComboBox(out);
        cb1.setActionCommand("box1");
        cb1.addActionListener( this);
        cb1.setBounds(10,120,100,20);
        panel.add(cb1);

        String[] in = {
                "Krakov",
                "Kyiv",
                "Cherkassy",
                "Lviv",
                "Smila",
                "BilaCerkva",
        };
        cb2 = new JComboBox(in);
        cb2.setActionCommand("box2");
        cb2.addActionListener( this);
        cb2.setBounds(120,120,100,20);
        panel.add(cb2);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
