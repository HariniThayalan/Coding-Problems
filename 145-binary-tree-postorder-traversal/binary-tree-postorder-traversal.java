class Solution 
{
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        if (root == null) 
        {
            return res;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) 
        {
            TreeNode curr = st.pop();
            res.add(curr.val); 
            if (curr.left != null) 
            {
                st.push(curr.left);
            }
            if (curr.right != null) 
            {
                st.push(curr.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
}