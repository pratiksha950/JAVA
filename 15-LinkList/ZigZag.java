/* ### Zig-Zag Linked ListFor a linked list of the form :
L(1)->L(2)->L(3)->L(4) ... L(n-1)->L(n)
convert it into a zig-zag form i.e. :
L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)... */

public class ZigZag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //creating node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode next=head
        newNode.next = head;
        //head=newNode
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("link list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void ZZ(){

        //first mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse  second half 
        Node prev = null;
        Node curr= mid.next;
        mid.next =null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right = prev;
        Node NextL, NextR;

        //alt merge-zig-zag merge
        while(left!=null && right!=null){
            NextL = left.next;
            left.next = right;
            NextR = right.next;
            right.next = NextL;

            left = NextL;
            right = NextR;
        }
    }
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addFirst((1));
        ll.addFirst((2));
        ll.addFirst((3));
        ll.addFirst((4));
        ll.addFirst((5));
        ll.addFirst((6));
        ll.print();
        ll.ZZ();
        ll.print();
}}
