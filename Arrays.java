// Revrse Array 
// import java.util.*;

// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};

//         int n = arr.length;

//         for (int i = 0; i < n / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[n - i - 1];
//             arr[n - i - 1] = temp;
//         }

//         System.out.println("Reversed Array:");
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// } 




// Inverse Array 
// import java.util.*;

// public class InverseArray {
//     public static void main(String[] args) {
//         int[] arr = {2, 0, 1, 3};

//         int n = arr.length;
//         int[] inv = new int[n];

//         for (int i = 0; i < n; i++) {
//             inv[arr[i]] = i;
//         }

//         System.out.println("Inverse Array:");
//         for (int x : inv) {
//             System.out.print(x + " ");
//         }
//     }
// }




// Rotate Array
// import java.util.*;

// public class RotateArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 2;

//         int n = arr.length;
//         k = k % n;

//         int[] res = new int[n];

//         for (int i = 0; i < n; i++) {
//             res[(i + k) % n] = arr[i];
//         }

//         System.out.println("Rotated Array:");
//         for (int x : res) {
//             System.out.print(x + " ");
//         }
//     }
// }


// import java.util.Scanner;
// public class Arrays {
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int[] arr=new int[a];
//     for(int i=0;i<a;i++){
//       arr[i]=sc.nextInt();
//     }
//     for(int i=0;i<a;i++){
//       System.out.print(arr[i]+"");
//     }
//   }
// }


// public class Arrays {
// public static void main(String[] args) {

//         int[] arr = {2, 4, 6, 8, 10};
//         int key = 6;

//         boolean found = false;

//         for (int i = 0; i < arr.length; i++) {

//             if (arr[i] == key) {
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println("Element Exists");
//         } else {
//             System.out.println("Element Does Not Exist");
//         }
// }
// }


// public class Arrays {
//  public static void main(String[] args) {

//         int[] arr = {1, 3, 5, 7};
//         int key = 4;

//         boolean found = false;

//         for (int x : arr) {
//             if (x == key) {
//                 found = true;
//                 break;
//             }
//         }

//         System.out.println(found ? "Exists" : "Not Exists");
//     }
// }


public class Arrays {
static boolean binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return true;
            }

            else if (arr[mid] < key) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(binarySearch(arr, 4));
    }
}

