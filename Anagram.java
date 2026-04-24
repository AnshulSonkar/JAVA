// import java.util.Arrays;

// public class Anagram {
//     public static void main(String[] args) {
//     String s1="silent";
//     String s2="listen";

//     char[] a=s1.toCharArray();
//     char[] b=s2.toCharArray();

//     Arrays.sort(a);
//     Arrays.sort(b);

//     if (Arrays.equals(a, b)) {
//         System.out.println("The strings are anagrams.");
//     } else {
//         System.out.println("The strings are not anagrams.");
//     }

//    }
// }


// import java.util.Arrays;

// public class Anagram {
//     public static void main(String[] args) {
//         String s1 = "Listen";
//         String s2 = "Silent";

//         s1 = s1.toLowerCase().replace(" ", "");
//         s2 = s2.toLowerCase().replace(" ", "");

//         char[] a = s1.toCharArray();
//         char[] b = s2.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
//     }
// }


// public class Anagram {
//     public static void main(String[] args) {
//         String s1 = "listen";
//         String s2 = "silent";

//         if (s1.length() != s2.length()) {
//             System.out.println("Not Anagram");
//             return;
//         }

//         int[] count = new int[26];

//         for (int i = 0; i < s1.length(); i++) {
//             count[s1.charAt(i) - 'a']++;
//             count[s2.charAt(i) - 'a']--;
//         }

//         for (int x : count) {
//             if (x != 0) {
//                 System.out.println("Not Anagram");
//                 return;
//             }
//         }

//         System.out.println("Anagram");
//     }
// }


public class Anagram {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}