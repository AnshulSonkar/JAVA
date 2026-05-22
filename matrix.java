// import java.util.Scanner;

// public class matrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[][] matrix = new int[2][2];

//         System.out.println("Enter elements:");

//         for(int i = 0; i < 2; i++) {
//             for(int j = 0; j < 2; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Matrix is:");

//         for(int i = 0; i < 2; i++) {
//             for(int j = 0; j < 2; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 System.out.print(arr[i][j] + " ");
//             }

//             System.out.println();
//         }
//     }
// }





// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2},
//             {3, 4}
//         };

//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 sum += arr[i][j];
//             }
//         }

//         System.out.println("Sum = " + sum);
//     }
// }


// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 8, 3},
//             {4, 5, 6}
//         };

//         int max = arr[0][0];

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Largest = " + max);
//     }
// }


// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6}
//         };

//         for (int i = 0; i < arr.length; i++) {

//             int sum = 0;

//             for (int j = 0; j < arr[i].length; j++) {

//                 sum += arr[i][j];
//             }

//             System.out.println("Row " + i + " Sum = " + sum);
//         }
//     }
// }


// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6}
//         };

//         int key = 5;
//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = 0; j < arr[i].length; j++) {

//                 if (arr[i][j] == key) {
//                     found = true;
//                 }
//             }
//         }

//         System.out.println(found ? "Found" : "Not Found");
//     }
// }


// public class matrix {
//  public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3},
//             {4, 5, 6}
//         };

//         for (int i = 0; i < arr[0].length; i++) {

//             for (int j = 0; j < arr.length; j++) {

//                 System.out.print(arr[j][i] + " ");
//             }

//             System.out.println();
//         }
//     }
// }