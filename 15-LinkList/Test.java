//detect loop or cycle in linkedslist
public class Test {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;

    public static boolean isCyclic(){//floyd's cycle algorithum
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;//detect loop or cycle
            }
        }
        return false;
    }
    public static void main(String[] args) {
    
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next = head.next;

        System.out.println(isCyclic());
    }
}
