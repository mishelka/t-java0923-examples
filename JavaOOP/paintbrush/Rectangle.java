package paintbrush;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this('*', width, height, 0, 0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(char color, int width, int height) {
        this(color, width, height, 0, 0);
    }

    public Rectangle(char color, int width, int height, int x, int y) {
        super(x, y, color);
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

        for (int r = 0; r < super.x; r++) {
            s += "\n";
        }
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < super.y; c++) {
                s += " ";
            }
            for (int c = 0; c < width; c++) {
                s += "*  ";
            }
            s += "\n";
        }

        return s;
    }
}
