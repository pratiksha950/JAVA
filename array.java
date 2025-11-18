// ****************Taking input in an array*************

// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         int marks[]=new int[50];
//         // int num[]={1,2,3,4};
//         // String name[]={"om","sai"};
//         Scanner sc=new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();

//         System.out.println("chem:"+marks[0]);
//         System.out.println("phy:"+marks[1]);
//         System.out.println("math:"+marks[2]);
//         marks[2]=100;
//         System.out.println("math:"+marks[2]);
//         int percentage=(marks[0]+marks[1]+marks[2])/3;
//         System.out.println("percentage is :"+percentage);
//         System.out.println("marks.length is ="+marks.length);
//     }
// }


// *************passing array as referance*************

// import java.util.*;
// public class array {
//     public static void update(int marks[],int nonChangable){
//         nonChangable=50;
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
        
//     }
//     public static void main(String[] args) {
//         int marks[]={23,6,797,65,44};
//         int nonChangable=3;
//         update(marks,nonChangable);
//         System.out.println(nonChangable);
//         for(int i=0;i<marks.length;i++){
//          System.out.print(marks[i]+" ");
//         }
//         System.out.println();

//     }
// }

// *************linear Search*************
// import java.util.*;
// public class array {
//     public static int linearSearch(int nums[],int key){
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==key){
//                 return i;
//             }
//         }
//        return -1; 
//     }
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         int nums[]={2,45,6,6,7,7,7,6,3,21,80};
//         int key=7;
//         int index=linearSearch(nums,key);
//         if(index==-1){
//             System.out.println("not found");
//         }else{
//             System.out.println("key index is at "+index);
//         }
//     }
// }

// *************largest number and smallest number*************
// import java.util.*;
// public class array {
//     public static int largestNum(int nums[]) {
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;

//         for(int i=0;i<nums.length;i++){
//             if(largest<nums[i]){
//                largest=nums[i];
//             }
//             if(smallest>nums[i]){
//                 smallest=nums[i];
//             }
//         }
//         System.out.println("smallest value is :"+smallest);
//         return largest;
//     }

//     public static void main(String[] args) {
//         int nums[]={2,45,7,6,3,21,80};
//         System.out.println("largest value is "+largestNum(nums));
        

//     }
// }

// *************Binary Search*************
import java.util.*;
public class array {
    public static int BinarySearch(int nums[],int key){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
        //comparison
         if(nums[mid]==key){
            return mid;
        }
        if(nums[mid]<key){//right
            start=mid+1;
        }else{//left
            end=mid-1;
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={2,45,7,6,3,21,80};
        int key=45;
    }
}

