// import java.util.Scanner;

// public class class1 {
//     public static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = add(a, b);
//         System.out.println(sum);
//     }

    
// }
// import java.util.Scanner;

// public class lec1 {
//     public static int freq(int a,int b)
//     {
//         int count=0;
//         while(a>0){
// int rem=a%10;
// if (rem==b) 
//     count++;
//     a=a/10;
    
//         }
//         return count;
    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         int count=freq(a, b);
//         System.out.println(count);

//     }
// }
// import java.util.Scanner;

// public class class1 {
// public static int binary(int a){
//   while (a>0) {
//     int rem
//   }
// }
    

//     public static void main(String[]args){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int convert=binary(a);
// System.out.println(convert);
//     }
// }

// import java.util.Scanner;

// public class lec1 {

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












