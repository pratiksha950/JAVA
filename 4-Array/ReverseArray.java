// *************Reverse an array*************
import java.util.*;
public class ReverseArray {
    public static int swap(int nums[]) {
        int first=0,last=nums.length-1;
        while(first<last){
            //swap
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={2,3,5,45,78,99,100};
        swap(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
