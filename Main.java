// public class firstkrep{

//     public static void main(string[] args) {
        
//     }
    
// }


// public class Main1 {
//     public static void main(String[] args) {
//         String str = "geeksforgeeks";
//         char result = ' ';
//         boolean found = false;

//         for (int i = 0; i < str.length(); i++) {
//             boolean isRepeating = false;
//             for (int j = 0; j < str.length(); j++) {
                
//                 if (i != j && str.charAt(i) == str.charAt(j)) {
//                     isRepeating = true;
//                     break;
//                 }
//             }
            
//             if (!isRepeating) {
//                 result = str.charAt(i);
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println("First non-repeating character is: " + result);
//         } else {
//             System.out.println("No non-repeating character found.");
//         }
//     }
// }


// public class Main1 {
//     public static void main(String[] args) {
//         String str = "aabbccdee";
//         char result = ' ';
//         boolean found = false;

//         for (int i = 0; i < str.length(); i++) {
//             boolean isRepeating = false;
//             for (int j = 0; j < str.length(); j++) {
                
//                 if (i != j && str.charAt(i) == str.charAt(j)) {
//                     isRepeating = true;
//                     break;
//                 }
//             }
            
            
//             if (!isRepeating) {
//                 result = str.charAt(i);
//                 found = true;
//                 break;
//             }
//         }

//         if (found) {
//             System.out.println("First non-repeating character is: " + result);
//         } else {
//             System.out.println("No non-repeating character found.");
//         }
//     }
// }


// class Main1 {
//     public static void main(String[] args) {

//         String name1 = "Aman";
//         String name2 = "Akku";
//         String name3 = name1 +" "+ name2;

//         System.out.println(name3);
//     }
// }


// class Main1 {
//    public static void main(String[] args) {
//     boolean isSunUp = false;

//         if (isSunUp == true)
//             System.out.println("day");
//         else
//             System.out.println("night");

//  }
// }


// class Main1 {

//       public static void printName(String name) {
//       System.out.println(name);
//     }
//     public static void printSum(int a, int b) {
//         int sum = a + b;
//         System.out.println(sum);
//    }
//     public static void main (String[] args) {
//         printSum(1 , 6);
//     }
// }


// public class Main {
// public static void main(String[] args) {
//         String str = "banana";

//         int[] count = new int[26];

//         for (int i = 0; i < str.length(); i++) {
//             count[str.charAt(i) - 'a']++;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (count[i] > 0) {
//                 System.out.println((char)(i + 'a') + " -> " + count[i]);
//             }
//         }
//     }
// }


    // public class Main1 {
    //     public static void main(String[] args) {
    //     String str = "programming";

    //     for (int i = 0; i < str.length(); i++) {
    //         int count = 0;

    //         for (int j = i + 1; j < str.length(); j++) {
    //             if (str.charAt(i) == str.charAt(j)) {
    //                 count++;
    //             }
    //         }

    //         if (count > 0) {
    //             System.out.println(str.charAt(i));
    //         }
    //     }
    // }
    // }


//     public class Main1 {
//     public static void main(String[] args) {
//         String s1 = "abcd";
//         String s2 = "cdab";

//         if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
//             System.out.println("Rotation");
//         } else {
//             System.out.println("Not Rotation");
//         }
//     }
// }


// public class Main1 {
// public static void main(String[] args) {
//         String str = "hello";
//         int v = 0, c = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if ("aeiou".indexOf(ch) != -1) v++;
//             else c++;
//         }

//         System.out.println("Vowels: " + v);
//         System.out.println("Consonants: " + c);
//     }
// }


// import java.util.Arrays;

// public class Main1 {

//    static int fibo(int n, int[] dp) {
//         if (n <= 1) {
//             return n;
//         }

//         if (dp[n] != -1) {
//             return dp[n];
//         }

//         dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
//         return dp[n];
//     }

//     public static void main(String[] args) {
//         int n = 5;

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(fibo(n, dp));
//     }
// }



// public class Main1 {
// public static void main(String[] args) {
//         int n = 4;

//         int[] dp = new int[n + 1];
//         dp[0] = 0;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         System.out.println(dp[n]);
//     }
// }


// public class Main1 {

//         public static void main(String[] args) {
//         int n = 8;

//         int a = 0, b = 1;

//         for (int i = 2; i <= n; i++) {
//             int c = a + b;
//             a = b;
//             b = c;
//         }

//         System.out.println(n == 0 ? a : b);
//     }

// }


// import java.util.Arrays;
// public class Main1 {
// static int ways(int n, int[] dp) {
//         if (n <= 1) return 1;

//         if (dp[n] != -1) return dp[n];

//         return dp[n] = ways(n - 1, dp) + ways(n - 2, dp);
//     }

//     public static void main(String[] args) {
//         int n = 6;

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(ways(n, dp));
//     }
// }



// public class Main1 {
//     static int recursioin(int a,int b){
//     int sum=a+b;
//    return sum;
//   }
//     public static void main(String[] args) {
       
//         System.out.println(recursioin(2,3));
//   }
// }




// import java.util.Scanner;

// public class Main1 {
//  public static void main(String[] args) {
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




// import java.util.Scanner;

// public class Main1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int rows = 3;
//         int cols = 3;
//         int[][] matrix = new int[rows][cols];

//         System.out.println("Enter elements:");

//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//     }
// } 


// public class Main1 {
// static int linearSearch(int[] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 7, 1, 9};

//         System.out.println(linearSearch(arr, 7));
//     }
// }


// public class Main1 {
// static int binarySearch(int[] arr, int key) {
//         int low = 0, high = arr.length - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] == key) return mid;

//             else if (arr[mid] < key) low = mid + 1;

//             else high = mid - 1;
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6};

//         System.out.println(binarySearch(arr, 4));
//     }
// }


// public class Main1 {
// static int binarySearch(int[] arr, int low, int high, int key) {
//         if (low > high) return -1;

//         int mid = (low + high) / 2;

//         if (arr[mid] == key) return mid;

//         if (arr[mid] < key)
//             return binarySearch(arr, mid + 1, high, key);
//         else
//             return binarySearch(arr, low, mid - 1, key);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5};

//         System.out.println(binarySearch(arr, 0, arr.length - 1, 5));
//     }
// }


// public class Main1 {
// public static void main(String[] args) {
//         int[] arr = {1,2,2,2,3,4};
//         int key = 2;

//         int index = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 index = i;
//                 break;
//             }
//         }

//         System.out.println(index);
//     }
// }


// public class Main1 {
// public static void main(String[] args) {
//         int[] arr = {1,2,2,2,3,4};
//         int key = 2;

//         int count = 0;

//         for (int x : arr) {
//             if (x == key) count++;
//         }

//         System.out.println(count);
//     }
// }


// public class Main1 {
//  public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 4, 2};
//         int key = 2;

//         int index = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 index = i;   
//             }
//         }

//         System.out.println(index);
//     }
// }


// public class Main1 {
// public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 4, 2};
//         int key = 2;

//         int index = -1;

//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] == key) {
//                 index = i;
//                 break;
//             }
//         }

//         System.out.println(index);
//     }
// }


// public class Main1 {
// public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 4};

//         int min = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         System.out.println("Smallest: " + min);
//     }
// }


// public class Main1 {
//  public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 4};

//         int min = arr[0];

//         for (int x : arr) {
//             if (x < min) {
//                 min = x;
//             }
//         }

//         System.out.println(min);
//     }
// }


// import java.util.Arrays;
// public class Main1 {
// public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 4};

//         Arrays.sort(arr);

//         System.out.println(arr[0]);
//     }
// } 


//  public class Main1 {
// static int min(int[] arr, int i) {
//         if (i == arr.length - 1) return arr[i];

//         return Math.min(arr[i], min(arr, i + 1));
//     }

//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 1, 4};

//         System.out.println(min(arr, 0));
//     }
// } 

// import java.util.ArrayList;

// public class Main1 {
//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);

//         System.out.println(list);
//     }
// }

// import java.util.ArrayList;

// public class Main1 {
//     public static void main(String[] args) {

//         ArrayList<String> list = new ArrayList<>();

//         list.add("Java");
//         list.add("Python");

//         System.out.println(list.get(1));

//         list.set(1, "C++");

//         System.out.println(list);

//         list.remove(0);

//         System.out.println(list);

//         System.out.println(list.size());
//     }
// }

// import java.util.ArrayList;

// public class Main1 {
//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(5);
//         list.add(10);
//         list.add(15);

//         for (int x : list) {
//             System.out.println(x);
//         }
//     }
// }

// import java.util.LinkedList;

// public class Main1 {
//     public static void main(String[] args) {

//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(1);
//         list.add(2);
//         list.addFirst(0);
//         list.addLast(3);

//         System.out.println(list);
//     }
// }


// import java.util.HashSet;

// public class Main1 {
//     public static void main(String[] args) {

//         HashSet<Integer> set = new HashSet<>();

//         set.add(10);
//         set.add(20);
//         set.add(10);

//         System.out.println(set);
//     }
// }

// import java.util.HashMap;

// public class Main1 {
//     public static void main(String[] args) {

//         HashMap<Integer, String> map = new HashMap<>();

//         map.put(1, "Anshul");
//         map.put(2, "Saurabh");

//         System.out.println(map);

//         System.out.println(map.get(1));
//     }
// }
    
// class MyThread extends Thread {

//     public void run() {

//         for (int i = 1; i <= 5; i++) {

//             System.out.println("Thread Running : " + i);
//         }
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         MyThread t1 = new MyThread();

//         t1.start();
//     }
// }

// class MyThread implements Runnable {

//     public void run() {

//         for (int i = 1; i <= 5; i++) {

//             System.out.println(i);
//         }
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         MyThread obj = new MyThread();

//         Thread t1 = new Thread(obj);

//         t1.start();
//     }
// }

// class A extends Thread {

//     public void run() {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println("A : " + i);
//         }
//     }
// }

// class B extends Thread {

//     public void run() {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println("B : " + i);
//         }
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         A t1 = new A();
//         B t2 = new B();

//         t1.start();
//         t2.start();
//     }
// }

// class MyThread extends Thread {

//     public void run() {

//         try {

//             for (int i = 1; i <= 5; i++) {

//                 System.out.println(i);

//                 Thread.sleep(1000);
//             }

//         } catch (Exception e) {

//             System.out.println(e);
//         }
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         MyThread t1 = new MyThread();

//         t1.start();
//     }
// }




// class MyThread extends Thread {

//     public void run() {

//         for (int i = 1; i <= 5; i++) {

//             System.out.println(i);
//         }
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         try {

//             MyThread t1 = new MyThread();

//             t1.start();

//             t1.join();

//             System.out.println("Main Thread Ends");

//         } catch (Exception e) {

//             System.out.println(e);
//         }
//     }
// }

// class Table {

//     synchronized void printTable(int n) {

//         for (int i = 1; i <= 5; i++) {

//             System.out.println(n * i);
//         }
//     }
// }

// class MyThread1 extends Thread {

//     Table t;

//     MyThread1(Table t) {
//         this.t = t;
//     }

//     public void run() {
//         t.printTable(5);
//     }
// }

// class MyThread2 extends Thread {

//     Table t;

//     MyThread2(Table t) {
//         this.t = t;
//     }

//     public void run() {
//         t.printTable(10);
//     }
// }

// public class Main1 {
//     public static void main(String[] args) {

//         Table obj = new Table();

//         MyThread1 t1 = new MyThread1(obj);
//         MyThread2 t2 = new MyThread2(obj);

//         t1.start();
//         t2.start();
//     }
// }


// public class Main1 {
//     public static void main(String[] args) {

//         try {

//             MyThread t1 = new MyThread();

//             t1.start();

//             t1.join();

//             System.out.println("Main Thread Ends");

//         } catch (Exception e) {

//             System.out.println(e);
//         }
//     }
// }


// import java.util.HashMap;

// public class Main1 {
//     public static void main(String[] args) {

//         HashMap<Integer, String> map = new HashMap<>();

//         map.put(1, "Anshul");
//         map.put(2, "Saurabh");

//         System.out.println(map);

//         System.out.println(map.get(1));
//     }
// }



// Count parentheses in Stack
// import java.util.Stack;

// public class Main1 {
//     public static void main(String[] args) {

//         String str = "(a+b)*(c-d)";

//         int open = 0;
//         int close = 0;

//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if (ch == '(') {
//                 stack.push(ch);
//                 open++;
//             }

//             if (ch == ')') {
//                 close++;
//             }
//         }

//         System.out.println("Opening Parentheses = " + open);
//         System.out.println("Closing Parentheses = " + close);
//     }
// }


// import java.util.Stack;

// public class Main1 {

//     public static void main(String[] args) {

//         String s = "(())";

//         Stack<Integer> st = new Stack<>();
//         st.push(0);

//         for (char ch : s.toCharArray()) {

//             if (ch == '(') {

//                 st.push(0);

//             } else {

//                 int v = st.pop();

//                 int count = Math.max(2 * v, 1);

//                 st.push(st.pop() + count);
//             }
//         }

//         System.out.println(st.pop());
//     }
// }


// public class Main1 {

//     public static String removeOuterParentheses(String s) {

//         StringBuilder result = new StringBuilder();
//         int count = 0;

//         for (char ch : s.toCharArray()) {

//             if (ch == '(') {

//                 if (count > 0) {
//                     result.append(ch);
//                 }

//                 count++;
//             }
//             else {

//                 count--;

//                 if (count > 0) {
//                     result.append(ch);
//                 }
//             }
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {

//         String s = "(()())(())";

//         System.out.println(removeOuterParentheses(s));
//     }
// }


// import java.util.Stack;

// public class Main1 {

//     public static void main(String[] args) {

//         String num = "1432219";
//         int k = 3;

//         Stack<Character> st = new Stack<>();

//         for (char digit : num.toCharArray()) {

//             while (!st.isEmpty() && k > 0 && st.peek() > digit) {
//                 st.pop();
//                 k--;
//             }

//             st.push(digit);
//         }

//         // Remove remaining digits if k > 0
//         while (k > 0) {
//             st.pop();
//             k--;
//         }

//         // Build answer
//         StringBuilder sb = new StringBuilder();

//         while (!st.isEmpty()) {
//             sb.append(st.pop());
//         }

//         sb.reverse();

//         // Remove leading zeros
//         while (sb.length() > 0 && sb.charAt(0) == '0') {
//             sb.deleteCharAt(0);
//         }

//         String result = sb.toString();

//         if (result.isEmpty()) {
//             result = "0";
//         }

//         System.out.println(result);
//     }
// } 
// 
// Power of three 
// public class Main {

//     static boolean isPowerOfThree(int n) {

//         if (n == 1)
//             return true;

//         if (n <= 0 || n % 3 != 0)
//             return false;

//         return isPowerOfThree(n / 3);
//     }

//     public static void main(String[] args) {

//         int n = 27;

//         System.out.println(isPowerOfThree(n));
//     }
// }


// Climb Stairs
// public class Main {

//     static int climbStairs(int n) {

//         if (n <= 2)
//             return n;

//         return climbStairs(n - 1) + climbStairs(n - 2);
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         System.out.println(climbStairs(n));
//     }
// }


// Recursion Basic type-1
// Climb Stairs
// public class Main {

//     static int climbStairs(int n) {

//         if (n <= 2)
//             return n;

//         return climbStairs(n - 1) + climbStairs(n - 2);
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         System.out.println(climbStairs(n));
//     }
// }


// Memoization Method (Top-down DP) type-2
// import java.util.Arrays;

// public class Main {

//     static int climb(int n, int[] dp) {

//         if (n <= 2)
//             return n;

//         if (dp[n] != -1)
//             return dp[n];

//         dp[n] = climb(n - 1, dp) + climb(n - 2, dp);

//         return dp[n];
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(climb(n, dp));
//     }
// }


// Tabulation Method (Bottom-Up DP) type-3
// public class Main {

//     static int climbStairs(int n) {

//         if (n <= 2)
//             return n;

//         int[] dp = new int[n + 1];

//         dp[1] = 1;
//         dp[2] = 2;

//         for (int i = 3; i <= n; i++) {

//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         return dp[n];
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         System.out.println(climbStairs(n));
//     }
// }


// Space Optimized (type-4)
// public class Main {

//     static int climbStairs(int n) {

//         if (n <= 2)
//             return n;

//         int first = 1;
//         int second = 2;

//         for (int i = 3; i <= n; i++) {

//             int current = first + second;

//             first = second;
//             second = current;
//         }

//         return second;
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         System.out.println(climbStairs(n));
//     }
// }


// Remove K Digits
// import java.util.Stack;

// public class Main {

//     public static void main(String[] args) {

//         String num = "1432219";
//         int k = 3;

//         Stack<Character> st = new Stack<>();

//         for (char digit : num.toCharArray()) {

//             while (!st.isEmpty() && k > 0 && st.peek() > digit) {
//                 st.pop();
//                 k--;
//             }

//             st.push(digit);
//         }

//         // Remove remaining digits if k > 0
//         while (k > 0) {
//             st.pop();
//             k--;
//         }

//         // Build answer
//         StringBuilder sb = new StringBuilder();

//         while (!st.isEmpty()) {
//             sb.append(st.pop());
//         }

//         sb.reverse();

//         // Remove leading zeros
//         while (sb.length() > 0 && sb.charAt(0) == '0') {
//             sb.deleteCharAt(0);
//         }

//         String result = sb.toString();

//         if (result.isEmpty()) {
//             result = "0";
//         }

//         System.out.println(result);
//     }
// }


// Unique Paths
// public class Main {

//     public static int uniquePaths(int m, int n) {

//         int[][] dp = new int[m][n];

//         dp[0][0] = 1;

//         for (int i = 0; i < m; i++) {

//             for (int j = 0; j < n; j++) {

//                 if (i == 0 && j == 0)
//                     continue;

//                 int up = 0;
//                 int left = 0;

//                 if (i > 0)
//                     up = dp[i - 1][j];

//                 if (j > 0)
//                     left = dp[i][j - 1];

//                 dp[i][j] = up + left;
//             }
//         }

//         return dp[m - 1][n - 1];
//     }

//     public static void main(String[] args) {

//         int m = 3;
//         int n = 7;

//         System.out.println(uniquePaths(m, n));
//     }
// } 


// Memoization (Top-Down DP)
// import java.util.Arrays;

// public class Main {

//     static int solve(int i, int j, int[][] dp) {

//         if (i == 0 && j == 0)
//             return 1;

//         if (i < 0 || j < 0)
//             return 0;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int up = solve(i - 1, j, dp);
//         int left = solve(i, j - 1, dp);

//         return dp[i][j] = up + left;
//     }

//     static int uniquePaths(int m, int n) {

//         int[][] dp = new int[m][n];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         return solve(m - 1, n - 1, dp);
//     }

//     public static void main(String[] args) {

//         int m = 3;
//         int n = 7;

//         System.out.println(uniquePaths(m, n));
//     }
// }


// Tabulation (Bottom-Up DP)
// public class Main {

//     static int uniquePaths(int m, int n) {

//         int[][] dp = new int[m][n];

//         dp[0][0] = 1;

//         for (int i = 0; i < m; i++) {

//             for (int j = 0; j < n; j++) {

//                 if (i == 0 && j == 0)
//                     continue;

//                 int up = 0;
//                 int left = 0;

//                 if (i > 0)
//                     up = dp[i - 1][j];

//                 if (j > 0)
//                     left = dp[i][j - 1];

//                 dp[i][j] = up + left;
//             }
//         }

//         return dp[m - 1][n - 1];
//     }

//     public static void main(String[] args) {

//         int m = 3;
//         int n = 7;

//         System.out.println(uniquePaths(m, n));
//     }
// }
    

// Space optimized 
// public class Main {

//     static int uniquePaths(int m, int n) {

//         int[] prev = new int[n];

//         for (int i = 0; i < m; i++) {

//             int[] curr = new int[n];

//             for (int j = 0; j < n; j++) {

//                 if (i == 0 && j == 0) {
//                     curr[j] = 1;
//                 } else {

//                     int up = 0;
//                     int left = 0;

//                     if (i > 0)
//                         up = prev[j];

//                     if (j > 0)
//                         left = curr[j - 1];

//                     curr[j] = up + left;
//                 }
//             }

//             prev = curr;
//         }

//         return prev[n - 1];
//     }

//     public static void main(String[] args) {

//         int m = 3;
//         int n = 7;

//         System.out.println(uniquePaths(m, n));
//     }
// }


// Recursion
// public class Main {

//     static int solve(int[][] grid, int i, int j) {

//         if (i < 0 || j < 0)
//             return 0;

//         if (grid[i][j] == 1)
//             return 0;

//         if (i == 0 && j == 0)
//             return 1;

//         int up = solve(grid, i - 1, j);
//         int left = solve(grid, i, j - 1);

//         return up + left;
//     }

//     public static void main(String[] args) {

//         int[][] grid = {
//                 {0,0,0},
//                 {0,1,0},
//                 {0,0,0}
//         };

//         System.out.println(
//                 solve(grid, 2, 2)
//         );
//     }
// }


// Memoization
// import java.util.Arrays;

// public class Main {

//     static int solve(int[][] grid, int i, int j, int[][] dp) {

//         if (i < 0 || j < 0)
//             return 0;

//         if (grid[i][j] == 1)
//             return 0;

//         if (i == 0 && j == 0)
//             return 1;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int up = solve(grid, i - 1, j, dp);
//         int left = solve(grid, i, j - 1, dp);

//         return dp[i][j] = up + left;
//     }

//     static int uniquePathsWithObstacles(int[][] grid) {

//         int m = grid.length;
//         int n = grid[0].length;

//         int[][] dp = new int[m][n];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         return solve(grid, m - 1, n - 1, dp);
//     }

//     public static void main(String[] args) {

//         int[][] grid = {
//                 {0,0,0},
//                 {0,1,0},
//                 {0,0,0}
//         };

//         System.out.println(uniquePathsWithObstacles(grid));
//     }
// }


// Tabulation
// import java.util.Arrays;

// public class Main {

//     static int solve(int[][] grid, int i, int j, int[][] dp) {

//         if (i < 0 || j < 0)
//             return 0;

//         if (grid[i][j] == 1)
//             return 0;

//         if (i == 0 && j == 0)
//             return 1;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int up = solve(grid, i - 1, j, dp);
//         int left = solve(grid, i, j - 1, dp);

//         return dp[i][j] = up + left;
//     }

//     static int uniquePathsWithObstacles(int[][] grid) {

//         int m = grid.length;
//         int n = grid[0].length;

//         int[][] dp = new int[m][n];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         return solve(grid, m - 1, n - 1, dp);
//     }

//     public static void main(String[] args) {

//         int[][] grid = {
//                 {0,0,0},
//                 {0,1,0},
//                 {0,0,0}
//         };

//         System.out.println(uniquePathsWithObstacles(grid));
//     }
// }


// Space Optimized
// public class Main {

//     static int uniquePathsWithObstacles(int[][] grid) {

//         int m = grid.length;
//         int n = grid[0].length;

//         int[] prev = new int[n];

//         for (int i = 0; i < m; i++) {

//             int[] curr = new int[n];

//             for (int j = 0; j < n; j++) {

//                 if (grid[i][j] == 1) {
//                     curr[j] = 0;
//                     continue;
//                 }

//                 if (i == 0 && j == 0) {
//                     curr[j] = 1;
//                     continue;
//                 }

//                 int up = (i > 0) ? prev[j] : 0;
//                 int left = (j > 0) ? curr[j - 1] : 0;

//                 curr[j] = up + left;
//             }

//             prev = curr;
//         }

//         return prev[n - 1];
//     }

//     public static void main(String[] args) {

//         int[][] grid = {
//                 {0,0,0},
//                 {0,1,0},
//                 {0,0,0}
//         };

//         System.out.println(uniquePathsWithObstacles(grid));
//     }
// }


