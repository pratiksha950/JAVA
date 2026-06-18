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
Every close bracket has a corresponding open bracket of the same type.


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
} */

/*Duplicate Parentheses
Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
Return true if it contains duplicates else return false.
Examples
(((a + (b))) + (c + d)) → true
((((a) + (b)) + c + d)) → true
((a + b) + (c + d)) → false
(((a + b)) + c) → true 

import java.util.Stack;
public class Quetions {
    
    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>(); 

        for(int i=0; i<str.length() ;i++){
            char ch =str.charAt(i);
            //opening , operator ,operands
            
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }  
                if(count < 1){
                    return true; //duplicate
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a-b)";
        System.out.println(isDuplicate(str2));
        System.out.println(isDuplicate(str));
}
}*/

/*Max Area in Histogram
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram 
heights = [2,1,5,6,2,3] */

import java.util.Stack;
public class Quetions {
    
    public static void maxArea(int arr[]){
       int maxArea =0;
       int nsr[] = new int[arr.length];
       int nsl[] = new int[arr.length];
       //Next Smaller Right
       Stack<Integer> s=new Stack<>();

       for(int i=arr.length-1; i>=0; i--){
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }else{
            nsr[i]=s.peek();
        }
        s.push(i);
       }
       //Next Smaller Right
       s=new Stack<>();

       for(int i=0; i<arr.length; i++){
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
       }
       //current area
       //width=nsr[i]-nsl[i]-1
       for(int i=0 ; i<arr.length; i++){
         int height = arr[i];
         int width = nsr[i]-nsl[i]-1;
         int currArea = height * width;
         maxArea = Math.max(currArea , maxArea);
       }

       System.out.print("max area in histogram is = "+ maxArea);

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
}
}