// public class SubstringExample {
//     public static void main(String[] args) {
//         String text = "Programming";

//         String sub1 = text.substring(3); 
        
    
//         String sub2 = text.substring(0, 6); 

//         System.out.println(sub1);
//         System.out.println(sub2);
//     }
// }


// public class recursion {
//     public static void main(String[] args) {
//         String str1 = "abc";
//         int count = 0;

//         for (int i = 0; i < str1.length(); i++) {
//             for (int j = i + 1; j < str1.length(); j++) {
//                 if (str1.charAt(i) == str1.charAt(j)) {
//                     count++;
//                 }
//             }
//         }

//         System.out.println("Duplicate count: " + count);
//     }
// }


// public class recursion {
//      public static void main(String[] args) {
//         String str1 = "abc";
//         char remove = 'a';
//         string result = " ";
//         for(int i = 0; i< str1.length();i++)
//         {
//             if(str1.charAt(i)!= remove)
//             {
//                 result += str1.charAt(i);
//             }
//         }
//          System.out.println(result);
//     }
// }


// public class recursion {
//     public static void main(String[] args) {
//         String str1 = "abc";
//         char remove = 'a';
//         String result = "";   // fixed

//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != remove) {
//                 result += str1.charAt(i);
//             }
//         }

//         System.out.println(result);
//     }
// }


// public class Recursion {
//     public static void main(String[] args) {
//         String str1 = "abc";
//         char remove = 'a';
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != remove) {
//                 result.append(str1.charAt(i));
//             }
//         }

//         System.out.println(result.toString());
//     }
// }


// public class Recursion {
//     public static void main(String[] args) {
//         String str1 = "a34bc9d1e6";
//         char max = '0';

//         for (int i = 0; i < str1.length(); i++) {
//             char ch = str1.charAt(i);

//             if (ch >= '0' && ch <= '9' && ch > max) {
//                 max = ch;
//             }
//         }

//         System.out.println("Max digit: " + max);
//     }
// }


// public class Recursion {
//     public static void main(String[] args) {
//         String str1 = "aabbbccdeeeff";
//         String result = "";

//         result += str1.charAt(0);

//         for (int i = 1; i < str1.length(); i++) {
//             if (str1.charAt(i) != str1.charAt(i - 1)) {
//                 result += str1.charAt(i);
//             }
//         }

//         System.out.println(result);
//     }
// }


// public class Recursion {
//     Public static void main(string[] args){
//         string str1 = "12344abc";
//         boolean isNUm = true;
//         for(int i = 0; i < str1.length(); i++){
//             if(str1.charAt(i) < '0' || str1.charAT(i) > '9'){
//                 isNUM = false;
//                 break;
//             }
//         }
//         system.out.println(isNum);
//      }
// }


// public class recursion {
//     public static void main(String[] args) {
//         String str1 = "12344abc";
//         boolean isNum = true;

//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) < '0' || str1.charAt(i) > '9') {
//                 isNum = false;
//                 break;
//             }
//         }

//         System.out.println(isNum);
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
//     static void printnumber(int n) {
//         if (n > 20) {
//             return;
//         }

//         System.out.print(n + " ");
//         printnumber(n + 3);
//     }

//     public static void main(String[] args) {
//         printnumber(1);
//     }
// }

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
//     static void printnumber(int n) {
//         if (n > 20) {
//             return;
//         }

//         System.out.print(n + " ");
//         printnumber(n + 3);
//     }

//     public static void main(String[] args) {
//         printnumber(1);
//     }
// }


// import java.util.Scanner;

// public class recursion {

//     // Recursive function
//     static int power(int x, int n) {
//         if (n == 0)        // base case
//             return 1;
//         else
//             return x * power(x, n - 1);   // recursive call
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter value of x: ");
//         int x = sc.nextInt();

//         System.out.print("Enter value of n: ");
//         int n = sc.nextInt();

//         int result = power(x, n);

//         System.out.println("Result = " + result);
//     }
// } 


// public class SubstringExample {
//     public static void main(String[] args) {
//         String text = "Programming";

//         String sub1 = text.substring(3); 
        
    
//         String sub2 = text.substring(0, 6); 

//         System.out.println(sub1);
//         System.out.println(sub2);
//     }
// }


// public class SubstringExample {
// public static void main(String[] args) {
//         String str = "Programming";

//         String firstHalf = str.substring(0, str.length() / 2);

//         System.out.println(firstHalf);
//     }
// }


// public class SubstringExample {
//     public static void main(String[] args) {
//         String str = "Programming";

//         String lastPart = str.substring(str.length() - 3);

//         System.out.println(lastPart);
//     }

// }


// public class SubstringExample {
//      public static void main(String[] args) {
//         String str = "Programming";

//         String result = str.substring(1, str.length() - 1);

//         System.out.println(result);
//     }
// }


// Remove space
// public class SubstringExample {
// public static void main(String[] args) {
//         String str = "Hello World Java";
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             String ch = str.substring(i, i + 1);

//             if (!ch.equals(" ")) {
//                 result += ch;
//             }
//         }

//         System.out.println(result);
//     }
// }


// public class SubstringExample {
//     public static void main(String[] args) {
//         String str = "HelloWorld";

//         String part1 = str.substring(0, 5);
//         String part2 = str.substring(5);

//         System.out.println(part1);
//         System.out.println(part2);
//     }
// /}


// public class SubstringExample {
//  public static void main(String[] args) {

//         String str = "hello";
//         char target = 'e';

//         boolean found = false;

//         for (int i = 0; i < str.length(); i++) {

//             if (str.charAt(i) == target) {
//                 found = true;
//                 break;
//             }
//         }

//         System.out.println(found ? "Character Exists" : "Character Not Found");
//     }
// }


// public class SubstringExample {
// public static void main(String[] args) {

//         String str = "hello";

//         if (str.contains("ll")) {
//             System.out.println("Exists");
//         } else {
//             System.out.println("Not Exists");
//         }
//     }
// }


// public class SubstringExample {
//  public static void main(String[] args) {

//         String str = "programming";
//         char target = 'g';

//         int index = -1;

//         for (int i = 0; i < str.length(); i++) {

//             if (str.charAt(i) == target) {
//                 index = i;
//                 break;
//             }
//         }

//         System.out.println(index);
//     }
// }


// public class SubstringExample {
// public static void main(String[] args) {

//         String str = "banana";
//         char target = 'a';

//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {

//             if (str.charAt(i) == target) {
//                 count++;
//             }
//         }

//         System.out.println("Count = " + count);
//     }
// }


// public class SubstringExample {
//   static boolean search(String str, int i, char target) {

//         if (i == str.length()) return false;

//         if (str.charAt(i) == target) return true;

//         return search(str, i + 1, target);
//     }

//     public static void main(String[] args) {

//         String str = "hello";

//         System.out.println(search(str, 0, 'o'));
//     }
// }


// public class SubstringExample {
// public static void main(String[] args) {

//         StringBuilder sb = new StringBuilder("Hello");

//         System.out.println(sb);
//     }
// }


public class SubstringExample {
 public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");

        System.out.println(sb);
    }
}





 





