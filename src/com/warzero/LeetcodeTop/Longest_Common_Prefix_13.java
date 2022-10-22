package com.warzero.LeetcodeTop;

import org.junit.jupiter.api.Test;

public class Longest_Common_Prefix_13 {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strs[0]);
        for(int i = 1; i <strs.length;i++){
               String n = strs[i];
               int z = 0;
               for(; z<stringBuilder.length()&&z<n.length();z++){
                   if(stringBuilder.charAt(z)!=n.charAt(z)) {
                       break;
                   }
               }
               stringBuilder.delete(z,stringBuilder.length());
        }

        return stringBuilder.toString();
    }


    @Test
    public void test(){
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
