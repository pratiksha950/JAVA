/*### Sorted array to balanced BST - O(n)
public class Bst2 {
     public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left); 
        preOrder(root.right); 
    }


    public static Node createBst(int arr[] ,int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = (start+end)/2;

        Node root = new Node(arr[mid]);

        root.left = createBst(arr , start , mid - 1);
        root.right = createBst(arr , mid+1 , end);

        return root;

    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};

        Node root = createBst(arr, 0, arr.length-1);
        preOrder(root);
    }
} */

 /*### BST to find balanced BST
import java.util.*;
public class Bst2 {
     public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

     public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left); 
        preOrder(root.right); 
    }

     public static void inOrder(Node root , ArrayList<Integer> inOrder){
        if(root == null){
            return;
        }
        inOrder(root.left, inOrder);
        inOrder.add(root.data);
        inOrder(root.right, inOrder);
    }


    public static Node createBst(ArrayList<Integer> inOrder ,int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = (start+end)/2;

        Node root = new Node(inOrder.get(mid));

        root.left = createBst(inOrder , start , mid - 1);
        root.right = createBst(inOrder , mid+1 , end);

        return root;
    }

    public static Node balancedBst(Node root){
        //inoerder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();

        inOrder(root, inOrder);

        //sorted inOrder
        root = createBst(inOrder, 0, inOrder.size()-1);
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = balancedBst(root);
        preOrder(root);
    }
} */

 /*### Size of largest BST 
public class Bst2 {
     public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isBst;
        int size;
        int max;
        int min;

        Info(boolean isBst ,int min , int max , int size){
            this.isBst = isBst;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    
    public static int maxBST = 0;

    public static Info largestBst(Node root){
        if(root == null){
            return new Info(true , Integer.MAX_VALUE , Integer.MIN_VALUE , 0);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);

        int size = leftInfo.size + rightInfo.size + 1;

        int min = Math.min(root.data , Math.min(leftInfo.min , rightInfo.min));
        int max = Math.max(root.data , Math.max(leftInfo.max , rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false , min , max ,size);
        }

        if(leftInfo.isBst && rightInfo.isBst){
            maxBST = Math.max(maxBST , size);
            return new Info(true  , min , max ,size);
        }

        return new Info(false ,min ,max ,size );
    }
   
    public static void main(String[] args) {
       Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
            
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);

        Info info = largestBst(root);
        System.out.print("Largest bst size = " + maxBST);
        
       
    }
}*/

 /*### AVL Tree-O(log(n)) */
public class Bst2 {

    public static class Node {

        int data, height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x) {

        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get Balance factor of node
    public static int getBalance(Node root) {

        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate keys not allowed
        }
        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));
        // Get root's balance factor
        int bf = getBalance(root);

        // Left Left Case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // Right Right Case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // Right Left Case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // Returned if AVL is balanced
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left); 
        preOrder(root.right); 
    }


    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);

    }
}
