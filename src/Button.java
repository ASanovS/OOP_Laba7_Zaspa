class Button {

    String weigth, height, color;

    public Button(String weigth, String height, String color) {
        this.weigth = weigth;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Button: weigth=" + weigth + ", height=" + height + ", color=" + color + "\n";
    }
}
