import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

class Interface implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton b1;
    private JComboBox cb1;
    private TextArea ta;
    private JTextField tf;

    static String myButtonsText(List<Button> buttons){
        String text = "list of my buttons: \n";
        int i = 0;
        for(Button button : buttons){
            i++;
            text += ""+i + ") " + button.toString()+ "\n";
        }
        return text;
    }

    //Creation graphics interface program

    void interfaceGUI() {

        frame = new JFrame("Laba 7 OOP Asanov S.V.");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);


        ta = new TextArea();
        ta.setBounds(20, 20, 550, 200);
        ta.setVisible(true);
        panel.add(ta);

        tf = new JTextField();
        tf.setBounds(20, 250, 500, 20);
        panel.add(tf);

        b1 = new JButton("Create");
        b1.setActionCommand("create");
        b1.setBounds(260, 320, 120, 20);
        b1.addActionListener(this);
        panel.add(b1);

        String[] index = {"1", "2", "3", "4", "5"};
        cb1 = new JComboBox(index);
        cb1.setActionCommand("box1");
        cb1.addActionListener(this);
        cb1.setBounds(260, 280, 120, 20);
        panel.add(cb1);

        frame.setVisible(true);
    }

    List<Button> buttons = new LinkedList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "create":

                String[] names = {"Button phone", "Button", "Escape", "Enter", "Shift",};
                String[] colors = {"Red", "Grey", "Blue", "Orange", "Black", "White"};
                for (int i = 0; i < 5; i++) {
                    Button button;
                    Random r = new Random();
                    String weigth = "" + r.nextInt(50);
                    String height = "" + r.nextInt(10);
                    String color = colors[r.nextInt(colors.length)];
                    String name = names[r.nextInt(names.length)];

                    if (Math.random() > 0.5) {
                        button = new KeyboardButton(weigth, height, color, name);
                    } else {
                        button = new Button(weigth, height, color);
                    }
                    buttons.add(button);
                    ta.setText(myButtonsText(buttons));
                }
                break;

            case "box1":
                int item = Integer.parseInt((String)cb1.getSelectedItem());
                Button button = buttons.get(item);

                if(cb1.getSelectedItem().equals("1")){
                    tf.setText(button.toString());
                }else if(cb1.getSelectedItem().equals("2")){
                    tf.setText(button.toString());
                }else if(cb1.getSelectedItem().equals("3")){
                    tf.setText(button.toString());
                }else if(cb1.getSelectedItem().equals("4")){
                    tf.setText(button.toString());
                }else if(cb1.getSelectedItem().equals("5")){
                    tf.setText(button.toString());
                }

            break;



        }
    }
}