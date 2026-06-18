/*Next Greater Element The next greater element of some element x in an array is the first greater element that is to the right of x in the same array. arr = [6, 8, 0, 1, 3]
next Greater = [8, -1, 1, 3, -1]

import java.util.*;
public class Quetions {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //while
            while(!s.isEmpty() && arr[i]>= arr[s.peek()]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nextGreater[i]= -1;
            }else{
                nextGreater[i]= arr[s.peek()];
            }
            //push in s
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i] + " ");
        }

        System.out.println();
    }
}*/


/*Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. */

import java.util.Stack;

public class Quetions {
    public static boolean isValid(String str){
        Stack<Character> s =new Stack<>(); 
        for(int i=0; i<str.length() ;i++){
            char ch =str.charAt(i);
            //opening
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()== '(' && ch == ')') ||
                   (s.peek()== '{' && ch == '}') ||
                   (s.peek()== '[' && ch == ']')) {

                    s.pop();
                    
                  }else{
                    return false;
                  }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println(isValid(str));
}
}