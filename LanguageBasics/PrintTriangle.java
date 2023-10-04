/*
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/
public class PrintTriangle {
    public static void main(String[] args) {
        printTriangle(5);
        printPravouhlyL(8);
        printPravouhlyR(6);
        printPravouhlyR(3);
    }

    private static void printPravouhlyR(int size) {
        int i = 0;

        while(i < size) {
            printChars(size - i - 1, ' ');
            printChars(i + 1, '*');
            System.out.println();
            i++;
        }
    }

    private static void printPravouhlyL(int size) {
        int i = 0;

        while(i < size) {
            printChars(i + 1, '*');
            System.out.println();
            i++;
        }
    }

    private static final void printTriangle(int size) {
        int i = 0;

        while(i < size) {
            printChars(size - i - 1, ' ');
            printChars(2 * i + 1, '*');
            System.out.println();
            i++;
        }
    }

    private static final void printChars(int length, char c) {
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}
