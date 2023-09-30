class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack = new Stack<>();
        Stack<Character>stack2 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.empty())
                {
                    stack.pop();
                }
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                stack2.push(t.charAt(i));
            }
            else
            {
                if(!stack2.empty())
                {
                    stack2.pop();
                }
            }
        }
        return stack.equals(stack2);
    }
}