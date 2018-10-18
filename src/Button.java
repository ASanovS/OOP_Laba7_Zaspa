class Button {

    private String weigth, height, color;

    public Button(String weigth, String height, String color) {
        this.weigth = weigth;
        this.height = height;
        this.color = color;

    }


    @Override
    public String toString() {
        return  "weigth=" + weigth  + ", height=" + height + ", color=" + color;
    }
}
