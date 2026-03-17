// ************Bubble Sort*************
public class BubbleSort{
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +",");
        }
    }
}


// ************Sorting using library-(inbuilt Sort)********************

// import java.util.*;

// public class Sorting {
//     public static void main(String[] args) {
//         Integer arr[]={5,2,3,4,1};
//         Arrays.sort(arr,0,5,Collections.reverseOrder());
//          for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }
