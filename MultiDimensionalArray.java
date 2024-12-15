package MyJavaProject;
// import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
    //     String[] students = new String[5];

    //     students[0] = "string";
    //     students[1] = "string";
    //     students[2] = "string";
    //     students[3] = "string";
    //     students[4] = "string";

    //     Scanner scan = new Scanner(System.in);

    //     for (int i = 0; i < students.length; i++) {
    //         students[i] = scan.next();
    //     }

    //     for (String uzo : students) {
    //         System.out.println(uzo);
    //     }

    //     scan.close();
    // }

    //             class ArrayProcessor {
    //                 int[][] multi = new int[3][4];

    //                 ArrayProcessor() {
    //                     multi[0][0] = 10;
    //                     multi[0][1] = 20;
    //                     multi[0][2] = 5;
    //                     multi[0][3] = 6;
    //                     multi[1][0] = 77;
    //                     multi[1][1] = 11;
    //                     multi[1][2] = 10;
    //                     multi[1][3] = 7;
    //                     multi[2][0] = 89;
    //                     multi[2][1] = 40;
    //                     multi[2][2] = 41;
    //                     multi[2][3] = 32;

    //                     Scanner input = new Scanner(System.in);

    //                 for (int i = 0; i < 3; i++) {
    //                     for (int j = 0; j < 4; j++) {
    //                         System.out.print("Enter column number: ");
    //                         multi[i][j] = input.nextInt();
    //                     }
    //                 }

    //                 int sum = 0;
    //                 for (int i = 0; i < 3; i++) {
    //                     for (int j = 0; j < 4; j++) {
    //                         sum += multi[i][j];
    //                     }
    //                 }

    //                 System.out.println("Sum of the array elements: " + sum);

    //                 input.close(); // Close the Scanner to avoid resource leak
    //             }
    //         }

    int rows = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("Sh ");
            }

            System.out.println();
        }
    }
}
 

