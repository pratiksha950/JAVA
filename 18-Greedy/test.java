/*Q1: You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
start = [10, 12, 20]
end   = [20, 25, 30]  O(n) 

import java.util.*;
public class test {
     public static void main(String[] args) {
         int start[]={1,3,0,5,8,5};
         int end[]={2,4,6,7,9,9};

         //end time basis sort
         int maxAct=0;
         ArrayList<Integer> ans = new ArrayList<>();

         //1st activity
         maxAct=1;
         ans.add(0);
         int lastEnd = end[0];

         for(int i=1 ; i< start.length ; i++){
            if(start[i] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
         }
         System.out.println("Maximum activities = " + maxAct);
         for(int i=0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
         }
         System.out.println();
     }  
}
*/

/* ### Same Quetion if Activities are not sorted*/
import java.util.*;
public class test {
     public static void main(String[] args) {
         int start[]={1,3,0,5,8,5};
         int end[]={2,4,6,7,9,9};

         //if Activities are not sorted
         //sorting
         int activities[][] = new int[start.length][3];
            for(int i=0; i< start.length ; i++){
                activities[i][0] =i;
                activities[i][1] = start[i];
                activities[i][2]=end[i];
            }
            //lambda function -> short form
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
     

         //end time basis sort
         int maxAct=0;
         ArrayList<Integer> ans = new ArrayList<>();

         //1st activity
         maxAct=1;
         ans.add(activities[0][0]);
         int lastEnd = activities[0][2];

         for(int i=1 ; i< start.length ; i++){
            if(activities[i][1] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
         }
         System.out.println("Maximum activities = " + maxAct);
         for(int i=0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
         }
         System.out.println();
     }  
}


