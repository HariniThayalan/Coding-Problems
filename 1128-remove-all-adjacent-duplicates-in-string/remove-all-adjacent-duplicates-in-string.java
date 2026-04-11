class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char a = s.charAt(i);
            if (!st.isEmpty() && st.peek() == a) 
            {
                st.pop(); 
            } else 
            {
                st.push(a); 
            }
        }
        char[] c = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            c[i] = st.pop(); 
        }

        return new String(c);
    }
}