package paintbrush;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        super(0, 0, '*');
        this.size = size;
    }

    public Square(char color, int size) {
        this(color, size, 0, 0);
    }

    public Square(char color, int size, int x, int y) {
        super(x, y, color);
        this.size = size;
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
        for (int r = 0; r < super.x; r++) {
            s += "\n";
        }
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < super.y; c++) {
                s += " ";
            }
            for (int c = 0; c < size; c++) {
                s += super.color + "  ";
            }
            s += "\n";
        }

        return s;
    }
}
