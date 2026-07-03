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

/*### Deleting Node in Binary search tree- O(h)*/
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
}

