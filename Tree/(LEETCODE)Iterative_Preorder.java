class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
            List<Integer> list = new ArrayList<Integer>();
            if(root==null)
                    return list;
            
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            while(!st.isEmpty())
            {
                    root = st.pop();
                    list.add(root.val);
                    if(root.right!=null)
                            st.push(root.right);
                    if(root.left!=null)
                            st.push(root.left);
                    
            }
            return list;
                  
                   
    }
}

//https://leetcode.com/problems/binary-tree-preorder-traversal/
