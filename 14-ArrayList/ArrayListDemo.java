/*###import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
         ArrayList<Boolean> list3=new ArrayList<>();
         //add operatrion O(1)
         list.add(1);
          list.add(8);
           list.add(1);
           System.out.println(list);
        System.out.println(list2);

        //Get Method
        int ele=list.get(1);
        System.out.println(ele);

        //remove element
       list.remove(2);
        System.out.println(list);

        //set method
        list.set(1,10);
        System.out.println(list);

    //contain method
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));

    //add method O(n)
    list.add(0,7);
    System.out.println(list);

    //size
    System.out.println("size is :"+ list.size());
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+ " ");
    }
}
} */

//###Reverse an array
/*import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("before reverse"+ list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));

        }
        
}
}
 */

//###Find max value
// import java.util.ArrayList;
// public class ArrayListDemo {
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(8);
//         list.add(99);
//         list.add(3);
//         list.add(4);
//         System.out.println(list);
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<list.size();i++){
//             // if(list.get(i)>max){
//             //     max=list.get(i);
//             // }  
//             //Or
//             max=Math.max(max,list.get(i));
//         }
//         System.out.println(max);
// }
// }

//###swap the number
/*import java.util.ArrayList;
public class ArrayListDemo {
    public static void SwapNum(ArrayList<Integer> list,int idx1,int idx2) {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        
        int idx1=1;
        int idx2=3;
        System.out.println("before swap"+ list);
        SwapNum(list,idx1,idx2);
        System.out.println("after swap" +list);
}
}*/

//###Sorting
/*import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void SwapNum(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(72);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());//decending
        System.out.println(list);

    }
}*/

//###Multidimentional arraylist
/*import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(2 * i);
            list2.add(3 * i);
        }
        mainList.add(list1);
        mainList.add(list2);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mainList);

        //nested loop
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);

            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}*/

//###Brute Force
//For given n lines on the x-axis, use 2 lines to form a container such that it holds maximum water.
//height = [1,8,6,2,5,4,8,3,7]
/*import java.util.ArrayList;
public class ArrayListDemo {
    public static int StoreWater(ArrayList<Integer> list) {
        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int currWater = height * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//height
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7); 
        System.out.print(StoreWater(list));
    }
}*/

//###Using Two-Pointer Method
import java.util.ArrayList;
public class ArrayListDemo {
    public static int StoreWater(ArrayList<Integer> list) {
        int maxWater = 0;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int height=Math.min(list.get(lp),list.get(rp));
            int width=rp-lp;
            int currWater=height*width;
            maxWater=Math.max(maxWater,currWater);
            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
       return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//height
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7); 
        System.out.print(StoreWater(list));
    }
}

