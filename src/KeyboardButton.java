public class KeyboardButton extends Button {

    private String name;

    public KeyboardButton(String weigth, String height, String color, String name) {
        super(weigth, height, color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "KeyboardButton{" +
                "name='" + name + '\'' +
                ", weigth='" + weigth + '\'' +
                ", height='" + height + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
