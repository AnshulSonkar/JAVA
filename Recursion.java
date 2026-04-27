// public class Recursion {
//     static void printnumber(int n) {
//         if (n > 10) {
//             return;
//         }

//         System.out.print(n + " ");
//         printnumber(n + 1);
//     }

//     public static void main(String[] args) {
//         printnumber(1);
//     }
// } 


// public class recursion {
//     static void printnumber(int n) {
//         if (n> 10) {
//             return;
//         }
//         System.out.println(n);
//         printnumber(n: n + 1);
//     }
//     static int fact(int n) {
//         if(n == 1) return 1;

//     }
//     public static void main(string[] args) {
//         printnumber(n:1);
//         system.out.println(fact( n:5));
//     }
// }


// public class Recursion {

//     static void printnumber(int n) {
//         if (n > 10) {
//             return;
//         }
//         System.out.println(n);
//         printnumber(n + 1);   // fixed
//     }

//     static int fact(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n * fact(n - 1);   // completed function
//     }

//     public static void main(String[] args) {
//         printnumber(1);   // fixed
//         System.out.println(fact(5));   // fixed
//     }
// }


// public class Recursion {
//     static void print(int n) {
//         if (n == 0) return;
//         System.out.print(n + " ");
//         print(n - 1);
//     }

//     public static void main(String[] args) {
//         print(5);
//     }
// }


// public class Recursion {
// static int sum(int n) {
//         if (n == 0) return 0;
//         return n % 10 + sum(n / 10);
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(1234));
//     }
// }


// public class Recursion {

//     static boolean isSorted(int[] arr, int i) {
//         if (i == arr.length - 1) return true;
//         if (arr[i] > arr[i + 1]) return false;
//         return isSorted(arr, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         System.out.println(isSorted(arr, 0));
//     }
// }




public class Recursion {

 public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        for (int i = str.length() -  1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }

}











