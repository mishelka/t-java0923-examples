package paintbrush;

public class Line {
    private int size;

    public Line(int size) {
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
        for (int i = 0; i < size; i++) {
//            s = s + "*";
            s += "*";
        }
        return s;
    }
}
