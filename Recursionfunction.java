// public class Recursionfunction {

//     static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         int result = power(2, 5);
//         System.out.println(result);
//     }
// } gpt


// public class Recursionfunction {

//     static int sum = 0;

//     static int sumofdigit(int n) 
//     {
//         if (n==0)
//             return 0;
//             return n%10 + sumofdigit(n/10);
//         }
//        public static void main(String[] args) {
//         int n = 123;
//         System.out.println(sumofdigit(n));
//     }
// }


// public class Recursionfunction {
//     static int countdigit(int n)
//     {
//         if (n==0) return 0;
//         return 1 + countdigit(n/10);
//      }
//      public static void main(String[] args) {
//         int n = 12345;
//         System.out.println(countdigit(n));
//  }
// }


// public class Recursionfunction {
//     static int gcd(int a, int b)
//     {
//         if (b==0) return a;
//         return gcd(b, a%b);
//   }
//   public static void main(String[] args) { 
//              int a = 12, b= 18;
//        System.out.println(gcd(a,b));

//   }
// }

// public class Recursionfunction {

//     static int countzero(int a) {
//         if (a == 0)
//             return 0;

//         int count = (a % 10 == 0) ? 1 : 0;
//         return count + countzero(a / 10);
//     }

//     public static void main(String[] args) {
//         int a = 102030400;
//         System.out.println(countzero(a));
//     }
// }


// public class Recursionfunction {
//     static int sumofdigitarray(int[] arr, int i)
//     {
//         if(i== arr.length) return 0;
//         return arr[i] + sumofdigitarray(arr, i);


//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         int i = 0 ;
//         System.out.println(sumofdigitarray(arr, i));
//     }
// }


// public class Recursionfunction {

//     static int countercurofkey(int[] arr, int i, int key) {
//         if (i == arr.length) return 0;

//         int count = (arr[i] == key) ? 1 : 0;
//         return count + countercurofkey(arr, i + 1, key);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int key = 9;
//         int i = 0;

//         System.out.println(countercurofkey(arr, i, key));
//     }
// }


// public class Recursionfunction {

//     static void replace(int[] arr, int i) {
//         if (i == arr.length) return;

//         if (arr[i] == 2) {
//             arr[i] = 5;
//         }

//         replace(arr, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 4, 2};

//         replace(arr, 0);

//         // print array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// public class Recursionfunction {

//     static int vowels(String str, int i) {
//         if (i == str.length()) return 0;

//         char ch = str.charAt(i);
//         int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

//         return count + vowels(str, i + 1);
//     }

//     public static void main(String[] args) {
//         String str = "hello";
//         int i = 0;

//         System.out.println(vowels(str, i));
//     }
// }
 