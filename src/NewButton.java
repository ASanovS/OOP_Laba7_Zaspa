public class NewButton{

    private String weigth, height, color, name;

    public NewButton(String name, String weigth, String height, String color) {
        this.weigth = weigth;
        this.height = height;
        this.color = color;
        this.name = name;
    }


    @Override
    public String toString() {
        return  "weigth=" + weigth  + ", height=" + height + ", color=" + color + ", name=" + name;
    }
}
