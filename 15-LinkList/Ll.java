/* Search (Iterative)
Search for a key in a Linked List.
Return the position where it is found.
If not found, return -1.
*/

/*public class Ll {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public int IterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Ll ll = new Ll();

        // Creating Linked List: 10 -> 20 -> 30
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int pos = ll.IterativeSearch(20);

        System.out.println("Position = " + pos);
    }
}*/

/* Search (recursion)
Search for a key in a Linked List.
Return the position where it is found.
If not found, return -1.
*/

public class Ll {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public int helper(Node head,int key) {
       if(head==null){
        return -1;
       }
       if(head.data==key){
        return 0;
       }
       int idx=helper(head.next,key);
       if(idx==-1){
        return -1;
       }

       return idx+1;

    }

    public int RecursionSearch(int key) {
       return helper(head,key);
    }

    public static void main(String[] args) {
        Ll ll = new Ll();

        // Creating Linked List: 10 -> 20 -> 30
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int pos = ll.RecursionSearch(30);

        System.out.println("Position = " + pos);
    }
}
