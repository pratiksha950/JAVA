// ***Printing 2D array***
// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int matrix[][]=new int[3][3];
//         int n=3;
//         int m=3;
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//            System.out.println();
//         }

//     }
// }

// ***finding element in 2d array***
// import java.util.*;
// public class Array {
//     public static boolean Search(int matrix[][],int key) {
//          for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Fount at cell :("+i+","+j+")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return false;

//     }
//     public static void main(String[] args) {
//         int matrix[][]=new int[3][3];
//         int n=3;
//         int m=3;
//         Scanner sc=new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//            System.out.println();
//         }

//         Search(matrix,5);

//     }
// }

// ******Spiral Matrix code*******
//   public class Array {
//     public static void Search(int matrix[][]) {
//         int startrow=0;
//         int endrow=matrix.length-1;
//         int startcol=0;
//         int endcol=matrix[0].length-1;

//         while(startrow<=endrow && startcol<=endcol){
//             //top
//             for(int j=startcol;j<=endcol;j++){
//                 System.out.print(matrix[startrow][j]+" ");
//             }
//             //right
//             for(int i=startrow+1;i<=endrow;i++){
//                 System.out.print(matrix[i][endcol]+" ");
//             }
//             //BOTTOM
//             if (startrow < endrow) {
//                 for (int j = endcol - 1; j >= startcol; j--) {
//                     System.out.print(matrix[endrow][j] + " ");
//                 }
//             }

//             // LEFT
//             if (startcol < endcol) {
//                 for (int i = endrow - 1; i > startrow; i--) {
//                     System.out.print(matrix[i][startcol] + " ");
//                 }
//             }

//         startcol++;
//         startrow++;
//         endcol--;
//         endrow--;
//     }
//     System.out.println();
//     }
//     public static void main(String[] args) {
//        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        Search(matrix);
// }
// }


// ***Digonal Sum***
// import java.util.*;
// public class Array {
//     public static int Digonal(int matrix[][]) {
//         int sum=0;
//         for(int i=0;i<matrix.length;i++){         
//             sum+=matrix[i][i];
//             if(i!=matrix.length-1-i){
//                 sum+=matrix[i][matrix.length-1-i];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int res=Digonal(matrix);
//        System.out.println(res);
// }
// }

// ***Search in sorted Matrix***
// public class Array {
//     public static boolean Search(int matrix[][],int key) {
//         int row=0;
//         int col=matrix[0].length-1;
//         while(row<matrix.length && col>=0){
//             if(matrix[row][col]==key){
//                 System.out.println("Key is at index ("+row+","+col+")");
//                 return true;
//             }
//             else if(key<matrix[row][col]){
//                 col--;
//             }else{
//                 row++;
//             }
//         }
//           System.out.println("key not found");
//             return false;
//     }
//     public static void main(String[] args) {
//        int matrix[][]={ {1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
//        int key=0;
//       Search(matrix,key);
// }
// }

