package com.company;

import java.util.Stack;

public class 올바른괄호 {
    static boolean answer = true;
    public static void main(String[] args) {
        올바른괄호 main = new 올바른괄호();
        // test
        String str = "()()"; //true
//        String str = ")()("; //false
//        String str = "(()("; //false

        answer = main.solution(str);

        System.out.println(answer);
    }

    public boolean solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == ')') return false; // ) 시작이면 false

            if (!stack.isEmpty() && str.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(str.charAt(i)); // '(' 푸시
            }
        }

        return stack.isEmpty()? true : false;
    }
}

