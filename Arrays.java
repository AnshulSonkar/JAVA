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
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;
        k = k % n;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = arr[i];
        }

        System.out.println("Rotated Array:");
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
