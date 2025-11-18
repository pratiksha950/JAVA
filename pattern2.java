// ********************pattern programs*********************
// ********************int i=number of stars********************
// ********************int j=number of spaces********************


// ******************hollow Reactangle******************
// public class pattern2 {
//     public static void hollowRectangle(int totRow,int totColoumn){
//         for(int i=1;i<=totRow;i++){
//             for(int j=1;j<=totColoumn;j++){
//                 if(i==1||i==totRow||j==1||j==totColoumn){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String[] args) {
//         hollowRectangle(10,7);
//     }
// }

// ******************inverted rotated half pyramid******************
// public class pattern2 {
//     public static void halfPyramid(int n){
//         //outer
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                System.out.print(" ");    
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         halfPyramid(4);
//     }
// }

// ******************tringle******************
// public class pattern2 {
//     public static void tringle(int n) {
//         //outer
//         for(int i=1;i<=n;i++){
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//                  }
//                 //spaces
//                 for(int j=1;j<=n-i;j++){
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         tringle(5);
//     }
// }


// ******************inverted tringle******************
// public class pattern2 {
//     public static void tringle(int n) {
//         //outer
//         for(int i=1;i<=n;i++){
//             //stars
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//                  }
//                 //no need of spaces automatically spaces due to next line 
                
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         tringle(5);
//     }
// }

// ******************Floyad's tringle******************
// public class pattern2 {
//     public static void FloyadsTringle(int n) {
//         int counter=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         FloyadsTringle(5) ;
//     }
// }

// ******************0-1 tringle******************
// public class pattern2 {
//     public static void tringle(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String[] args) {
//         tringle(4);
//     }
// }

// ******************ButterFly Pattern******************
public class pattern2 {
    public static void ButterFly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

         //2st half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        ButterFly(8);
    }
}