import java.util.ArrayList;
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

        
}
}
