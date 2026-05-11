// public class Palindrome {
//     public static void main(String[] args) {

//         String str = "madam";

//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }

//         if (str.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }


// public class Palindrome {
//  public static void main(String[] args) {

//         String str = "level";

//         int left = 0;
//         int right = str.length() - 1;

//         boolean isPalindrome = true;

//         while (left < right) {

//             if (str.charAt(left) != str.charAt(right)) {
//                 isPalindrome = false;
//                 break;
//             }

//             left++;
//             right--;
//         }

//         System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
//     }
// }


public class Palindrome {
public static void main(String[] args) {

        int n = 121;
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}