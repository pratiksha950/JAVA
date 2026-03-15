// ************Bubble Sort*************
// public class Sorting {
//     public static void BubbleSort(int arr[]) {
//         for(int i=0;i<arr.length-1;i++){
//             int swap=0;
//             for(int j=0;j<=arr.length-2-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     swap++;
//                 }
//             }
//             if(swap==0){
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         BubbleSort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i] +",");
//         }
//     }
// }

// ************selection sort********************
public class Sorting {
    public static void Selection(int arr[]) {

    for(int i=0;i<arr.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
    }

    public static void main(String[] args) {
        int arr[]={5,2,3,4,1};
        Selection(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}