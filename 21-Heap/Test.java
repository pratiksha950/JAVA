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

/*### Insert in Heap*/
import java.util.*;
public class Test {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last ind
            arr.add(data);
            int x = arr.size() - 1 ; //child idx
            int par = (x-1)/2; //parent idx

            while(arr.get(x) < arr.get(par)){  // O(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x , arr.get(par));
                arr.set(par , temp);
            }
        }
    }

    public int peek(){
        return arr.get(0);
    }

    public static void main(String[] args) {
        

    }
}

