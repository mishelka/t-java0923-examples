package paintbrush;

public class PaintBrush {
    public static void main(String[] args) {
        Line l1 = new Line(10);
        System.out.println(l1);

        Line l2 = new Line(5);
        System.out.println(l2);
        System.out.println();

        Square s = new Square(5);
        System.out.println(s);
        System.out.println("-");

        Square s2 = new Square('#', 7);
        System.out.println(s2);
        System.out.println("-");

        Square s3 = new Square('&', 3, 2, 4);
        System.out.println(s3);
        System.out.println("-");

        //rectangle
    }
}
