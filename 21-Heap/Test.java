/*### PriorityQueue concept*/
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
}
