/*public class LinkList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //creating node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //newNode next=head
        newNode.next = head;
        //head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        //creating node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode next=tail
        tail.next = newNode;
        //tail=newNode
        tail = newNode;
    }

    //Printing LinkList
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

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.print();
        ll.addFirst((2));
        ll.print();
        ll.addFirst((1));
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(3);
        ll.print();
    }
}*/

//add linklist at middle
public class LinkList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //creating node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode next=head
        newNode.next = head;
        //head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        //creating node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //newNode next=tail
        tail.next = newNode;
        //tail=newNode
        tail = newNode;
    }

    //Printing LinkList
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

    //add value at middle
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst((2));
        ll.addFirst((1));
        ll.addLast(3);
        ll.addLast(3);
        ll.print();
        ll.add(2,9);
        ll.print();
    }
}

