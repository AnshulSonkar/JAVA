// public class SubstringExample {
//     public static void main(String[] args) {
//         String text = "Programming";

//         String sub1 = text.substring(3); 
        
    
//         String sub2 = text.substring(0, 6); 

//         System.out.println(sub1);
//         System.out.println(sub2);
//     }
// }


// public class Recursion {
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


// public class Recursion {
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


// public class Recursion {
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


public class Recursion {
    public static void main(String[] args) {
        String str1 = "12344abc";
        boolean isNum = true;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) < '0' || str1.charAt(i) > '9') {
                isNum = false;
                break;
            }
        }

        System.out.println(isNum);
    }
}

