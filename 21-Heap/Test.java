/*### PriorityQueue concept
import java.util.*;
public class Test {

    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;

        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("a" ,2));//O(logn)
        pq.add(new Student("b" ,7));
        pq.add(new Student("c" ,3));
        pq.add(new Student("d" ,22));

        while(! pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);//O(1)
            pq.remove();//O(logn)
        }

    }
}*/

 /*### Insert in Heap and Remove from heap 
import java.util.*;

public class Test {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last ind
            arr.add(data);
            int x = arr.size() - 1; //child idx
            int par = (x - 1) / 2; //parent idx

            while (arr.get(x) < arr.get(par)) {  // O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;    
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            //step1 -swap first and last
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //step2 -delete last
            arr.remove(arr.size() - 1);

            //step3 -Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(! h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        };
    }
}*/

 /*### Heap Sort
import java.util.*;

public class Test {

    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            //swap
            int temp = arr[i];
            arr[i]= arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr , maxIdx ,size);
        }
    }

    public static void heapSort(int arr[]) {
        //step1: build maxheap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        //step2 :push l;argest at end
        for (int i = n - 1; i > 0; i--) {
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};

        heapSort(arr);

        for(int i=0 ;i<arr.length ;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

} */

/* ### Nearby Cars
We are given N points in a 2D plane which are locations of N cars. If we are at the origin (0, 0), print the nearest K cars.
Cars:
C0 (3, 3)
C1 (5, -1)
C2 (-2, 4)
K = 2

import java.util.*;

public class Test {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq ;
        }
    }

    public static void main(String args[]) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0 ; i<pts.length ; i++){
            int distSq = pts[i][0]*pts[i][0] +  pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0] , pts[i][1] ,distSq ,i));
        }

        //nearest car
        for(int i=0 ; i<k ;i++){
            System.out.println("C" + pq.remove().idx);
        }
    }
}*/

/* ### Connect N Ropes: Given are N ropes of different lengths, the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
ropes = {4, 3, 2, 6}
Output:29


import java.util.*;

public class Test {
       public static void main(String args[]) {
        int ropes[] = {4,3,2,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0 ; i<ropes.length ; i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min = pq.remove();
            int min2 = pq.remove();

            cost += min + min2;
            pq.add(min + min2);
        }
        System.out.println("cost of connecting n ropes is = " + cost);
        
    }
} */

/* ###Weakest Soldier :
We are given an m × n binary matrix of 1s (soldiers) and 0s (civilians). The soldiers are positioned in front of the civilians. That is, all the 1s will appear to the left of all the 0s in each row.
A row i is weaker than a row j if one of the following is true:
The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Find the K weakest rows. 
Example:
m = 4, n = 4, k = 2
Matrix:
1 0 0 0
1 1 1 1
1 0 0 0
1 0 0 0 */

import java.util.*;

public class Test {
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
        if (this.soldiers == r2.soldiers) {
            return this.idx - r2.idx;
        } else {
            return this.soldiers - r2.soldiers;
        }
    }
    }
    public static void main(String args[]) {
        int army[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
        };
            int k=2;

            PriorityQueue<Row> pq = new PriorityQueue<>();

            for (int i = 0; i < army.length; i++) {
            int count = 0;
                    
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
        
            pq.add(new Row(count, i));
            }

            for (int i = 0; i < k; i++) {
             System.out.println("R" + pq.remove().idx);
        }
    }
}
