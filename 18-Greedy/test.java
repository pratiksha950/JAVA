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

/* ### Same Quetion if Activities are not sorted
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
}*/

/*Fractional Knapsack
Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
value = [60, 100, 120]
weight = [10, 20, 30]
W = 50

import java.util.Arrays;
import java.util.Comparator;

public class test{
    public static void main(String[] args) {
        int val[] = {60 , 100 , 120};
        int weight[] = {10 , 20 , 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];
        //0th col =>idx ; 1st col=>ratio
        for(int i=0 ; i<val.length ;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = w;
        int finalVal=0;

        for(int i=ratio.length-1; i>=0 ;i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){//full item
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                //include fractional item
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("finalVal = " + finalVal);
    }
} */

/*Min Absolute Difference Pairs
Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that sum S of absolute differences of all the pairs is minimum.
A = [1, 2, 3]
B = [2, 1, 3] 

import java.util.Arrays;
public class test {

    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[]= {2,1,3};
        Arrays.sort(A);
        Arrays.sort(B);

        int MinAbsDiff= 0;

        for(int i=0 ; i<A.length ;i++){
            MinAbsDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolue differnce in pair is = " + MinAbsDiff );
    }
}*/

/*Max Length Chain of Pairs
You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. A pair (c, d) can come after pair (a, b) if b < c.
Find the longest chain which can be formed from a given set of pairs.
pairs =
(5, 24)
(39, 60)
(5, 28)
(27, 40)
(50, 90) 
import java.util.Arrays;
import java.util.Comparator;
public class test{
    public static void main(String[] args) {
        int pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} ,{50,90}};
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=1 ; i<pairs.length ; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain is = " + chainLen );
    }
}*/

/*Indian Coins
We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
Find the minimum number of coins/notes required to make change for a value V.
Example 1
V = 121
Output: 3
Example 2
V = 590

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class test{
    public static void main(String[] args) {
        Integer coins[]={1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins , Comparator.reverseOrder());
        int countOfCoin = 0;
        int amount = 102;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ;i<coins.length ;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoin++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total coins used in are : " + countOfCoin);

        for(int i=0 ; i<ans.size() ;i++){
             System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
} */

/*Job Sequencing Problem
Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.Maximize the total profit if only one job can be scheduled at a time.
Jobs
| Job | Deadline | Profit |
| --- | -------- | ------ |
| A   | 4        | 20     |
| B   | 1        | 10     |
| C   | 1        | 40     |
| D   | 1        | 30     |
 */

import java.util.ArrayList;
import java.util.Collections;

public class test{
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][] = {{4,20} , {1,10} , {1,40} , {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0 ; i<jobInfo.length ;i++){
            jobs.add(new Job(i, jobInfo[i][0] , jobInfo[i][1]));
        }

        Collections.sort(jobs , (obj1,obj2) -> obj2.profit - obj1.profit); //descending order of profit
        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0 ;i<jobs.size();i++){
            Job curr= jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max job that i can do = "+ seq.size());
        for(int i=0 ;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}