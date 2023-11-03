public class ArrayOfArrays {
    public static void main(String[] args) {
        //int[][] aMatrix = new int[4][];
        int[][] aMatrix = new int[4][5];
//        printMatrix(aMatrix);

        int[][] a = {
                { 1, 2, 3, 4 },
                { 6, 5, 4, 19 },
                { 7, 8, 9, 10 }
        };
        int[][] b = {
                { 4, 6, 8, 8 },
                { 5, 7, 9, 10 },
                { 10, 12, 50, 20 }
        };

        int[][] result = addMatrices(a, b);
        if(result != null) {
            printMatrix(result);
        }

        int[][] matrixToTranspose = {
                { 0, 1, 2, 3 },
                { 4, 5, 6, 7 }
        };
        int[][] transposedMatrix = transposeMatrix(matrixToTranspose);
        printMatrix(transposedMatrix);

//        //populate matrix
//        for (int r = 0; r < aMatrix.length; r++) {
//            //aMatrix[i] = new int[5];	//create sub-array
//            for (int c = 0; c < aMatrix[r].length; c++) {
//                aMatrix[r][c] = r + c;
//            }
//        }
//
//        //print matrix
//        for (int r = 0; r < aMatrix.length; r++) {
//            for (int c = 0; c < aMatrix[r].length; c++) {
//                System.out.print(aMatrix[r][c] + " ");
//            }
//            System.out.println();
//        }
    }

    private static int[][] addMatrices(int[][] a, int[][] b) {
        if(a.length != b.length) {
            System.out.println("NEDA SA ZRATAT, MATICE MUSIA MAT ROVNAKY POCET RIADKOV");
            return null;
        }

        int[][] result = new int[3][4]; //vysledok

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                result[r][c] = a[r][c] + b[r][c];
            }
        }

        return result;
    }

    //todo: implement the transposeMatrix
    private static int[][] transposeMatrix(int[][] m) {
        int[][] result = null;// = new int[][];

        //transponovat maticu
        //https://cs.wikipedia.org/wiki/Transpozice_matice

         return result;
    }

    private static void printMatrix(int[][] aMatrix) {
        for (int r = 0; r < aMatrix.length; r++) {
            for (int c = 0; c < aMatrix[r].length; c++) {
                System.out.print(aMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
