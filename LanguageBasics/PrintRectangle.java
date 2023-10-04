public class PrintRectangle {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        for(int row = 0; row < height; row++) {
            for(int col = 0; col < width; col++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
