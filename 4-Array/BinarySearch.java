// *************Binary Search*************
public class BinarySearch {
    public static int BinarySearchDemo(int nums[],int key){
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
        int nums[]={2,3,5,45,78,99,100};
        int key=45;
        System.out.println("index for key is :"+BinarySearchDemo( nums,key));
    }
}

