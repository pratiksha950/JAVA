/*### Build binary serach tree 
public class Test {

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

    public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
         inOrder(root);
    }
}*/

/*### search in BST- O(h)
public class Test {

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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }
    }

     public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
         inOrder(root);

        if(search(root , 1)){
            System.out.print("found");
        }else{
             System.out.print("not found");
        }
    }
}*/

/*### Deleting Node in Binary search tree- O(h)
public class Test {

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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }
    }

     public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root , int val){
        if(root.data < val){
            root.right = delete(root.right , val);
        }
        else if(root.data > val){
            root.left = delete(root.left , val);
        }

        else{ //voilla
        //case 1:leaf node
            if(root.left == null && root.right ==null){
                return null;
            }
        
        //case 2:one child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
        
        //case 3:both children
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right , IS.data);

        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
         inOrder(root);

       root = delete(root, 10);
       System.out.println();

       inOrder(root);
    }
}*/

/*### Print in Range- O(h)
public class Test {

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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }
    }

     public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }

    public static void printInRange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data<= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }else if(root.data < k1){
            printInRange(root.right, k1, k2);
        } else{
            printInRange(root.left, k1, k2);
        }
    }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        printInRange(root, 5, 10);
        System.out.println();
    }
}*/

/*### Print root to leaf nodes
import java.util.*;
public class Test {

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

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return search(root.right , key);
        }else{
            return search(root.left , key);
        }
    }

     public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }

public static void printPath(ArrayList<Integer> path){
    for(int i=0 ; i< path.size() ;i++){
        System.out.print(path.get(i) + "->");
    }
    System.out.println("null");
}

  public static void printLeaf2Node(Node root , ArrayList<Integer> path){
    if(root == null){
        return;
    }
    path.add(root.data);
    if(root.left == null && root.right == null){
        printPath(path);
    }
    printLeaf2Node(root.left , path);
    printLeaf2Node(root.right , path);
    path.remove(path.size()-1);

  }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        printLeaf2Node(root , new ArrayList<>());
        System.out.println();
    }
}*/


/*### check is valid bst or not
public class Test {

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


     public static Node Insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = Insert(root.left , val);
        }else{
            //right subtree
            root.right = Insert(root.right , val);
        }
        return root;
    }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left); 
        System.out.print(root.data + " ");
        inOrder(root.right); 
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static boolean isValidBST(Node root , Node min , Node max){
        if(root == null){
            return true;
        }

        if(min!=null && root.data <= min.data){
            return false;
        }
        else if(max!=null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left , min , root) && isValidBST(root.right , root , max);
    }


    public static void main(String[] args) {
        int values[] = {1,1,1};
        Node root = null;

        for(int i=0 ; i<values.length ; i++){
            root = Insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        if(isValidBST(root, null , null)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
       
    }
}*/

/*### Mirror of bst*/
public class Test {

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

    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }

        Node leftSubtree = createMirror(root.left);
        Node rightSubtree = createMirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

        return root;
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
        
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(11);
       
       root = createMirror(root);
       preOrder(root);
    }
}







