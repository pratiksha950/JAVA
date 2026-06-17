/* ### Stack using Arraylist
import java.util.ArrayList;
public class Stack {
    public static class StackDemo{
        static ArrayList<Integer> list =new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void Push(int data){
            list.add(data);
        }
        //pop
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size() - 1);
            return top; 
        }
        //peek 
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1); 
        }
    }
    public static void main(String args[]){
        StackDemo s =new StackDemo();
        // s.Push(1);
        // s.Push(2);
        // s.Push(3);
        // s.Push(4);
        // s.Push(5);
       
        System.out.print(s.peek());

        while(! s.isEmpty()){
            System.out.print(s.peek());
           s.Pop();
        }
    }
}
*/

/* ### Stack using LinkedList 
public class Stack {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class StackDemo{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        //push
        public static void Push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        StackDemo s =new StackDemo();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        s.Push(5);
       
        // System.out.print(s.peek());

        while(! s.isEmpty()){
            System.out.print(s.peek());
           s.pop();
        }
    }
}
*/

/* ### Stack using Collection framework
import java.util.*;
public class StackB {

    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
       
        // System.out.print(s.peek());

        while(! s.isEmpty()){
            System.out.print(s.peek());
           s.pop();
        }
    }

} */

/* ### Push at bottom of stack */
import java.util.*;
public class StackB {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
       
        // System.out.print(s.peek());
        pushAtBottom(s,9);

        while(! s.isEmpty()){
            System.out.print(s.peek());
           s.pop();
        }
    }

}

