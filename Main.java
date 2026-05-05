// public class firstkrep{

//     public static void main(string[] args) {
        
//     }
    
// }


// public class Main {
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


// public class Main {
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


// class Main {
//     public static void main(String[] args) {

//         String name1 = "Aman";
//         String name2 = "Akku";
//         String name3 = name1 +" "+ name2;

//         System.out.println(name3);
//     }
// }


// class Main {
//    public static void main(String[] args) {
//     boolean isSunUp = false;

//         if (isSunUp == true)
//             System.out.println("day");
//         else
//             System.out.println("night");

//  }
// }


// class Main {

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


    // public class Main {
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


//     public class Main {
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


// public class Main {
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

// public class Main {

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



// public class Main {
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


// public class Main {

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
// public class Main {
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



// public class Main {
//     static int recursioin(int a,int b){
//     int sum=a+b;
//    return sum;
//   }
//     public static void main(String[] args) {
       
//         System.out.println(recursioin(2,3));
//   }
// }




// import java.util.Scanner;

// public class Main {
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

// public class Main {
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


// public class Main {
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


// public class Main {
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


// public class Main {
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


public class Main {
public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        int key = 2;

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}






    
