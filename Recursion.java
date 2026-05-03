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




// public class Recursion {

//  public static void main(String[] args) {
//         String str = "hello";
//         String rev = "";

//         for (int i = str.length() -  1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }

//         System.out.println(rev);
//     }

// }


// public class Recursion {

//     public static void main(String[] args) {
//         String str = "Java is easy";

//         String[] words = str.split(" ");
//         System.out.println(words.length);
//     }
 
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Recursion {
//      public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) % 2 != 0) {
//                 list.remove(i);
//                 i--;
//             }
//         }

//         System.out.println(list);
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

// public class Recursion {
// public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));

//         Collections.sort(list);
//         System.out.println(list.get(list.size() - 2));
//     }
// } 


// public class Recursion {
// public static void main(String[] args) {
//         int n = 4;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.Arrays;

// public class Recursion {

//     static int fib(int n, int[] dp) {
//         if (n <= 1) return n;
//         if (dp[n] != -1) return dp[n];

//         return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
//     }

//     public static void main(String[] args) {
//         int n = 6;

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(fib(n, dp));
//     }
// }


//  public class Recursion {

//     public static void main(String[] args) {
//         int n = 153, temp = n, sum = 0;

//         while (temp > 0) {
//             int d = temp % 10;
//             sum += d * d * d;
//             temp /= 10;
//         }

//         System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
//     }
    
//  }


//  public class Recursion {

//     public static void main(String[] args) {
//         int n = 7;
//         boolean prime = true;

//         for (int i = 2; i <= n/2; i++) {
//             if (n % i == 0) {
//                 prime = false;
//                 break;
//             }
//         }

//         System.out.println(prime ? "Prime" : "Not Prime");
//     }

//  }


// public class Recursion {
// static void subset(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = up.charAt(0);

//         // include
//         subset(p + ch, up.substring(1));

//         // exclude
//         subset(p, up.substring(1));
//     }

//     public static void main(String[] args) {
//         subset("", "abc");
//     }
// }


// public class Recursion {

//      static void subsetSum(int[] arr, int i, int sum, String curr) {
//         if (i == arr.length) {
//             System.out.println(curr + "-> " + sum);
//             return;
//         }

//         // include
//         subsetSum(arr, i + 1, sum + arr[i], curr + arr[i] + " ");

//         // exclude
//         subsetSum(arr, i + 1, sum, curr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         subsetSum(arr, 0, 0, "");
//     }
// }


// public class Recursion {

//     static void permute(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = up.charAt(0);

//         for (int i = 0; i <= p.length(); i++) {
//             String first = p.substring(0, i);
//             String second = p.substring(i);

//             permute(first + ch + second, up.substring(1));
//         }
//     }

//     public static void main(String[] args) {
//         permute("", "abc");
//     }
// }


// public class Recursion {   
// static int count(String p, String up) {
//         if (up.isEmpty()) {
//             return 1;
//         }

//         char ch = up.charAt(0);

//         return count(p + ch, up.substring(1)) +
//                count(p, up.substring(1));
//     }

//     public static void main(String[] args) {
//         System.out.println(count("", "abc"));
//     }
// }


// public class Recursion {

// static void subset(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = up.charAt(0);

//         // include
//         subset(p + ch, up.substring(1));

//         // exclude
//         subset(p, up.substring(1));
//     }

//     public static void main(String[] args) {
//         subset("", "abc");
//     }
// }


// public class Recursion {
//     static void subsetSum(int[] arr, int i, int sum, String curr) {
//         if (i == arr.length) {
//             System.out.println(curr + "-> " + sum);
//             return;
//         }

//         // include
//         subsetSum(arr, i + 1, sum + arr[i], curr + arr[i] + " ");

//         // exclude
//         subsetSum(arr, i + 1, sum, curr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         subsetSum(arr, 0, 0, "");
//     }
// }


// public class Recursion {
//  static void permute(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p);
//             return;
//         }

//         char ch = up.charAt(0);

//         for (int i = 0; i <= p.length(); i++) {
//             String first = p.substring(0, i);
//             String second = p.substring(i);

//             permute(first + ch + second, up.substring(1));
//         }
//     }

//     public static void main(String[] args) {
//         permute("", "abc");
//     }
// }


// public class Recursion {

//      static void findSubset(int[] arr, int i, int sum, int target, String curr) {
//         if (i == arr.length) {
//             if (sum == target) {
//                 System.out.println(curr);
//             }
//             return;
//         }

//         // include
//         findSubset(arr, i + 1, sum + arr[i], target, curr + arr[i] + " ");

//         // exclude
//         findSubset(arr, i + 1, sum, target, curr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};
//         int target = 5;

//         findSubset(arr, 0, 0, target, "");
//     }

// }


// public class Recursion {
// static int count(String p, String up) {
//         if (up.isEmpty()) {
//             return 1;
//         }

//         char ch = up.charAt(0);

//         return count(p + ch, up.substring(1)) +
//                count(p, up.substring(1));
//     }

//     public static void main(String[] args) {
//         System.out.println(count("", "abc"));
//     }
// }

// import java.util.Arrays;

// public class Recursion {
// public static void main(String[] args) {
//         int[] arr = {5, 3, 2, 4, 1};

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {

//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }


// import java.util.Arrays;

// public class Recursion {
//     public static void main(String[] args) {
//         int[] arr = {5, 3, 2, 4, 1};

//         for (int i = 0; i < arr.length; i++) {
//             int minIndex = i;

//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }

//             // swap
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }


// import java.util.Arrays;
// public class Recursion {

// public static void main(String[] args) {
//         int[] arr = {5, 3, 2, 4, 1};

//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }

//             arr[j + 1] = current;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }


import java.util.Arrays;
public class Recursion {
public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}




    











