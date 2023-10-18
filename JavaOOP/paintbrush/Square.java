package paintbrush;

public class Square {
    private char color = '*';
    private int size;
    private int x;
    private int y;

    public Square(int size) {
        this.size = size;
    }

    public Square(char color, int size) {
        this(size);
        this.color = color;
    }

    public Square(char color, int size, int x, int y) {
        this(color, size);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String s = "";

        //x = 4 -> s += "\n\n\n\n"
        for (int r = 0; r < x; r++) {
            s += "\n";
        }
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < y; c++) {
                s += " ";
            }
            for (int c = 0; c < size; c++) {
                s += color + "  ";
            }
            s += "\n";
        }

        return s;
    }
}
