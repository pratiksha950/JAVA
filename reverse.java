//  import java.util.*;

// public class reverse {
//    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       int n = sc.nextInt();
//     while(n>0){
//         int last=n%10;
//         System.out.print(last);
//         n=n/10;
//     }
       
//    }
// }



//  import java.util.*;

// public class reverse {
//    public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
       
//       do{
//          int n = sc.nextInt();
//          if(n%10==0){
//             break;
//          }
//        System.out.println(n);
//       }while(true);

//    }
// }

import java.util.*;

public class reverse {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      for (;;) {  // Infinite loop — similar to while(true)
         int n = sc.nextInt();
         if (n % 10 == 0) {
            continue;
         }
         System.out.println(n);
      }

     
   }
}
