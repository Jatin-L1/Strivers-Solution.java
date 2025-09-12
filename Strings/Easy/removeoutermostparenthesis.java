package Strings.Easy;

import java.util.Stack;

public class removeoutermostparenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        int n = s.length();
        int i =0;

        while(i<n){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                st.add(s.charAt(i));

            }
            else{
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    
}
