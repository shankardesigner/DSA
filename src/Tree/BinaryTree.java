package Tree;

public class BinaryTree {
    Node root;
    BinaryTree(String data) {
        root = new Node(data);
    }
    BinaryTree() {
        root = null;
    }

    /*
    *    1
    * /    \
    * 2     5
    * /\    /
    * 3 4  6
    * */

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("R");
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        tree.root.left = nodeA;
        tree.root.right = nodeB;

        nodeA.left = nodeC;
        nodeA.right = nodeD;

        nodeB.left = nodeE;
        nodeB.right = nodeF;

        nodeF.left = nodeG;

        System.out.println("--------------- Pre order ----------------");
        preOrderTraversal(tree.root);
        System.out.println(" ");
        System.out.println("---------------- Post order ---------------");
        postOrderTraversal(tree.root);
        System.out.println(" ");
        System.out.println("----------------- In order --------------");
        inOrderTraversal(tree.root);
        System.out.println(" ");
        System.out.println("-------------------------------");
    }

    /*
    * -------------------------------
     R A C D B E F G
    -------------------------------
     C D A E G F B R
    -------------------------------
     C A D R E B G F
    -------------------------------
    * */

    static void preOrderTraversal(Node node) {
        if(node == null) return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    static void postOrderTraversal(Node node) {
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    static void  inOrderTraversal(Node node) {
        if(node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

}
