package paintbrush;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String s = "";

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                s += "*  ";
            }
            s += "\n";
        }

        return s;
    }
}
