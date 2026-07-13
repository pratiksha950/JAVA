/* ### Basic operations of hashMap 

import java.util.HashMap;
public class Test {
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India" , 100);
        hm.put("Us" , 80);
        hm.put("Ambi" , 180);
        System.out.println(hm);

         //get - O(1)
        int popuation = hm.get("India");
        System.out.println(popuation);

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indiqaaa"));//false

        //remove -O(1)
        System.out.println(hm.remove("Ambi"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}*/

/* ### Iteration on hashMap */
import java.util.*;
public class Test {
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India" , 100);
        hm.put("Us" , 80);
        hm.put("Ambi" , 180);
        hm.put("Kamal" , 50);
        hm.put("Belapur" , 16);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
       
        for(String k : keys){
            System.out.println("key = "+ k + ", value =" + hm.get(k));
        }
    }
}

