import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    String s1="silent";
    String s2="listen";

    char[] a=s1.toCharArray();
    char[] b=s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    if (Arrays.equals(a, b)) {
        System.out.println("The strings are anagrams.");
    } else {
        System.out.println("The strings are not anagrams.");
    }

   }
}