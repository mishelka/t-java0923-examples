package paintbrush;

public class PaintBrush {
    public static void main(String[] args) {
        Line l1 = new Line(10);
        System.out.println(l1);

        //referencne premenne:
        Line l2 = new Line(5);
        System.out.println(l2);
        System.out.println();
        Line l3 = l2;
        System.out.println(l2);
        System.out.println(l3);
        l2.setSize(20);
        System.out.println(l3);
        System.out.println(l2);

        Line l4 = new Line(15, 0, 0, '@');
        System.out.println(l4);

// primitivne premenne:
//        int a = 3;
//        int b = a;
//        a = 10;
//        System.out.println(a + ", " + b);

//        Square s = new Square(5);
//        System.out.println(s);
//        System.out.println("-");
//
//        Square s2 = new Square('#', 7);
//        System.out.println(s2);
//        System.out.println("-");
//
//        Square s3 = new Square('&', 3, 2, 4);
//        System.out.println(s3);
//        System.out.println("-");

        //rectangle
    }
}
