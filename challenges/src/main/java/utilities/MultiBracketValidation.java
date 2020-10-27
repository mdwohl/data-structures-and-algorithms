//package utilities;
////https://www.programcreek.com/2012/12/leetcode-valid-parentheses-java/ provided source for this
//
//import java.util.*;
//
//public class MultiBracketValidation {
//
//    public static boolean bracketValidation(String input){
//        HashMap<Character, Character> map = new HashMap<Character, Character>();
//        map.put('(', ')');
//        map.put('[', ']');
//        map.put('{', '}');
//
//        Stack<Character> stack = new Stack<Character>();
//
//        for (int i = 0; i < input.length(); i++){
//            char current = input.charAt(i);
//
//            if(map.keySet().contains(current)) {
//                stack.push(current);
//            } else if (map.values().contains(current)){
//                if (!stack.empty() && map.get(stack.peek()) == current){
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//        return stack.empty();
//    }
//}
//
