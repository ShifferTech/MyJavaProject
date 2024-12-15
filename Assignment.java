package MyJavaProject;

public class Assignment {
    public static void main(String[] args) {
        int rows = 8; // Change this to the desired number of rows

        // Creating a 2D array
        int[][] triangularArray = new int[rows][];

        // Initializing the triangular array
        for (int i = 0; i < rows; i++) {
            triangularArray[i] = new int[i + 1];
        }

        // Filling the array with numbers
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                triangularArray[i][j] = count;
                count--;
                count++;
            }
        }

        // Printing the triangular array
        printTriangularArray(triangularArray);
    }

    static void printTriangularArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
