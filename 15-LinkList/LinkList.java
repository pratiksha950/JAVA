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

    //delete nth node from backword or from last
    public void DeleteNthFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//remove first
            return;
        }
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //check palindrome or not
    //slow-fast approch
    public Node Findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//slow is mid
    }
   
   
    public boolean isPalindrom(){
        if(head==null || head.next==null){
            return true;
        }
         //1st step-find mid
         Node MidNode = Findmid(head);

        //2nd step-reverse 2nd half
        Node prev=null;
        Node next;
        Node curr=MidNode;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left=head;

        //3rs step -check left and right half are same are not
        while(right!=null){
            if(left.data != right.data){
                return false;

            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

       public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst((2));
        ll.addFirst((1));
        ll.addLast(2);
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

        // ll.addLast(1);
        // ll.addLast(3);
        // ll.print();
        // ll.DeleteNthFromEnd(2);
        // ll.print();

        System.out.print(ll.isPalindrom());

    }
}

