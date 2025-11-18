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
public class pattern2 {
    public static void tringle(int n) {
        //outer
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print(j);
                 }
                //spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tringle(5);
    }
}