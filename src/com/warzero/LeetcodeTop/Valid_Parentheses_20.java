package com.warzero.LeetcodeTop;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Valid_Parentheses_20 {
    public boolean isValid(String s) {//例子：{【（）】}
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            //如果是左括号，就向栈的顶部放对应的右括号
            if(c=='(')stack.push(')');
            else if(c=='[')stack.push(']');
            else if(c=='{')stack.push('}');
            //循环到右括号时，查看顶部（数组的话来说就是最后一个元素）是否等于之前放进来的元素，如果pop出来的元素不等于之前放进的，亦或是栈中元素排除完则会为false
            else if(stack.isEmpty()||c!=stack.pop())return false;
        }
        return stack.isEmpty();
    }

    @Test
    public void test(){
        String s = "(]";
        System.out.println(isValid(s));
    }
}
