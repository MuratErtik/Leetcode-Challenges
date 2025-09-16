package org.example;
import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
     */

    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        //convert string to char stack
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));

            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(s.charAt(i)==')'){
                        if(stack.peek()!='('){
                            return false;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    else if(s.charAt(i)==']'){
                        if(stack.peek()!='['){
                            return false;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    else if(s.charAt(i)=='}'){
                        if(stack.peek()!='{'){
                            return false;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;



    }
}
