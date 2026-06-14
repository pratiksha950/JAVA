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
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(99);
        list.add(3);
        list.add(4);
        System.out.println("before reverse"+ list);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }  
            //Or
            max=Math.max(max,list.get(i));
        }
        
        System.out.println(max);
}
}


