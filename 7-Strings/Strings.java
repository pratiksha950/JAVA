// Basic code of strings
// import java.util.*;
// public class Strings{
//     public static void demo(String str) {
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//        char arr[]={'a','b','c','d'};
//         String str1="abcd";
//         String str2=new String("xyz");
        
//         // Strings are immutable
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         System.out.println(name);

//         // **String Length***
//         String name1="om sai ram";
//         System.out.println(name1.length());
 
//         //**String concatanation**/
//         String strg1="pratu";
//         String strg2="salunke";
//         String fullName=strg1+" "+strg2;
//        System.out.println(fullName);  
//        System.out.println(fullName.charAt(0));  

//        demo(fullName);

// }
//  }

// // ***Check Number is palindrome or not***
// class Strings{
//     public static void Palindrome(int n) {
//         int original=n;
//         int rev=0;
//         while(n>0){
//             int last=n%10;
//             rev=rev*10+last;
//             n=n/10;
//         }
//         if(original==rev){
//             System.out.println("Number is palindrome");
//         }else{
//             System.out.println("Not a palindrome");
//         }
//     }
//     public static void main(String[] args) {
//         Palindrome(81);
//     }
// }

    // ***Check Number is palindrome or not***
    class Strings{
        public static boolean Palindrome(String str) {
            for(int i=0;i<str.length()/2;i++){
                if(str.charAt(i)!=str.charAt(str.length()-1-i)){               
                    return false;
                }
            }
           
            return true;
        }
        public static void main(String[] args) {
            String str="racecar1";
            System.out.println(Palindrome(str));
        }
    }