public class KeyboardButton extends Button {

    private String name;

    public KeyboardButton(String name, String weigth, String height, String color) {
        super(weigth, height, color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "name " + name + super.toString();
    }
}
