package main.java.DataStructures.multibracket;

import java.util.HashMap;
import java.util.Stack;

//Solution walkthrough came from https://www.programcreek.com/2012/12/leetcode-valid-parentheses-java/

public class MultiBracketValidation {

    public static boolean validate(String s){
        HashMap<Character, Character> validatorMap = new HashMap<Character, Character>();
        validatorMap.put('(', ')');
        validatorMap.put('[', ']');
        validatorMap.put('{', '}');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i< s.length(); i++){
            char current = s.charAt(i);

            if(validatorMap.keySet().contains(current)) {
                stack.push(current);
            } else if (validatorMap.values().contains(current)){
                if(!stack.empty() && validatorMap.get(stack.peek()) == current) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
