import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Interface mainInterface = new Interface();
        //mainInterface.interfaceGUI();

        Button button = new Button("Кнопка на телефоне", "10","20","50");
        Button kbutton = new KeyboardButton("","0","","");
        NewButton btn = new Button("4","3","2","1");

        List<NewButton> list = new ArrayList<>();
        list.add(button);
        list.add(kbutton);
        list.add(btn);

        System.out.println(list);


    }
}
