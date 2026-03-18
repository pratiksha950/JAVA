//####Given an integer array nums, return true if any value appears at least twice in the array,
//  and return false if every element is distinc*****
// public class assi1 {
//     public static boolean  copy(int nums[]) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             } 
//         }
//          return false;
//     }
    
//     public static void main(String[] args) {
//         int nums[]={1,2,3};
//          System.out.println(copy(nums));
//     }
// }


// Question 2:

// There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 ≤ k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums. You must write an algorithm with O(log n) runtime complexity.

// public class assi1 {

//     public static int search(int arr[], int target) {
//         int st = 0, end = arr.length - 1;

//         while (st <= end) {
//             int mid = st + (end - st) / 2;

//             // Found target
//             if (arr[mid] == target) {
//                 return mid;
//             }

//             // Left part sorted
//             if (arr[st] <= arr[mid]) {
//                 if (arr[st] <= target && target < arr[mid]) {
//                     end = mid - 1;
//                 } else {
//                     st = mid + 1;
//                 }
//             }
//             // Right part sorted
//             else {
//                 if (arr[mid] < target && target <= arr[end]) {
//                     st = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;

//         int result = search(arr, target);
//         System.out.println("Index: " + result);
//     }
// }

// Question 2:
// Stock same quetion

// Quetion 4-Trap Water
// class assi1 {
//     public static int trap(int[] height) {
//         //left
//         int leftMax[]=new int[height.length];
//         leftMax[0]=height[0];
//         for(int i=1;i<height.length;i++){
//             leftMax[i]=Math.max(height[i],leftMax[i-1]);
//         }

//         //right
//         int rightMax[]=new int[height.length];
//         rightMax[height.length-1]=height[height.length-1];
//         for(int i=height.length-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i],rightMax[i+1]);
//         }

//         int trapwater=0;
//         for(int i=0;i<height.length;i++){
//             int waterlevel=Math.min(leftMax[i],rightMax[i]);
//             trapwater+=waterlevel-height[i];  
//         }
//          return trapwater;
//     }
   
//     public static void main(String[] args){
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         trap(height);
//     }
// }

// Q 5.......... 3-Sum
// ***Brute force***
// import java.util.*;

// public class ass1 {
//     public static List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> set = new HashSet<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {

//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                         Collections.sort(temp); // remove duplicate order
//                         set.add(temp);
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(set);
//     }

//     public static void main(String[] args) {
//         int[] nums = {-1, 0, 1, 2, -1, -4};
//         System.out.println(threeSum(nums));
//     }
// }

//*** */ Hashing Approch ***
// import java.util.*;

// public class assi1 {
//     public static List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> result = new HashSet<>();
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {

//             Set<Integer> set = new HashSet<>();

//             for (int j = i + 1; j < n; j++) {

//                 int third = -(nums[i] + nums[j]);

//                 if (set.contains(third)) {

//                     List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
//                     Collections.sort(triplet); // avoid duplicates
//                     result.add(triplet);
//                 }

//                 set.add(nums[j]);
//             }
//         }

//         return new ArrayList<>(result);
//     }

//     public static void main(String[] args) {
//         int[] nums = {-1, 0, 1, 2, -1, -4};

//         List<List<Integer>> ans = threeSum(nums);

//         for (List<Integer> triplet : ans) {
//             System.out.println(triplet);
//         }
//     }
// }

//***Pointer approch***
import java.util.*;

public class assi1{
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: sort array
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}