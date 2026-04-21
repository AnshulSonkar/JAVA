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


public class SubstringExample {
    public static void main(String[] args) {
        String text = "Programming";

        String sub1 = text.substring(3); 
        
    
        String sub2 = text.substring(0, 6); 

        System.out.println(sub1);
        System.out.println(sub2);
    }
}





 





