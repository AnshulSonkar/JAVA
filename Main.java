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


    public class Main {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}


    
