/*public class array{
    public static void main(String[] args){
        
    }
}*/


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
// import java.util.*;
// public class array {
//     public static int BinarySearch(int nums[],int key){
//         int start=0,end=nums.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//         //comparison
//          if(nums[mid]==key){
//             return mid;
//         }
//         if(nums[mid]<key){//right
//             start=mid+1;
//         }else{//left
//             end=mid-1;
//         }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[]={2,3,5,45,78,99,100};
//         int key=45;
//         System.out.println("index for key is :"+BinarySearch( nums,key));
//     }
// }

// *************Reverse an array*************
// import java.util.*;
// public class array {
//     public static int swap(int nums[]) {
//         int first=0,last=nums.length-1;
//         while(first<last){
//             //swap
//             int temp=nums[last];
//             nums[last]=nums[first];
//             nums[first]=temp;
//             first++;
//             last--;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int nums[]={2,3,5,45,78,99,100};
//         swap(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//         System.out.println();
//     }
// }

// *************Pair of an array*************
// import java.util.*;
// public class array {
//     public static void Pair(int nums[]){
//        int totalPair=0;
//         for(int i=0;i<nums.length;i++){
            
//              int curr=nums[i];
//             for(int j=i+1;j<nums.length;j++){
//                 System.out.print("("+curr+ ","+nums[j]+")");   
//                 totalPair++;         
//             }
//             System.out.println();      
//         }
//         System.out.println("totalPair Are:"+totalPair);
//     }
//     public static void main(String[] args) {
//         int nums[]={2,4,6,8,10};
//         Pair(nums);
//     }
// }

// *************Print of an subArray*************
// public class array{

//     public static void Subarray(int nums[]){
//         int ts=0;
//         for(int i=1;i<nums.length;i++){
//             int start=i;
//             for(int j=i;j<nums.length;j++){
//                 int end=j;
//                 for(int k=start;k<=end;k++){
//                     System.out.print(nums[k]+" ");//subarray
//                 }
//                  ts++;
//                 System.out.println();
//             }
//             System.out.println();
            
//         }
//         System.out.println("total subarrays are :"+ts);
//     }
//     public static void main(String[] args){
//         int nums[]={2,4,6,8,10};
//         Subarray(nums);
//     }
// }

// *************Maximum subArray Sum*************
// public class array{
//     public static void  subArray(int value[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;

//         for(int i=0;i<value.length;i++){
//             for(int j=i;j<value.length;j++){
//                 currSum=0;
//                 System.out.print("Subarray: ");
//                 for(int k=i;k<=j;k++){
                   
//                     //sum of subarray
//                      System.out.print(value[k] + " "); 
//                      currSum += value[k];
//                 }
//                  System.out.println(" => Sum = " + currSum);
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }  
//             }
//             System.out.println(); 
//         }
//         System.out.println("Maximum Subarray Sum = " + maxSum);
//     }
//     public static void main(String[] args){
//         int value[]={2,4,6,8,10};
//         subArray(value);
//     }
// }

// // *************Maximum subArray Prefix Sum*************
// public class array{
//     public static void  subArray(int value[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int[value.length];

//         //calculate prefix array
//         prefix[0]=value[0];
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+value[i];

//         }

//         for(int i=0;i<value.length;i++){
//             int start=i;
//             for(int j=i;j<value.length;j++){
//                 int end=j;
//                 currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 System.out.print("Subarray: ");
//                  System.out.println(" => Sum = " + currSum);
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }  
//             }
//             System.out.println(); 
//         }
//         System.out.println("Maximum Subarray Sum = " + maxSum);
//     }
//     public static void main(String[] args){
//         int value[]={2,4,6,8,10};
//         subArray(value);
//     }
// }

// *************Maximum subArray Sum Kadane's Algorithum*************
// public class array{
//     public static void kadans(int numbers[]){
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0;i<numbers.length;i++){
//             cs=cs+numbers[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("our max subarray sum is :"+ms);
//     }
//     public static void main(String[] args){
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//         kadans(numbers);
//     }
// }