import java.util.LinkedList;
public class LLUsingPackage {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(5);
        ll.addFirst(2);
        ll.addFirst(3);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
