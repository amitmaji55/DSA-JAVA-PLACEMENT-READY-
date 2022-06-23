class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> st = new Stack<>();
            
            TreeNode node = root;
            
            while(true)
            {
                if(node!=null)
                {
                        
                     st.push(node);
                     node = node.left;
                        
                }
                    else
                    {
                            if(st.isEmpty())
                               {
                                       break;
                               }
                            node = st.pop();
                            list.add(node.val);
                            node = node.right;
                    }
                    
            }
        return list;
    }
}

//https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
