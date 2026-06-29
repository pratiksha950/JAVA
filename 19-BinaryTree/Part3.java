/*### Kth level node print O(n)

public class Part3 {
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

    public static void kLevel(Node root , int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        kLevel(root.left , level+1 , k);
        kLevel(root.right , level+1 , k);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right.left = new Node(6);

        root.right.right = new Node(7);

        int k=3;

        kLevel( root ,1 , k);
    }
} */

/*### Lowest common ancestor- approch-1

import java.util.ArrayList;

public class Part3 {
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

    public static boolean getPath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundleft = getPath(root.left , n , path);
        boolean foundright = getPath(root.right , n , path);

        if(foundleft || foundright){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

    public static Node lowestAncestor(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root , n1 , path1);
        getPath(root , n2 , path2);

        //last common ancestor
        int i;
        for(i=0 ;i < path1.size() && i< path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        //last euqal node
        Node lca = path1.get(i-1);
        return lca;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right.left = new Node(6);

        root.right.right = new Node(7);

        System.out.println(lowestAncestor( root , 6,7 ).data);
    }
}
*/

/*### Lowest common ancestor- approch-2*/

import java.util.ArrayList;

public class Part3 {
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


    public static Node lca2(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(rightLca == null){
            return leftLca;
        }
         if(leftLca == null){
            return rightLca;
        }
        return root;
    }

    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right.left = new Node(6);

        root.right.right = new Node(7);

       

        System.out.println(lca2( root , 4,7 ).data);
    }
}


