class Solution {
    public int evalRPN(String[] tokens) {
        // lets build the stack broskii
        Stack<Integer> st = new Stack<>();
        // only need to check for operatorss wuhuuuuuuuu
        for(String s : tokens)
        {
            // what if + comes boii
            if(s.equals("+")) st.push(st.pop() + st.pop());
            else if(s.equals("*")) st.push(st.pop() * st.pop());
            else if(s.equals("-"))
            {
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            }
            else if(s.equals("/"))
            {
                int b = st.pop();
                int a = st.pop();
                st.push(a/b);                
            }
            else st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}