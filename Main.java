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


// Recursion
// public class Main {

//     static int solve(int[][] grid, int i, int j){

//         if(i==0 && j==0)
//             return grid[0][0];

//         if(i<0 || j<0)
//             return Integer.MAX_VALUE;

//         int up = solve(grid,i-1,j);
//         int left = solve(grid,i,j-1);

//         return grid[i][j] + Math.min(up,left);
//     }

//     public static void main(String[] args){

//         int[][] grid={
//                 {1,3,1},
//                 {1,5,1},
//                 {4,2,1}
//         };

//         System.out.println(
//                 solve(grid,2,2)
//         );
//     }
// }


// Memoization
// import java.util.Arrays;

// public class Main {

//     static int solve(int[][] grid,int i,int j,int[][] dp){

//         if(i==0 && j==0)
//             return grid[0][0];

//         if(i<0 || j<0)
//             return Integer.MAX_VALUE;

//         if(dp[i][j]!=-1)
//             return dp[i][j];

//         int up=solve(grid,i-1,j,dp);
//         int left=solve(grid,i,j-1,dp);

//         dp[i][j]=grid[i][j]+Math.min(up,left);

//         return dp[i][j];
//     }

//     public static void main(String[] args){

//         int[][] grid={
//                 {1,3,1},
//                 {1,5,1},
//                 {4,2,1}
//         };

//         int[][] dp=new int[3][3];

//         for(int[] row:dp)
//             Arrays.fill(row,-1);

//         System.out.println(
//                 solve(grid,2,2,dp)
//         );
//     }
// }


// Tabulation 
// public class Main {

//     static int minPathSum(int[][] grid){

//         int m=grid.length;
//         int n=grid[0].length;

//         int[][] dp=new int[m][n];

//         dp[0][0]=grid[0][0];

//         for(int i=0;i<m;i++){

//             for(int j=0;j<n;j++){

//                 if(i==0 && j==0)
//                     continue;

//                 int up=Integer.MAX_VALUE;
//                 int left=Integer.MAX_VALUE;

//                 if(i>0)
//                     up=dp[i-1][j];

//                 if(j>0)
//                     left=dp[i][j-1];

//                 dp[i][j]=grid[i][j]+Math.min(up,left);
//             }
//         }

//         return dp[m-1][n-1];
//     }

//     public static void main(String[] args){

//         int[][] grid={
//                 {1,3,1},
//                 {1,5,1},
//                 {4,2,1}
//         };

//         System.out.println(
//                 minPathSum(grid)
//         );
//     }
// }


// Space Optimized
// public class Main {

//     static int minPathSum(int[][] grid){

//         int m=grid.length;
//         int n=grid[0].length;

//         int[] prev=new int[n];

//         for(int i=0;i<m;i++){

//             int[] curr=new int[n];

//             for(int j=0;j<n;j++){

//                 if(i==0 && j==0){

//                     curr[j]=grid[0][0];
//                     continue;
//                 }

//                 int up=Integer.MAX_VALUE;
//                 int left=Integer.MAX_VALUE;

//                 if(i>0)
//                     up=prev[j];

//                 if(j>0)
//                     left=curr[j-1];

//                 curr[j]=grid[i][j]+Math.min(up,left);
//             }

//             prev=curr;
//         }

//         return prev[n-1];
//     }

//     public static void main(String[] args){

//         int[][] grid={
//                 {1,3,1},
//                 {1,5,1},
//                 {4,2,1}
//         };

//         System.out.println(
//                 minPathSum(grid)
//         );
//     }
// }


// Triangle
// Space Optimized
// public class Main {

//     static int minPathSum(int[][] grid){

//         int m=grid.length;
//         int n=grid[0].length;

//         int[] prev=new int[n];

//         for(int i=0;i<m;i++){

//             int[] curr=new int[n];

//             for(int j=0;j<n;j++){

//                 if(i==0 && j==0){

//                     curr[j]=grid[0][0];
//                     continue;
//                 }

//                 int up=Integer.MAX_VALUE;
//                 int left=Integer.MAX_VALUE;

//                 if(i>0)
//                     up=prev[j];

//                 if(j>0)
//                     left=curr[j-1];

//                 curr[j]=grid[i][j]+Math.min(up,left);
//             }

//             prev=curr;
//         }

//         return prev[n-1];
//     }

//     public static void main(String[] args){

//         int[][] grid={
//                 {1,3,1},
//                 {1,5,1},
//                 {4,2,1}
//         };

//         System.out.println(
//                 minPathSum(grid)
//         );
//     }
// }


// Triangle ques in Memoization
// import java.util.*;

// public class Main {

//     static int solve(List<List<Integer>> t,
//                      int i,
//                      int j,
//                      int[][] dp){

//         if(i==t.size()-1)
//             return t.get(i).get(j);

//         if(dp[i][j]!=-1)
//             return dp[i][j];

//         int down=
//                 solve(t,i+1,j,dp);

//         int diagonal=
//                 solve(t,i+1,j+1,dp);

//         dp[i][j]=
//                 t.get(i).get(j)
//                 +
//                 Math.min(down,diagonal);

//         return dp[i][j];
//     }

//     public static void main(String[] args){

//         List<List<Integer>> triangle=new ArrayList<>();

//         triangle.add(Arrays.asList(2));
//         triangle.add(Arrays.asList(3,4));
//         triangle.add(Arrays.asList(6,5,7));
//         triangle.add(Arrays.asList(4,1,8,3));

//         int[][] dp=new int[triangle.size()][triangle.size()];

//         for(int[] row:dp)
//             Arrays.fill(row,-1);

//         System.out.println(
//                 solve(triangle,0,0,dp)
//         );
//     }
// }


// Triangle Through Tabulation
// import java.util.*;

// public class Main {

//     static int minimumTotal(List<List<Integer>> triangle){

//         int n=triangle.size();

//         int[][] dp=new int[n][n];

//         for(int j=0;j<n;j++)
//             dp[n-1][j]=triangle.get(n-1).get(j);

//         for(int i=n-2;i>=0;i--){

//             for(int j=0;j<=i;j++){

//                 dp[i][j]=
//                         triangle.get(i).get(j)
//                         +
//                         Math.min(
//                                 dp[i+1][j],
//                                 dp[i+1][j+1]
//                         );
//             }
//         }

//         return dp[0][0];
//     }

//     public static void main(String[] args){

//         List<List<Integer>> triangle=new ArrayList<>();

//         triangle.add(Arrays.asList(2));
//         triangle.add(Arrays.asList(3,4));
//         triangle.add(Arrays.asList(6,5,7));
//         triangle.add(Arrays.asList(4,1,8,3));

//         System.out.println(
//                 minimumTotal(triangle)
//         );
//     }
// }


// Triangle through Space Optimization
// import java.util.*;

// public class Main {

//     static int minimumTotal(List<List<Integer>> triangle){

//         int n=triangle.size();

//         int[] front=new int[n];

//         for(int j=0;j<n;j++)
//             front[j]=triangle.get(n-1).get(j);

//         for(int i=n-2;i>=0;i--){

//             int[] curr=new int[n];

//             for(int j=0;j<=i;j++){

//                 curr[j]=
//                         triangle.get(i).get(j)
//                         +
//                         Math.min(
//                                 front[j],
//                                 front[j+1]
//                         );
//             }

//             front=curr;
//         }

//         return front[0];
//     }

//     public static void main(String[] args){

//         List<List<Integer>> triangle=new ArrayList<>();

//         triangle.add(Arrays.asList(2));
//         triangle.add(Arrays.asList(3,4));
//         triangle.add(Arrays.asList(6,5,7));
//         triangle.add(Arrays.asList(4,1,8,3));

//         System.out.println(
//                 minimumTotal(triangle)
//         );
//     }
// }


// Minimum Falling Path
// public class Main {

//     static int solve(int[][] matrix, int i, int j) {

//         int n = matrix.length;

//         if (j < 0 || j >= n)
//             return Integer.MAX_VALUE;

//         if (i == n - 1)
//             return matrix[i][j];

//         int down = solve(matrix, i + 1, j);
//         int left = solve(matrix, i + 1, j - 1);
//         int right = solve(matrix, i + 1, j + 1);

//         return matrix[i][j] +
//                 Math.min(down, Math.min(left, right));
//     }

//     static int minFallingPathSum(int[][] matrix) {

//         int n = matrix.length;

//         int ans = Integer.MAX_VALUE;

//         for (int j = 0; j < n; j++) {

//             ans = Math.min(ans, solve(matrix, 0, j));
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {2,1,3},
//                 {6,5,4},
//                 {7,8,9}
//         };

//         System.out.println(minFallingPathSum(matrix));
//     }
// }


//Falling Path Sum(2nd Method Memo)
// public class Main {

//     static int solve(int[][] matrix, int i, int j) {

//         int n = matrix.length;

//         if (j < 0 || j >= n)
//             return Integer.MAX_VALUE;

//         if (i == n - 1)
//             return matrix[i][j];

//         int down = solve(matrix, i + 1, j);
//         int left = solve(matrix, i + 1, j - 1);
//         int right = solve(matrix, i + 1, j + 1);

//         return matrix[i][j] +
//                 Math.min(down, Math.min(left, right));
//     }

//     static int minFallingPathSum(int[][] matrix) {

//         int n = matrix.length;

//         int ans = Integer.MAX_VALUE;

//         for (int j = 0; j < n; j++) {

//             ans = Math.min(ans, solve(matrix, 0, j));
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {2,1,3},
//                 {6,5,4},
//                 {7,8,9}
//         };

//         System.out.println(minFallingPathSum(matrix));
//     }
// } 


// Min Falling Path Sum(3rd Approach Tabulation)
// public class Main {

//     static int minFallingPathSum(int[][] matrix) {

//         int n = matrix.length;

//         int[][] dp = new int[n][n];

//         for (int j = 0; j < n; j++)
//             dp[n - 1][j] = matrix[n - 1][j];

//         for (int i = n - 2; i >= 0; i--) {

//             for (int j = 0; j < n; j++) {

//                 int down = dp[i + 1][j];

//                 int left = (j > 0)
//                         ? dp[i + 1][j - 1]
//                         : Integer.MAX_VALUE;

//                 int right = (j < n - 1)
//                         ? dp[i + 1][j + 1]
//                         : Integer.MAX_VALUE;

//                 dp[i][j] = matrix[i][j] +
//                         Math.min(down,
//                                 Math.min(left, right));
//             }
//         }

//         int ans = Integer.MAX_VALUE;

//         for (int j = 0; j < n; j++)
//             ans = Math.min(ans, dp[0][j]);

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {2,1,3},
//                 {6,5,4},
//                 {7,8,9}
//         };

//         System.out.println(minFallingPathSum(matrix));
//     }
// }


// Min Falling Path Sum(Space Optimized)
// public class Main {

//     static int minFallingPathSum(int[][] matrix) {

//         int n = matrix.length;

//         int[] front = matrix[n - 1].clone();

//         for (int i = n - 2; i >= 0; i--) {

//             int[] curr = new int[n];

//             for (int j = 0; j < n; j++) {

//                 int down = front[j];

//                 int left = (j > 0)
//                         ? front[j - 1]
//                         : Integer.MAX_VALUE;

//                 int right = (j < n - 1)
//                         ? front[j + 1]
//                         : Integer.MAX_VALUE;

//                 curr[j] = matrix[i][j] +
//                         Math.min(down,
//                                 Math.min(left, right));
//             }

//             front = curr;
//         }

//         int ans = Integer.MAX_VALUE;

//         for (int value : front)
//             ans = Math.min(ans, value);

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {2,1,3},
//                 {6,5,4},
//                 {7,8,9}
//         };

//         System.out.println(minFallingPathSum(matrix));
//     }
// }


// House Robber Problem (1st Approach)
// public class Main {

//     static int solve(int[] nums, int index) {

//         if (index == 0)
//             return nums[0];

//         if (index < 0)
//             return 0;

//         int pick = nums[index] + solve(nums, index - 2);

//         int notPick = solve(nums, index - 1);

//         return Math.max(pick, notPick);
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,7,9,3,1};

//         System.out.println(
//                 solve(nums, nums.length - 1)
//         );
//     }
// }


// House Robbe (2nd Approach)
// import java.util.Arrays;

// public class Main {

//     static int solve(int[] nums, int index, int[] dp) {

//         if (index == 0)
//             return nums[0];

//         if (index < 0)
//             return 0;

//         if (dp[index] != -1)
//             return dp[index];

//         int pick =
//                 nums[index] +
//                 solve(nums, index - 2, dp);

//         int notPick =
//                 solve(nums, index - 1, dp);

//         dp[index] =
//                 Math.max(pick, notPick);

//         return dp[index];
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,7,9,3,1};

//         int[] dp = new int[nums.length];

//         Arrays.fill(dp, -1);

//         System.out.println(
//                 solve(nums, nums.length - 1, dp)
//         );
//     }
// }


// House (3rd Apprach)
// public class Main {

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] dp = new int[n];

//         dp[0] = nums[0];

//         dp[1] = Math.max(nums[0], nums[1]);

//         for (int i = 2; i < n; i++) {

//             int pick =
//                     nums[i] + dp[i - 2];

//             int notPick =
//                     dp[i - 1];

//             dp[i] = Math.max(pick, notPick);
//         }

//         return dp[n - 1];
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,7,9,3,1};

//         System.out.println(
//                 rob(nums)
//         );
//     }
// }


// House Robber (4th Approach)
// public class Main {

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] dp = new int[n];

//         dp[0] = nums[0];

//         dp[1] = Math.max(nums[0], nums[1]);

//         for (int i = 2; i < n; i++) {

//             int pick =
//                     nums[i] + dp[i - 2];

//             int notPick =
//                     dp[i - 1];

//             dp[i] = Math.max(pick, notPick);
//         }

//         return dp[n - 1];
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,7,9,3,1};

//         System.out.println(
//                 rob(nums)
//         );
//     }
// }
// 
// 
// House Robber 2 (Recursion)
// public class Main {

//     static int solve(int[] nums, int index) {

//         if (index == 0)
//             return nums[0];

//         if (index < 0)
//             return 0;

//         int pick = nums[index] + solve(nums, index - 2);

//         int notPick = solve(nums, index - 1);

//         return Math.max(pick, notPick);
//     }

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] first = new int[n - 1];
//         int[] second = new int[n - 1];

//         for (int i = 0; i < n - 1; i++)
//             first[i] = nums[i];

//         for (int i = 1; i < n; i++)
//             second[i - 1] = nums[i];

//         return Math.max(
//                 solve(first, first.length - 1),
//                 solve(second, second.length - 1)
//         );
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,3,2};

//         System.out.println(rob(nums));
//     }
// }
// 
// 
// House Robber 2 (2nd Approach)
// import java.util.Arrays;

// public class Main {

//     static int solve(int[] nums, int index, int[] dp) {

//         if (index == 0)
//             return nums[0];

//         if (index < 0)
//             return 0;

//         if (dp[index] != -1)
//             return dp[index];

//         int pick = nums[index] + solve(nums, index - 2, dp);

//         int notPick = solve(nums, index - 1, dp);

//         return dp[index] = Math.max(pick, notPick);
//     }

//     static int helper(int[] arr) {

//         int[] dp = new int[arr.length];

//         Arrays.fill(dp, -1);

//         return solve(arr, arr.length - 1, dp);
//     }

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] first = Arrays.copyOfRange(nums, 0, n - 1);

//         int[] second = Arrays.copyOfRange(nums, 1, n);

//         return Math.max(helper(first), helper(second));
//     }

//     public static void main(String[] args) {

//         int[] nums = {2,3,2};

//         System.out.println(rob(nums));
//     }
// }
// 
// 
// House Robber 2 (3rd Approach Tabulation)
// import java.util.Arrays;

// public class Main {

//     static int helper(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] dp = new int[n];

//         dp[0] = nums[0];

//         dp[1] = Math.max(nums[0], nums[1]);

//         for (int i = 2; i < n; i++) {

//             int pick = nums[i] + dp[i - 2];

//             int notPick = dp[i - 1];

//             dp[i] = Math.max(pick, notPick);
//         }

//         return dp[n - 1];
//     }

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] first = Arrays.copyOfRange(nums, 0, n - 1);

//         int[] second = Arrays.copyOfRange(nums, 1, n);

//         return Math.max(helper(first), helper(second));
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,2,3,1};

//         System.out.println(rob(nums));
//     }
// }
// 
// 
// House Robber (Space optimized)
// import java.util.Arrays;

// public class Main {

//     static int helper(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int prev2 = nums[0];

//         int prev1 = Math.max(nums[0], nums[1]);

//         for (int i = 2; i < n; i++) {

//             int pick = nums[i] + prev2;

//             int notPick = prev1;

//             int curr = Math.max(pick, notPick);

//             prev2 = prev1;
//             prev1 = curr;
//         }

//         return prev1;
//     }

//     static int rob(int[] nums) {

//         int n = nums.length;

//         if (n == 1)
//             return nums[0];

//         int[] first = Arrays.copyOfRange(nums, 0, n - 1);

//         int[] second = Arrays.copyOfRange(nums, 1, n);

//         return Math.max(helper(first), helper(second));
//     }

//     public static void main(String[] args) {

//         int[] nums = {1,2,3,1};

//         System.out.println(rob(nums));
//     }
// 
// 
// Min Cost Climbing Stairs
// public class Main {

//     static int solve(int[] cost, int index) {

//         if (index == 0)
//             return cost[0];

//         if (index == 1)
//             return cost[1];

//         return cost[index] +
//                 Math.min(
//                         solve(cost, index - 1),
//                         solve(cost, index - 2)
//                 );
//     }

//     static int minCostClimbingStairs(int[] cost) {

//         int n = cost.length;

//         return Math.min(
//                 solve(cost, n - 1),
//                 solve(cost, n - 2)
//         );
//     }

//     public static void main(String[] args) {

//         int[] cost = {10,15,20};

//         System.out.println(
//                 minCostClimbingStairs(cost)
//         );
//     }
// }
// 
// 
// Min Cost Climbing Stairs 2nd Approach
// public class Main {

//     static int solve(int[] cost, int index) {

//         if (index == 0)
//             return cost[0];

//         if (index == 1)
//             return cost[1];

//         return cost[index] +
//                 Math.min(
//                         solve(cost, index - 1),
//                         solve(cost, index - 2)
//                 );
//     }

//     static int minCostClimbingStairs(int[] cost) {

//         int n = cost.length;

//         return Math.min(
//                 solve(cost, n - 1),
//                 solve(cost, n - 2)
//         );
//     }

//     public static void main(String[] args) {

//         int[] cost = {10,15,20};

//         System.out.println(
//                 minCostClimbingStairs(cost)
//         );
//     }
// }
// 
// 
// 3rd Approach
// public class Main {

//     static int minCostClimbingStairs(int[] cost) {

//         int n = cost.length;

//         int[] dp = new int[n];

//         dp[0] = cost[0];
//         dp[1] = cost[1];

//         for (int i = 2; i < n; i++) {

//             dp[i] = cost[i] +
//                     Math.min(dp[i - 1], dp[i - 2]);
//         }

//         return Math.min(dp[n - 1], dp[n - 2]);
//     }

//     public static void main(String[] args) {

//         int[] cost = {10,15,20};

//         System.out.println(
//                 minCostClimbingStairs(cost)
//         );
//     }
// }
// 
// 
// 4th Approach
// public class Main {

//     static int minCostClimbingStairs(int[] cost) {

//         int n = cost.length;

//         int prev2 = cost[0];
//         int prev1 = cost[1];

//         for (int i = 2; i < n; i++) {

//             int curr = cost[i] +
//                     Math.min(prev1, prev2);

//             prev2 = prev1;
//             prev1 = curr;
//         }

//         return Math.min(prev1, prev2);
//     }

//     public static void main(String[] args) {

//         int[] cost = {10,15,20};

//         System.out.println(
//                 minCostClimbingStairs(cost)
//         );
//     }
// }
// 
// 
// Coin Change (Recursion)
// public class Main {

//     static int solve(int index, int[] coins, int amount) {

//         if (index == 0) {

//             if (amount % coins[0] == 0)
//                 return amount / coins[0];

//             return (int)1e9;
//         }

//         int notTake = solve(index - 1, coins, amount);

//         int take = (int)1e9;

//         if (coins[index] <= amount) {

//             take = 1 + solve(index,
//                     coins,
//                     amount - coins[index]);
//         }

//         return Math.min(take, notTake);
//     }

//     static int coinChange(int[] coins, int amount) {

//         int ans = solve(coins.length - 1,
//                 coins,
//                 amount);

//         if (ans >= 1e9)
//             return -1;

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         int amount = 11;

//         System.out.println(
//                 coinChange(coins, amount)
//         );
//     }
// }
// 
// 
// 2nd Approach
// import java.util.Arrays;

// public class Main {

//     static int solve(int index,
//                      int[] coins,
//                      int amount,
//                      int[][] dp) {

//         if (index == 0) {

//             if (amount % coins[0] == 0)
//                 return amount / coins[0];

//             return (int)1e9;
//         }

//         if (dp[index][amount] != -1)
//             return dp[index][amount];

//         int notTake =
//                 solve(index - 1,
//                         coins,
//                         amount,
//                         dp);

//         int take = (int)1e9;

//         if (coins[index] <= amount)

//             take = 1 +
//                     solve(index,
//                             coins,
//                             amount - coins[index],
//                             dp);

//         return dp[index][amount] =
//                 Math.min(take, notTake);
//     }

//     static int coinChange(int[] coins,
//                           int amount) {

//         int[][] dp =
//                 new int[coins.length][amount + 1];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         int ans =
//                 solve(coins.length - 1,
//                         coins,
//                         amount,
//                         dp);

//         if (ans >= 1e9)
//             return -1;

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(
//                 coinChange(coins,11)
//         );
//     }
// }
// 
// 
// 3rd Approach Tabulation
// import java.util.Arrays;

// public class Main {

//     static int solve(int index,
//                      int[] coins,
//                      int amount,
//                      int[][] dp) {

//         if (index == 0) {

//             if (amount % coins[0] == 0)
//                 return amount / coins[0];

//             return (int)1e9;
//         }

//         if (dp[index][amount] != -1)
//             return dp[index][amount];

//         int notTake =
//                 solve(index - 1,
//                         coins,
//                         amount,
//                         dp);

//         int take = (int)1e9;

//         if (coins[index] <= amount)

//             take = 1 +
//                     solve(index,
//                             coins,
//                             amount - coins[index],
//                             dp);

//         return dp[index][amount] =
//                 Math.min(take, notTake);
//     }

//     static int coinChange(int[] coins,
//                           int amount) {

//         int[][] dp =
//                 new int[coins.length][amount + 1];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         int ans =
//                 solve(coins.length - 1,
//                         coins,
//                         amount,
//                         dp);

//         if (ans >= 1e9)
//             return -1;

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(
//                 coinChange(coins,11)
//         );
//     }
// }
// 
// 
// Space optimized
// import java.util.Arrays;

// public class Main {

//     static int coinChange(int[] coins, int amount) {

//         int n = coins.length;

//         int[] prev = new int[amount + 1];

//         for (int target = 0; target <= amount; target++) {

//             if (target % coins[0] == 0)
//                 prev[target] = target / coins[0];
//             else
//                 prev[target] = (int)1e9;
//         }

//         for (int i = 1; i < n; i++) {

//             int[] curr = new int[amount + 1];

//             for (int target = 0; target <= amount; target++) {

//                 int notTake = prev[target];

//                 int take = (int)1e9;

//                 if (coins[i] <= target)
//                     take = 1 + curr[target - coins[i]];

//                 curr[target] = Math.min(take, notTake);
//             }

//             prev = curr;
//         }

//         return prev[amount] >= 1e9 ? -1 : prev[amount];
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         int amount = 11;

//         System.out.println(
//                 coinChange(coins, amount)
//         );
//     }
// }
// 
// 
// Coin Change 2 (Recursion)
// public class Main {

//     static int solve(int index, int[] coins, int amount) {

//         if (index == 0) {

//             if (amount % coins[0] == 0)
//                 return 1;

//             return 0;
//         }

//         int notTake = solve(index - 1, coins, amount);

//         int take = 0;

//         if (coins[index] <= amount)

//             take = solve(index,
//                     coins,
//                     amount - coins[index]);

//         return take + notTake;
//     }

//     static int change(int amount, int[] coins) {

//         return solve(coins.length - 1,
//                 coins,
//                 amount);
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(
//                 change(5, coins)
//         );
//     }
// }
// 
// 
// Coin Change 2 (Memoization)
// import java.util.Arrays;

// public class Main {

//     static int solve(int index,
//                      int[] coins,
//                      int amount,
//                      int[][] dp) {

//         if (index == 0) {

//             if (amount % coins[0] == 0)
//                 return 1;

//             return 0;
//         }

//         if (dp[index][amount] != -1)
//             return dp[index][amount];

//         int notTake =
//                 solve(index - 1,
//                         coins,
//                         amount,
//                         dp);

//         int take = 0;

//         if (coins[index] <= amount)

//             take =
//                     solve(index,
//                             coins,
//                             amount - coins[index],
//                             dp);

//         return dp[index][amount] =
//                 take + notTake;
//     }

//     static int change(int amount,
//                       int[] coins) {

//         int[][] dp =
//                 new int[coins.length][amount + 1];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         return solve(coins.length - 1,
//                 coins,
//                 amount,
//                 dp);
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(
//                 change(5, coins)
//         );
//     }
// }
// 
// 
// Coin Change 2 (Tabulation)
// public class Main {

//     static int change(int amount, int[] coins) {

//         int n = coins.length;

//         int[][] dp = new int[n][amount + 1];

//         for (int target = 0; target <= amount; target++) {

//             if (target % coins[0] == 0)
//                 dp[0][target] = 1;
//         }

//         for (int i = 1; i < n; i++) {

//             for (int target = 0; target <= amount; target++) {

//                 int notTake = dp[i - 1][target];

//                 int take = 0;

//                 if (coins[i] <= target)

//                     take = dp[i][target - coins[i]];

//                 dp[i][target] = take + notTake;
//             }
//         }

//         return dp[n - 1][amount];
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(change(5, coins));
//     }
// }
// 
// 
// Coin Change 2 (Space optimization)
// public class Main {

//     static int change(int amount, int[] coins) {

//         int n = coins.length;

//         int[] prev = new int[amount + 1];

//         for (int target = 0; target <= amount; target++) {

//             if (target % coins[0] == 0)
//                 prev[target] = 1;
//         }

//         for (int i = 1; i < n; i++) {

//             int[] curr = new int[amount + 1];

//             for (int target = 0; target <= amount; target++) {

//                 int notTake = prev[target];

//                 int take = 0;

//                 if (coins[i] <= target)

//                     take = curr[target - coins[i]];

//                 curr[target] = take + notTake;
//             }

//             prev = curr;
//         }

//         return prev[amount];
//     }

//     public static void main(String[] args) {

//         int[] coins = {1,2,5};

//         System.out.println(change(5, coins));
//     }
// }
// 
// 
// Longest Inc Seq - Recursion
// public class Main {

//     static int solve(int index, int prev, int[] nums) {

//         if (index == nums.length)
//             return 0;

//         int notTake = solve(index + 1, prev, nums);

//         int take = 0;

//         if (prev == -1 || nums[index] > nums[prev]) {

//             take = 1 + solve(index + 1, index, nums);
//         }

//         return Math.max(take, notTake);
//     }

//     public static void main(String[] args) {

//         int[] nums = {10,9,2,5,3,7,101,18};

//         System.out.println(
//                 solve(0,-1,nums)
//         );
//     }
// }
// 
// 
// Longest Inc Seq - Memoization
// import java.util.Arrays;

// public class Main {

//     static int solve(int index,
//                      int prev,
//                      int[] nums,
//                      int[][] dp) {

//         if(index==nums.length)
//             return 0;

//         if(dp[index][prev+1]!=-1)
//             return dp[index][prev+1];

//         int notTake =
//                 solve(index+1,
//                         prev,
//                         nums,
//                         dp);

//         int take=0;

//         if(prev==-1 || nums[index]>nums[prev])

//             take=1+
//                     solve(index+1,
//                             index,
//                             nums,
//                             dp);

//         return dp[index][prev+1]=
//                 Math.max(take,notTake);
//     }

//     public static void main(String[] args){

//         int[] nums={10,9,2,5,3,7,101,18};

//         int[][] dp=
//                 new int[nums.length][nums.length+1];

//         for(int[] row:dp)
//             Arrays.fill(row,-1);

//         System.out.println(
//                 solve(0,-1,nums,dp)
//         );
//     }
// }
// 
// 
// Longest Increase Sequence - Tabulation
// import java.util.Arrays;

// public class Main {

//     static int lengthOfLIS(int[] nums) {

//         int n = nums.length;

//         int[] dp = new int[n];

//         Arrays.fill(dp,1);

//         int ans = 1;

//         for(int i=0;i<n;i++) {

//             for(int j=0;j<i;j++) {

//                 if(nums[j] < nums[i]) {

//                     dp[i] = Math.max(dp[i],
//                             dp[j]+1);
//                 }
//             }

//             ans = Math.max(ans,dp[i]);
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] nums = {10,9,2,5,3,7,101,18};

//         System.out.println(
//                 lengthOfLIS(nums)
//         );
//     }
// }
// 
// 
// Longest Increase Sequence -(Binary Search)
// import java.util.*;

// public class Main {

//     static int lengthOfLIS(int[] nums) {

//         ArrayList<Integer> list =
//                 new ArrayList<>();

//         for(int num : nums) {

//             int pos =
//                     Collections.binarySearch(
//                             list,
//                             num);

//             if(pos < 0)
//                 pos = -(pos + 1);

//             if(pos == list.size())

//                 list.add(num);

//             else

//                 list.set(pos,num);
//         }

//         return list.size();
//     }

//     public static void main(String[] args) {

//         int[] nums =
//                 {10,9,2,5,3,7,101,18};

//         System.out.println(
//                 lengthOfLIS(nums)
//         );
//     }
// }
// 
// 
// Longest Increase Sequence -(Binary Search)
// import java.util.*;

// public class Main {

//     static int lengthOfLIS(int[] nums) {

//         ArrayList<Integer> list =
//                 new ArrayList<>();

//         for(int num : nums) {

//             int pos =
//                     Collections.binarySearch(
//                             list,
//                             num);

//             if(pos < 0)
//                 pos = -(pos + 1);

//             if(pos == list.size())

//                 list.add(num);

//             else

//                 list.set(pos,num);
//         }

//         return list.size();
//     }

//     public static void main(String[] args) {

//         int[] nums =
//                 {10,9,2,5,3,7,101,18};

//         System.out.println(
//                 lengthOfLIS(nums)
//         );
//     }
// }
// 
// 
// Longest common Sequences(LCS)
// public class Main {

//     static int solve(String s1,
//                      String s2,
//                      int i,
//                      int j) {

//         if(i < 0 || j < 0)
//             return 0;

//         if(s1.charAt(i) == s2.charAt(j))

//             return 1 +
//                     solve(s1,s2,i-1,j-1);

//         return Math.max(

//                 solve(s1,s2,i-1,j),

//                 solve(s1,s2,i,j-1)

//         );
//     }

//     public static void main(String[] args) {

//         String s1="abcde";
//         String s2="ace";

//         System.out.println(

//                 solve(s1,s2,
//                         s1.length()-1,
//                         s2.length()-1)

//         );
//     }
// }
// 
// 
// Longest common Sequences(LCS) 2nd Approach
// import java.util.Arrays;

// public class Main {

//     static int solve(String s1,
//                      String s2,
//                      int i,
//                      int j,
//                      int[][] dp){

//         if(i<0 || j<0)
//             return 0;

//         if(dp[i][j]!=-1)
//             return dp[i][j];

//         if(s1.charAt(i)==s2.charAt(j))

//             return dp[i][j]=

//                     1+

//                     solve(s1,s2,i-1,j-1,dp);

//         return dp[i][j]=

//                 Math.max(

//                         solve(s1,s2,i-1,j,dp),

//                         solve(s1,s2,i,j-1,dp)

//                 );
//     }

//     public static void main(String[] args){

//         String s1="abcde";
//         String s2="ace";

//         int[][] dp=

//                 new int[s1.length()][s2.length()];

//         for(int[] row:dp)

//             Arrays.fill(row,-1);

//         System.out.println(

//                 solve(s1,s2,

//                         s1.length()-1,

//                         s2.length()-1,

//                         dp)

//         );
//     }
// }
// 
// 
// Longest common Sequences(LCS) 3rd Approach
// public class Main {

//     static int lcs(String s1,String s2){

//         int n=s1.length();

//         int m=s2.length();

//         int[][] dp=new int[n+1][m+1];

//         for(int i=1;i<=n;i++){

//             for(int j=1;j<=m;j++){

//                 if(s1.charAt(i-1)==s2.charAt(j-1))

//                     dp[i][j]=
//                             1+
//                                     dp[i-1][j-1];

//                 else

//                     dp[i][j]=

//                             Math.max(

//                                     dp[i-1][j],

//                                     dp[i][j-1]

//                             );
//             }
//         }

//         return dp[n][m];
//     }

//     public static void main(String[] args){

//         String s1="abcde";

//         String s2="ace";

//         System.out.println(

//                 lcs(s1,s2)

//         );
//     }
// }
// 
// 
// Longest common Sequences(LCS) Space Optimization
// public class Main {

//     static int lcs(String s1,String s2){

//         int n=s1.length();

//         int m=s2.length();

//         int[] prev=new int[m+1];

//         for(int i=1;i<=n;i++){

//             int[] curr=new int[m+1];

//             for(int j=1;j<=m;j++){

//                 if(s1.charAt(i-1)==s2.charAt(j-1))

//                     curr[j]=
//                             1+
//                                     prev[j-1];

//                 else

//                     curr[j]=

//                             Math.max(

//                                     prev[j],

//                                     curr[j-1]

//                             );
//             }

//             prev=curr;
//         }

//         return prev[m];
//     }

//     public static void main(String[] args){

//         String s1="abcde";

//         String s2="ace";

//         System.out.println(

//                 lcs(s1,s2)

//         );
//     }
// }
// 
// 
// Edit Distance(Recursion)
// public class Main {

//     static int solve(String s1, String s2, int i, int j) {

//         if (i < 0)
//             return j + 1;

//         if (j < 0)
//             return i + 1;

//         if (s1.charAt(i) == s2.charAt(j))
//             return solve(s1, s2, i - 1, j - 1);

//         int insert = 1 + solve(s1, s2, i, j - 1);

//         int delete = 1 + solve(s1, s2, i - 1, j);

//         int replace = 1 + solve(s1, s2, i - 1, j - 1);

//         return Math.min(insert, Math.min(delete, replace));
//     }

//     public static void main(String[] args) {

//         String word1 = "horse";
//         String word2 = "ros";

//         System.out.println(
//                 solve(word1, word2,
//                         word1.length() - 1,
//                         word2.length() - 1));
//     }
// }
// 
// 
// Edit Distance (Recursion)
// import java.util.Arrays;

// public class Main {

//     static int solve(String s1, String s2,
//                      int i, int j,
//                      int[][] dp) {

//         if (i < 0)
//             return j + 1;

//         if (j < 0)
//             return i + 1;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         if (s1.charAt(i) == s2.charAt(j))
//             return dp[i][j] =
//                     solve(s1, s2, i - 1, j - 1, dp);

//         int insert = 1 + solve(s1, s2, i, j - 1, dp);

//         int delete = 1 + solve(s1, s2, i - 1, j, dp);

//         int replace = 1 + solve(s1, s2, i - 1, j - 1, dp);

//         return dp[i][j] =
//                 Math.min(insert,
//                         Math.min(delete, replace));
//     }

//     public static void main(String[] args) {

//         String s1 = "horse";
//         String s2 = "ros";

//         int[][] dp =
//                 new int[s1.length()][s2.length()];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         System.out.println(
//                 solve(s1, s2,
//                         s1.length() - 1,
//                         s2.length() - 1,
//                         dp));
//     }
// }
// 
// 
// Edit Distance (Tabulation)
// public class Main {

//     static int minDistance(String s1, String s2) {

//         int n = s1.length();
//         int m = s2.length();

//         int[][] dp = new int[n + 1][m + 1];

//         for (int i = 0; i <= n; i++)
//             dp[i][0] = i;

//         for (int j = 0; j <= m; j++)
//             dp[0][j] = j;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

//                 if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

//                     dp[i][j] = dp[i - 1][j - 1];

//                 } else {

//                     int insert = dp[i][j - 1];

//                     int delete = dp[i - 1][j];

//                     int replace = dp[i - 1][j - 1];

//                     dp[i][j] =
//                             1 + Math.min(insert,
//                                     Math.min(delete, replace));
//                 }
//             }
//         }

//         return dp[n][m];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 minDistance("horse", "ros"));
//     }
// }
// 
// 
// Edit Distance - (Space Optimized)
// public class Main {

//     static int minDistance(String s1, String s2) {

//         int n = s1.length();
//         int m = s2.length();

//         int[] prev = new int[m + 1];

//         for (int j = 0; j <= m; j++)
//             prev[j] = j;

//         for (int i = 1; i <= n; i++) {

//             int[] curr = new int[m + 1];
//             curr[0] = i;

//             for (int j = 1; j <= m; j++) {

//                 if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

//                     curr[j] = prev[j - 1];

//                 } else {

//                     curr[j] = 1 + Math.min(
//                             curr[j - 1],                // Insert
//                             Math.min(
//                                     prev[j],            // Delete
//                                     prev[j - 1]         // Replace
//                             )
//                     );
//                 }
//             }

//             prev = curr;
//         }

//         return prev[m];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 minDistance("horse", "ros"));
//     }
// }
// 
// 
// Longest Palindrome SubSequence (Recursion)
// public class Main {

//     static int solve(String s1, String s2, int i, int j) {

//         if (i < 0 || j < 0)
//             return 0;

//         if (s1.charAt(i) == s2.charAt(j))
//             return 1 + solve(s1, s2, i - 1, j - 1);

//         return Math.max(
//                 solve(s1, s2, i - 1, j),
//                 solve(s1, s2, i, j - 1)
//         );
//     }

//     public static void main(String[] args) {

//         String s = "bbbab";

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         System.out.println(
//                 solve(s, rev,
//                         s.length() - 1,
//                         rev.length() - 1)
//         );
//     }
// }
// 
// 
// Longest Palindrome Subsequence (Memoization)
// public class Main {

//     static int solve(String s1, String s2, int i, int j) {

//         if (i < 0 || j < 0)
//             return 0;

//         if (s1.charAt(i) == s2.charAt(j))
//             return 1 + solve(s1, s2, i - 1, j - 1);

//         return Math.max(
//                 solve(s1, s2, i - 1, j),
//                 solve(s1, s2, i, j - 1)
//         );
//     }

//     public static void main(String[] args) {

//         String s = "bbbab";

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         System.out.println(
//                 solve(s, rev,
//                         s.length() - 1,
//                         rev.length() - 1)
//         );
//     }
// }
// 
// 
// Longest Palindrome Subsequence (Tabultion)
// public class Main {

//     static int longestPalindromeSubseq(String s) {

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         int n = s.length();

//         int[][] dp =
//                 new int[n + 1][n + 1];

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n; j++) {

//                 if (s.charAt(i - 1) == rev.charAt(j - 1))

//                     dp[i][j] =
//                             1 + dp[i - 1][j - 1];

//                 else

//                     dp[i][j] =
//                             Math.max(
//                                     dp[i - 1][j],
//                                     dp[i][j - 1]
//                             );
//             }
//         }

//         return dp[n][n];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 longestPalindromeSubseq("bbbab")
//         );
//     }
// }
// 
// 
// Longest Palindrome Subsequence (Space-Optimized)
// public class Main {

//     static int longestPalindromeSubseq(String s) {

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         int n = s.length();

//         int[] prev =
//                 new int[n + 1];

//         for (int i = 1; i <= n; i++) {

//             int[] curr =
//                     new int[n + 1];

//             for (int j = 1; j <= n; j++) {

//                 if (s.charAt(i - 1) == rev.charAt(j - 1))

//                     curr[j] =
//                             1 + prev[j - 1];

//                 else

//                     curr[j] =
//                             Math.max(
//                                     prev[j],
//                                     curr[j - 1]
//                             );
//             }

//             prev = curr;
//         }

//         return prev[n];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 longestPalindromeSubseq("bbbab")
//         );
//     }
// }
// 
// 
// Delete Operations for Two Strings (Tabulation)
// public class Main {

//     static int lcs(String s1, String s2) {

//         int n = s1.length();
//         int m = s2.length();

//         int[][] dp = new int[n + 1][m + 1];

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

//                 if (s1.charAt(i - 1) == s2.charAt(j - 1))

//                     dp[i][j] = 1 + dp[i - 1][j - 1];

//                 else

//                     dp[i][j] = Math.max(
//                             dp[i - 1][j],
//                             dp[i][j - 1]
//                     );
//             }
//         }

//         return dp[n][m];
//     }

//     static int minDistance(String word1, String word2) {

//         int common = lcs(word1, word2);

//         return word1.length()
//                 + word2.length()
//                 - 2 * common;
//     }

//     public static void main(String[] args) {

//         String word1 = "sea";
//         String word2 = "eat";

//         System.out.println(
//                 minDistance(word1, word2)
//         );
//     }
// }
// 
// 
// Deletion Pperations for Two Strings (Space-optimized)
// public class Main {

//     static int lcs(String s1, String s2) {

//         int n = s1.length();
//         int m = s2.length();

//         int[] prev = new int[m + 1];

//         for (int i = 1; i <= n; i++) {

//             int[] curr = new int[m + 1];

//             for (int j = 1; j <= m; j++) {

//                 if (s1.charAt(i - 1) == s2.charAt(j - 1))

//                     curr[j] = 1 + prev[j - 1];

//                 else

//                     curr[j] = Math.max(
//                             prev[j],
//                             curr[j - 1]
//                     );
//             }

//             prev = curr;
//         }

//         return prev[m];
//     }

//     static int minDistance(String word1, String word2) {

//         return word1.length()
//                 + word2.length()
//                 - 2 * lcs(word1, word2);
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 minDistance("sea", "eat")
//         );
//     }
// }
// 
// 
// Shortest common Subsequence (Tabulation + Reconstruction) Hard Ques
// public class Main {

//     static String shortestCommonSupersequence(String str1, String str2) {

//         int n = str1.length();
//         int m = str2.length();

//         int[][] dp = new int[n + 1][m + 1];

//         // Build LCS table
//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

//                 if (str1.charAt(i - 1) == str2.charAt(j - 1))

//                     dp[i][j] = 1 + dp[i - 1][j - 1];

//                 else

//                     dp[i][j] = Math.max(
//                             dp[i - 1][j],
//                             dp[i][j - 1]
//                     );
//             }
//         }

//         StringBuilder ans = new StringBuilder();

//         int i = n;
//         int j = m;

//         while (i > 0 && j > 0) {

//             if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

//                 ans.append(str1.charAt(i - 1));
//                 i--;
//                 j--;

//             } else if (dp[i - 1][j] > dp[i][j - 1]) {

//                 ans.append(str1.charAt(i - 1));
//                 i--;

//             } else {

//                 ans.append(str2.charAt(j - 1));
//                 j--;
//             }
//         }

//         while (i > 0) {
//             ans.append(str1.charAt(i - 1));
//             i--;
//         }

//         while (j > 0) {
//             ans.append(str2.charAt(j - 1));
//             j--;
//         }

//         return ans.reverse().toString();
//     }

//     public static void main(String[] args) {

//         String str1 = "abac";
//         String str2 = "cab";

//         System.out.println(shortestCommonSupersequence(str1, str2));
//     }
// }
// 
// 
// Distinct-Subsequences (Recursion)
// public class Main {

//     static int solve(String s, String t, int i, int j) {

//         if (j < 0)
//             return 1;

//         if (i < 0)
//             return 0;

//         if (s.charAt(i) == t.charAt(j)) {

//             return solve(s, t, i - 1, j - 1)
//                     + solve(s, t, i - 1, j);
//         }

//         return solve(s, t, i - 1, j);
//     }

//     public static void main(String[] args) {

//         String s = "rabbbit";
//         String t = "rabbit";

//         System.out.println(
//                 solve(s, t,
//                         s.length() - 1,
//                         t.length() - 1)
//         );
//     }
// }
// 
// 
// Distinct-Solution (Memoization)
// import java.util.Arrays;

// public class Main {

//     static int solve(String s, String t,
//                      int i, int j,
//                      int[][] dp) {

//         if (j < 0)
//             return 1;

//         if (i < 0)
//             return 0;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         if (s.charAt(i) == t.charAt(j)) {

//             return dp[i][j] =
//                     solve(s, t, i - 1, j - 1, dp)
//                     + solve(s, t, i - 1, j, dp);
//         }

//         return dp[i][j] =
//                 solve(s, t, i - 1, j, dp);
//     }

//     public static void main(String[] args) {

//         String s = "rabbbit";
//         String t = "rabbit";

//         int[][] dp =
//                 new int[s.length()][t.length()];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         System.out.println(
//                 solve(s, t,
//                         s.length() - 1,
//                         t.length() - 1,
//                         dp)
//         );
//     }
// }
// 
// 
// Distinct-Subsequence (Tabulation)
// public class Main {

//     static int numDistinct(String s, String t) {

//         int n = s.length();
//         int m = t.length();

//         int[][] dp = new int[n + 1][m + 1];

//         for (int i = 0; i <= n; i++)
//             dp[i][0] = 1;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= m; j++) {

//                 if (s.charAt(i - 1) == t.charAt(j - 1)) {

//                     dp[i][j] =
//                             dp[i - 1][j - 1]
//                             + dp[i - 1][j];

//                 } else {

//                     dp[i][j] =
//                             dp[i - 1][j];
//                 }
//             }
//         }

//         return dp[n][m];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 numDistinct("rabbbit", "rabbit")
//         );
//     }
// }
// 
// 
// Distinct Subsequences (Space-Optimized)
// public class Main {

//     static int numDistinct(String s, String t) {

//         int n = s.length();
//         int m = t.length();

//         int[] dp = new int[m + 1];
//         dp[0] = 1;

//         for (int i = 1; i <= n; i++) {

//             for (int j = m; j >= 1; j--) {

//                 if (s.charAt(i - 1) == t.charAt(j - 1)) {

//                     dp[j] = dp[j] + dp[j - 1];
//                 }
//             }
//         }

//         return dp[m];
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 numDistinct("rabbbit", "rabbit")
//         );
//     }
// }
// 
// 
// Minimum Insertion Steps to Make a String Palindrome (Tabulation)
// public class Main {

//     static int longestPalindromeSubseq(String s) {

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         int n = s.length();

//         int[][] dp = new int[n + 1][n + 1];

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= n; j++) {

//                 if (s.charAt(i - 1) == rev.charAt(j - 1)) {

//                     dp[i][j] = 1 + dp[i - 1][j - 1];

//                 } else {

//                     dp[i][j] = Math.max(
//                             dp[i - 1][j],
//                             dp[i][j - 1]
//                     );
//                 }
//             }
//         }

//         return dp[n][n];
//     }

//     static int minInsertions(String s) {

//         return s.length() - longestPalindromeSubseq(s);
//     }

//     public static void main(String[] args) {

//         String s = "mbadm";

//         System.out.println(
//                 minInsertions(s)
//         );
//     }
// }
// 
// 
// Minimum Insertion Steps to Make a String Palindrome (Space-Optimized)
// public class Main {

//     static int longestPalindromeSubseq(String s) {

//         String rev =
//                 new StringBuilder(s).reverse().toString();

//         int n = s.length();

//         int[] prev = new int[n + 1];

//         for (int i = 1; i <= n; i++) {

//             int[] curr = new int[n + 1];

//             for (int j = 1; j <= n; j++) {

//                 if (s.charAt(i - 1) == rev.charAt(j - 1)) {

//                     curr[j] = 1 + prev[j - 1];

//                 } else {

//                     curr[j] = Math.max(
//                             prev[j],
//                             curr[j - 1]
//                     );
//                 }
//             }

//             prev = curr;
//         }

//         return prev[n];
//     }

//     static int minInsertions(String s) {

//         return s.length() - longestPalindromeSubseq(s);
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 minInsertions("leetcode")
//         );
//     }
// }
// 
// 
// Palindrome Partitioning II (Hard) (Recursion)
// public class Main {

//     static boolean isPalindrome(String s, int l, int r) {

//         while (l < r) {

//             if (s.charAt(l) != s.charAt(r))
//                 return false;

//             l++;
//             r--;
//         }

//         return true;
//     }

//     static int solve(String s, int i) {

//         if (i == s.length())
//             return 0;

//         int ans = Integer.MAX_VALUE;

//         for (int j = i; j < s.length(); j++) {

//             if (isPalindrome(s, i, j)) {

//                 ans = Math.min(ans,
//                         1 + solve(s, j + 1));
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         String s = "aab";

//         System.out.println(
//                 solve(s, 0) - 1
//         );
//     }
// }
// 
// 
// Palindrome Partitioning II (Memoization)
// import java.util.Arrays;

// public class Main {

//     static boolean isPalindrome(String s, int l, int r) {

//         while (l < r) {

//             if (s.charAt(l) != s.charAt(r))
//                 return false;

//             l++;
//             r--;
//         }

//         return true;
//     }

//     static int solve(String s, int i, int[] dp) {

//         if (i == s.length())
//             return 0;

//         if (dp[i] != -1)
//             return dp[i];

//         int ans = Integer.MAX_VALUE;

//         for (int j = i; j < s.length(); j++) {

//             if (isPalindrome(s, i, j)) {

//                 ans = Math.min(ans,
//                         1 + solve(s, j + 1, dp));
//             }
//         }

//         return dp[i] = ans;
//     }

//     public static void main(String[] args) {

//         String s = "aab";

//         int[] dp = new int[s.length()];

//         Arrays.fill(dp, -1);

//         System.out.println(
//                 solve(s, 0, dp) - 1
//         );
//     }
// }
// 
// 
// Palindrome Partitioning II (Tabulation)
// public class Main {

//     static boolean isPalindrome(String s, int l, int r) {

//         while (l < r) {

//             if (s.charAt(l) != s.charAt(r))
//                 return false;

//             l++;
//             r--;
//         }

//         return true;
//     }

//     static int minCut(String s) {

//         int n = s.length();

//         int[] dp = new int[n + 1];

//         dp[n] = 0;

//         for (int i = n - 1; i >= 0; i--) {

//             int ans = Integer.MAX_VALUE;

//             for (int j = i; j < n; j++) {

//                 if (isPalindrome(s, i, j)) {

//                     ans = Math.min(ans,
//                             1 + dp[j + 1]);
//                 }
//             }

//             dp[i] = ans;
//         }

//         return dp[0] - 1;
//     }

//     public static void main(String[] args) {

//         System.out.println(
//                 minCut("aab")
//         );
//     }
// }
// 
// 
// Palindrome Partitioning II (Optimized-Approach)
// public class Main {

//     static int minCut(String s) {

//         int n = s.length();

//         boolean[][] pal = new boolean[n][n];

//         for (int i = n - 1; i >= 0; i--) {
//             for (int j = i; j < n; j++) {
//                 if (s.charAt(i) == s.charAt(j)) {
//                     if (j - i <= 2 || pal[i + 1][j - 1]) {
//                         pal[i][j] = true;
//                     }
//                 }
//             }
//         }

//         int[] dp = new int[n + 1];

//         for (int i = n - 1; i >= 0; i--) {

//             int ans = Integer.MAX_VALUE;

//             for (int j = i; j < n; j++) {

//                 if (pal[i][j]) {
//                     ans = Math.min(ans, 1 + dp[j + 1]);
//                 }
//             }

//             dp[i] = ans;
//         }

//         return dp[0] - 1;
//     }

//     public static void main(String[] args) {

//         System.out.println(minCut("aab"));
//     }
// } Matrix Chain Multiplication (MCM)
// public class Main {

//     static int solve(int[] arr, int i, int j) {

//         if (i == j)
//             return 0;

//         int min = Integer.MAX_VALUE;

//         for (int k = i; k < j; k++) {

//             int cost =
//                     solve(arr, i, k)
//                     + solve(arr, k + 1, j)
//                     + arr[i - 1] * arr[k] * arr[j];

//             min = Math.min(min, cost);
//         }

//         return min;
//     }

//     public static void main(String[] args) {

//         int[] arr = {10,20,30,40,30};

//         System.out.println(
//                 solve(arr,1,arr.length-1)
//         );
//     }
// }
// 
// 
// Matrix chain Multiplication(MCM)-(Memoization)
// import java.util.Arrays;

// public class Main {

//     static int solve(int[] arr,
//                      int i,
//                      int j,
//                      int[][] dp) {

//         if (i == j)
//             return 0;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int min = Integer.MAX_VALUE;

//         for (int k = i; k < j; k++) {

//             int cost =
//                     solve(arr, i, k, dp)
//                     + solve(arr, k + 1, j, dp)
//                     + arr[i - 1] * arr[k] * arr[j];

//             min = Math.min(min, cost);
//         }

//         return dp[i][j] = min;
//     }

//     public static void main(String[] args) {

//         int[] arr = {10,20,30,40,30};

//         int n = arr.length;

//         int[][] dp = new int[n][n];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         System.out.println(
//                 solve(arr,1,n-1,dp)
//         );
//     }
// }
// 
// 
// MCM (Tabulation)
// public class Main {

//     static int matrixMultiplication(int[] arr) {

//         int n = arr.length;

//         int[][] dp = new int[n][n];

//         for (int len = 2; len < n; len++) {

//             for (int i = 1; i < n - len + 1; i++) {

//                 int j = i + len - 1;

//                 dp[i][j] = Integer.MAX_VALUE;

//                 for (int k = i; k < j; k++) {

//                     int cost =
//                             dp[i][k]
//                             + dp[k + 1][j]
//                             + arr[i - 1] * arr[k] * arr[j];

//                     dp[i][j] =
//                             Math.min(dp[i][j], cost);
//                 }
//             }
//         }

//         return dp[1][n - 1];
//     }

//     public static void main(String[] args) {

//         int[] arr = {10,20,30,40,30};

//         System.out.println(
//                 matrixMultiplication(arr)
//         );
//     }
// }
// 
// 
// Burst Balloons - Recursion
// public class Main {

//     static int solve(int[] arr, int i, int j) {

//         if (i > j)
//             return 0;

//         int ans = 0;

//         for (int k = i; k <= j; k++) {

//             int coins =
//                     solve(arr, i, k - 1)
//                     + solve(arr, k + 1, j)
//                     + arr[i - 1] * arr[k] * arr[j + 1];

//             ans = Math.max(ans, coins);
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] nums = {3,1,5,8};

//         int[] arr = new int[nums.length + 2];

//         arr[0] = 1;
//         arr[arr.length - 1] = 1;

//         for (int i = 0; i < nums.length; i++)
//             arr[i + 1] = nums[i];

//         System.out.println(
//                 solve(arr,1,nums.length)
//         );
//     }
// }
// 
// 
// Burst Balloons - Memoization
// import java.util.Arrays;

// public class Main {

//     static int solve(int[] arr, int i, int j, int[][] dp) {

//         if (i > j)
//             return 0;

//         if (dp[i][j] != -1)
//             return dp[i][j];

//         int ans = 0;

//         for (int k = i; k <= j; k++) {

//             int coins =
//                     solve(arr, i, k - 1, dp)
//                     + solve(arr, k + 1, j, dp)
//                     + arr[i - 1] * arr[k] * arr[j + 1];

//             ans = Math.max(ans, coins);
//         }

//         return dp[i][j] = ans;
//     }

//     public static void main(String[] args) {

//         int[] nums = {3,1,5,8};

//         int[] arr = new int[nums.length + 2];

//         arr[0] = 1;
//         arr[arr.length - 1] = 1;

//         for (int i = 0; i < nums.length; i++)
//             arr[i + 1] = nums[i];

//         int[][] dp = new int[arr.length][arr.length];

//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         System.out.println(
//                 solve(arr,1,nums.length,dp)
//         );
//     }
// }
// 
// 
// Burst Balloons -Tabulation
// public class Main {

//     static int maxCoins(int[] nums) {

//         int n = nums.length;

//         int[] arr = new int[n + 2];

//         arr[0] = 1;
//         arr[n + 1] = 1;

//         for (int i = 0; i < n; i++)
//             arr[i + 1] = nums[i];

//         int[][] dp = new int[n + 2][n + 2];

//         for (int len = 1; len <= n; len++) {

//             for (int i = 1; i <= n - len + 1; i++) {

//                 int j = i + len - 1;

//                 for (int k = i; k <= j; k++) {

//                     int coins =
//                             dp[i][k - 1]
//                             + dp[k + 1][j]
//                             + arr[i - 1] * arr[k] * arr[j + 1];

//                     dp[i][j] =
//                             Math.max(dp[i][j], coins);
//                 }
//             }
//         }

//         return dp[1][n];
//     }

//     public static void main(String[] args) {

//         int[] nums = {3,1,5,8};

//         System.out.println(maxCoins(nums));
//     }
// }
// 
// 
// Burst Balloons -Tabulation
// public class Main {

//     static int maxCoins(int[] nums) {

//         int n = nums.length;

//         int[] arr = new int[n + 2];

//         arr[0] = 1;
//         arr[n + 1] = 1;

//         for (int i = 0; i < n; i++)
//             arr[i + 1] = nums[i];

//         int[][] dp = new int[n + 2][n + 2];

//         for (int len = 1; len <= n; len++) {

//             for (int i = 1; i <= n - len + 1; i++) {

//                 int j = i + len - 1;

//                 for (int k = i; k <= j; k++) {

//                     int coins =
//                             dp[i][k - 1]
//                             + dp[k + 1][j]
//                             + arr[i - 1] * arr[k] * arr[j + 1];

//                     dp[i][j] =
//                             Math.max(dp[i][j], coins);
//                 }
//             }
//         }

//         return dp[1][n];
//     }

//     public static void main(String[] args) {

//         int[] nums = {3,1,5,8};

//         System.out.println(maxCoins(nums));
//     }
// }
// 
// 
// Boolean Parenthesisation - Recursive Solution
// public class Main {

//     static int solve(String exp, int i, int j, boolean isTrue) {

//         if (i > j)
//             return 0;

//         if (i == j) {

//             if (isTrue)
//                 return exp.charAt(i) == 'T' ? 1 : 0;

//             else
//                 return exp.charAt(i) == 'F' ? 1 : 0;
//         }

//         int ways = 0;

//         for (int k = i + 1; k < j; k += 2) {

//             int LT = solve(exp, i, k - 1, true);
//             int LF = solve(exp, i, k - 1, false);

//             int RT = solve(exp, k + 1, j, true);
//             int RF = solve(exp, k + 1, j, false);

//             char op = exp.charAt(k);

//             if (op == '&') {

//                 if (isTrue)
//                     ways += LT * RT;
//                 else
//                     ways += LT * RF + LF * RT + LF * RF;
//             }

//             else if (op == '|') {

//                 if (isTrue)
//                     ways += LT * RT + LT * RF + LF * RT;
//                 else
//                     ways += LF * RF;
//             }

//             else {

//                 if (isTrue)
//                     ways += LT * RF + LF * RT;
//                 else
//                     ways += LT * RT + LF * RF;
//             }
//         }

//         return ways;
//     }

//     public static void main(String[] args) {

//         String exp = "T|F&T";

//         System.out.println(
//                 solve(exp, 0, exp.length() - 1, true)
//         );
//     }
// }





