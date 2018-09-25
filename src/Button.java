class Button implements NewButton{

    private String name, height, depth, width;

    public Button(String name, String height, String depth, String width) {
        this.name = name;
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    @Override
    public String buttonPreparetion() {
        return toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Button{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", depth='" + depth + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
