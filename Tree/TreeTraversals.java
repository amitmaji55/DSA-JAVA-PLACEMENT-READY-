class Node{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}

class  Binary_Tree{
    Node root;
    Binary_Tree()
    {
        root = null;
    }
    void inorder(Node node)
    {
        if(node==null)
            return;
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    void preorder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node)
    {
        if(node==null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");
    }
    void preorder(){preorder(root);};
    void inorder(){inorder(root);}
    void postorder(){postorder(root);}

    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        System.out.print(
                "Preorder traversal of binary tree is ");
        bt.preorder();

        System.out.print(
                "Inorder traversal of binary tree is ");
        bt.inorder();

        System.out.print(
                "Postorder traversal of binary tree is ");
        bt.postorder();
    }
}
