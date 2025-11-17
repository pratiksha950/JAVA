// import java.util.*;
// public class function1{
//     public static void hello() {
//         System.out.print("hi");
        
//     }
//     public static void main(String[] args) {
//         hello();
//          hello();
//          hello();
         
//     }
// }

// *********function parameter***********
// import java.util.*;
// public class function1{
//     public static int sum(int a,int b){
//         int sum1=a+b;
//         System.out.println(sum1);
//         return sum1;
//     }
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum1=sum(a,b);
//     }
// }

// **********swapping of two number*************
// import java.util.*;
// public class function1{
//     public static void swap(int a,int b) {
//         int temp=a;
//         a=b;;
//         b=temp;
//          System.out.println("a="+ a);
//         System.out.println("b=" +b);
//     }
//     public static int mul(int x,int y) {
//         int multiplication=x*y;
//         return multiplication;
        
//     }
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

//         int a=2;
//         int b=7;
//         int x=9;
//         int y=7;

//         swap(a,b);
//         int multiplication= mul(x,y);
//         System.out.println("multiplication of x * y is "+multiplication);

//     }
// }

// ********factorial********
// import java.util.*;
// public class function1{

//     public static int factorial(int a) {
//         int fact=1;
//         for(int i=1;i<=a;i++){
//             fact*=i;
//         }
//         return fact;  
//     }
//     public static  void main(String[] args) {
//         int result=factorial(4);
//          System.out.println("Factorial = " + result);
//     }
// }

// ********function overloding**********
// import java.util.*;
// public class function1{
//     public static int sum(int a,int b) {
//         return a+b;
//     }
//         public static int sum(int a,int b,int c) {
//         return a+b+c;
//     }

//     public static void main(String[] args) {
//          System.out.println(sum(5,1,9));
//         System.out.println(sum(2,5));
       
//     }
// }


// import java.util.*;
// public class function1{
//     public static int sum(int a,int b) {
//         return a+b;
//     }
//         public static float sum(float a,float b) {
//         return a+b;
//     }

//     public static void main(String[] args) {
//          System.out.println(sum(5,1));
//         System.out.println(sum(99.5f,85.2f));
       
//     }
// }


// *********isPrime************
// import java.util.*;
// public class function1{
//     public static boolean isPrime(int n) {
//         boolean isPrime=true;
//         if (n <= 1) {
//         isPrime=false;
//         return isPrime; 
//         }
//         for(int i=2;i<=n/2;i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//           return isPrime;
//         }
//             public static void main(String[] args){
//        System.out.println(isPrime(1));
//     }

// }


// import java.util.*;
// public class function1{
//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//         return false; 
//         }
//         for(int i=2;i<=n/2;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//           return true;
//         }
//             public static void main(String[] args){
//        System.out.println(isPrime(1));
//     }

// }

// ************optimized code for prime************
// import java.util.*;
// public class function1{
//     public static boolean isPrime(int n) {
//         boolean isPrime=true;
//         if (n <= 1) {
//         isPrime=false;
//         return isPrime; 
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//           return isPrime;
//         }
//             public static void main(String[] args){
//        System.out.println(isPrime(1));
//     }

// }


// *********range between 1 to 10 code for prime************
// import java.util.*;
// public class function1{
//     public static boolean isPrime(int n) {
//         boolean isPrime=true;
//         if (n <= 1) {
//         isPrime=false;
//         return isPrime; 
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//           return isPrime;
//         }

//         public static void primeRange(int n){
//         for(int i=2;i<=n;i++){
//         if(isPrime(i)){
//             System.out.print(i+" ");
//         }
       
//     }
//     }
//             public static void main(String[] args){
//                 primeRange(20);
//     }

// }

// ************Convert Binary to Decimal****************
// import java.util.*;
// public class function1{
//     public static void BinToDec(int n) {
//         int pow=0;
//         int dec=0;
//         while(n>0){
//             int lastDigit=n%10;
//             dec=dec+(lastDigit*(int)Math.pow(2,pow));
//             pow++;
//             n=n/10;
//         }
//         System.out.println(dec);
//     }
//     public static void main(String[] args) {
//         BinToDec(101110);
//     }
// }

// ************Convert  Decimal  to  Binary****************
// import java.util.*;
// public class function1 {
//     public static void decToBin(int n){
//         int pow=0;
//         int bin=0;
//         while(n>0){
//             int rem=n%2;
//             bin=bin+(rem*(int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//          System.out.println(bin);

// }
// public static void main(String[] args){
//     decToBin(15);
// }
//    }

// **********compute the averageof three numbers..************

// public class function1 {

//     public static void avgNum(int x,int y,int z) {
//         int avg=(x+y+z)/3;
//         System.out.println(avg);
//     }
     
   
//     public static void main(String[] args) {
//         avgNum(2,9,2);
        
//     }
// }

// **********compute the averageof three numbers..taking input from user************
// import java.util.*;
// public class function1 {
//     public static void avg(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter first num");
//         double x=sc.nextDouble();
//         System.out.println("enter second num");
//          double y=sc.nextDouble();
//          System.out.println("enter third num");
//          double z=sc.nextDouble();
//          double avg=(x+y+z)/3;
//           System.out.println(avg);
//     }

//     public static void main(String[] args) {
//        avg();
//     }
// }
