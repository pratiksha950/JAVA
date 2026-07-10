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

/* ### Nearby car problem */
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
}