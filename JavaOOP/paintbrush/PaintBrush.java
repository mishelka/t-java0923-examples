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
    }
}
