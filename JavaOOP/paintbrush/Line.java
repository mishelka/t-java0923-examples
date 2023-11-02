package paintbrush;

public class Line extends Shape {
    private int size;

    public Line(int size) {
        super(0, 0, '*');
        this.size = size;
    }

    public Line(int size, int x, int y, char color) {
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

        for (int r = 0; r < super.x; r++) {
            s += "\n";
        }
        for (int c = 0; c < super.y; c++) {
            s += " ";
        }
        for (int i = 0; i < size; i++) {
//            s = s + "*";
            s += super.color;
        }
        return s;
    }
}
