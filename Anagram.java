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


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
    }
}