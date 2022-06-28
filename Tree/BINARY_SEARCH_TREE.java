class BST{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
        public static Node insert(Node root,int val)
        {
            if(root==null){
                root = new Node(val);
                return root;
            }
            if(root.data>val)
            {
              root.left  = insert(root.left,val);
            }
            else {
                root.right = insert(root.right,val);
            }
            return root;
        }
        public static void inorder(Node root)
        {
            if(root==null)
                return;
            inorder(root.left);
            System.out.println(" "+root.data);
            inorder(root.right);
        }
        public static boolean search(Node root,int val)
        {
            if(root==null)
                return false;
            if(root.data>val)
                return search(root.left,val);
            else if(root.data==val)
                return true;
            else
                return search(root.right,val);
        }


        public static void main(String[] args) {
            int[] value = {5,1,3,4,2,7};
            Node root = null;
            for (int i=0;i< value.length;i++)
            {
                root = insert(root,value[i]);
            }
            inorder(root);
            System.out.println();
            if(search(root,10))
                System.out.println("Found :)");
            else
                System.out.println("Not Found ):");
        }
    }
}
