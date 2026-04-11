class Solution {

    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty())
        {
            while(curr!=null)
            {
                res.add(curr.val);
                st.push(curr);
                curr=curr.left;
            }
            TreeNode top=st.pop();
            curr=top.right;
        }
        return res;
    }
}