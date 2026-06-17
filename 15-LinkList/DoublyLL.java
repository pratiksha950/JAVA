public class DoublyLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        System.out.println("null");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
            int val = head.data;
            size --;
            head = head.next;
            head.prev = null;
            return val;
    }

    public int removeLast(){
        if(tail == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
            int val = tail.data;
            size --;
            tail = tail.prev;
            tail.next = null;
            return val;
    }

    public static void reverse(){
       Node curr = head ;
       Node prev = null;
       Node next;

       while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
       }
       head = prev ;
    }



    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

        dll.addLast(33);
         dll.addLast(5);
          dll.addLast(3);
        dll.print();
        System.out.println(dll.size);

        // dll.removeLast();
        // dll.print();
        // System.out.println(dll.size);

        dll.reverse();
         dll.print();
        System.out.println(dll.size);
    
    }
}
