public class PalindromeDemo {

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

    // Add node at last
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked List
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find middle node
    public Node Findmid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Check if Linked List is palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        Node MidNode = Findmid(head);

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = MidNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare left and right halves
        Node right = prev; // head of reversed second half
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeDemo ll = new PalindromeDemo();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();

        if (ll.isPalindrome()) {
            System.out.println("Linked List is Palindrome");
        } else {
            System.out.println("Linked List is not Palindrome");
        }
    }
}