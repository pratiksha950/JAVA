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

    public void addLast(int data) {
        //creating node
        Node newNode = new Node(data);
        size++;
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
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //remove value from first
    public int removeFirst(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

     //remove value from last
    public int removeLast(){
        if(size==0){
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=size-2
        Node prev=head;
        for(int i=0;i< size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return val; 
    }

    //reverse a link list
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;  
        }
        head=prev;
        
    }



       public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst((2));
        ll.addFirst((1));
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
       ll.removeFirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        ll.reverse();
        ll.print();
    }
}

