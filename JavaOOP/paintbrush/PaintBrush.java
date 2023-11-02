package paintbrush;

public class PaintBrush {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Line(10),
                new Line(5),
                new Line(15, 0, 0, '@'),
                new Square(5),
                new Square('#', 7),
                new Square('&', 3, 2, 4),
                new Square(Square.DEFAULT_SIZE),
                new Rectangle(2, 4)
        };

        for (Shape s : shapes) { //foreach
            System.out.println(s);
            System.out.println();
        }

        for (int i = 0; i < shapes.length; i++) { //for
            System.out.println(shapes[i]);
            System.out.println();
        }

        System.out.println(shapes[4].getClass()); //typ je Square
        System.out.println(shapes.getClass()); //typ je pole Shapeov (Shape[])

        Shape l = new Line(4);
        Shape l2 = new Line(4);
        Shape l3 = l;

        System.out.println(l.hashCode());
        System.out.println(l.equals(l2)); //false
        System.out.println(l.equals(l3)); //true
        System.out.println(l.getClass());

        System.out.println(l instanceof Line); //true
        System.out.println(l instanceof Shape); //true
        System.out.println(l instanceof Object); //true
        System.out.println(l instanceof Square); //false
    }
}
