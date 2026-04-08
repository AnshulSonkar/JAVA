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


public class Main {
    public static void main(String[] args) {
        String str = "aabbccdee";
        char result = ' ';
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            boolean isRepeating = false;
            for (int j = 0; j < str.length(); j++) {
                
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            
            
            if (!isRepeating) {
                result = str.charAt(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

