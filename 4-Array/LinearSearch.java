// *************linear Search*************
public class LinearSearch {
    public static int linearSearch(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
       return -1; 
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int nums[]={2,45,6,6,7,7,7,6,3,21,80};
        int key=7;
        int index=linearSearch(nums,key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key index is at "+index);
        }
    }
}
