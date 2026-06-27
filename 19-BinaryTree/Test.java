//Height of binary tree
/* 

public class Test {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    //calculate total nodes in tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    //calculating sum of all nodes
    public static int sum(Node root){
         if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right.left = new Node(6);

        root.right.right = new Node(7);

        System.out.println("Height of tree is = " + height(root));
        System.out.println("Total count of node in tree is = " + count(root));
        System.out.println("total sum of all nodes is = " + sum(root));
    }
}
*/

/*### Top view of tree */
import java.util.*;
public class Test{
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
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }


    public static void topView(Node root){
        //level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min=0, max=0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                    continue;
                }
            }else{
                if(!map.containsKey(curr.hd)){ //first time my hd is occurring
                map.put(curr.hd , curr.node);
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left , curr.hd-1));
                min = Math.min(min , curr.hd-1);
            }

            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
            }
        }

        for(int i=min; i<=max ;i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        /*
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5);
        root.right.left = new Node(6);

        root.right.right = new Node(7);

       topView(root);
        
    }
}

