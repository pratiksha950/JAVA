/* common code
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    }
}
*/


// *************Sum of even and odd given by user**************
// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int evenSum=0;
//         int oddSum=0;
//         int choice;
        
//         do{
//             int num=sc.nextInt();
//             if(num%2==0){
//                 evenSum+=num;
//             }else{
//                 oddSum+=num;
//             }
//             System.out.println("wants to contine press 1");
//              choice=sc.nextInt();
           
//         }while(choice==1);

//         System.out.println("EvenSum :"+evenSum);
//         System.out.println("Odd sum :"+oddSum);
//     }}

// *************factorial of number***************
// import java.util.*;
// public class main {

//     public static void main(String[] args) {
//             Scanner sc =new Scanner(System.in);
//             long fact=1;
//             int n=sc.nextInt();
            
//             for(int i=1;i<=n;i++){
//                 fact*=i;
//             }
//             System.out.println(fact);
//     }
// }

// *************Number is positive or Negative************
// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num>0){
//             System.out.println("Number is positive");
//         }else{
//             System.out.println("negative");
//         }
//         String result=num%2==0?"even":"odd";
//         System.out.println(result);
//         for(int i=0;i<5;i++){
//             System.out.println("hii"+i);
//             i+=2;
//         }
//     }
// }

// **********prime class**********
// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         boolean isPrime=true;
//         int n=sc.nextInt();

//         if(n<=1){
//             isPrime=false;
//         }else{
//             for(int i=2;i<=n/2;i++){
//                 if(n %i ==0){
//                     isPrime=false;
//                 }
//             }
//         }
//         if (isPrime) {
//             System.out.println("prime");
//         }else{
//             System.out.println("not");
//         }
//     }
// }



// public class main {
//     public static void main(String[] args) {
//         int a=78;
//         int b=56;
//         int temp=a;
//          a=b;
//          b=temp;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// public class main {

//     public static void main(String[] args) {
//         int a=1;
//         int b=2;
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// ***********prime number***************
// import java.util.Scanner;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         boolean isPrime = true;
//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= n / 2; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime)
//             System.out.println(n + " is a prime number.");
//         else
//             System.out.println(n + " is not a prime number.");
//     }
// }

// *******basic practice *********
// import java.util.*;
// public class main{
//    public static void main(String[] args) {
//       Scanner var1 = new Scanner(System.in);
//       int n = var1.nextInt();
//     int sum=(n*(n+1))/2;
//     System.out.println(sum);

//     for(int i=1;i<5;i++){
//         System.out.println("****");
//     }
//    }
// }


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


// **********reverse a string:*********
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

// import java.util.*;
// public class main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);

//       for (;;) {  // Infinite loop — similar to while(true)
//          int n = sc.nextInt();
//          if (n % 10 == 0) {
//             continue;
//          }
//          System.out.println(n);
//       }

     
//    }
// }

// **********type cast***********
// public class main {
//     public static void main(String[] args) {
//         float a=78.22f;
//         int b=(int)a;
        
//         System.out.println(b);
//     }
// }


// ***********table enter by user********
// import java.util.*;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
        
//         for(int i=2;i<=10;i++){
//             System.out.println(i*n);
//         }
      

//     }
// }

// import java.util.*;
// public class main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=0;
//         while(i<=n){
//             System.out.print(i);
//               i++;
//         }
        
//     }
// }
