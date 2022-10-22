package com.warzero.LeetcodeTop;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer_14 {

    public int romanToInt(String s) {

        int res = 0;
        Map<String, Integer> RtoDec = new HashMap<>();
        RtoDec.put("I",1);
        RtoDec.put("V",5);
        RtoDec.put("X",10);
        RtoDec.put("L",50);
        RtoDec.put("C",100);
        RtoDec.put("D",500);
        RtoDec.put("M",1000);
        RtoDec.put("IV",4);
        RtoDec.put("IX",9);
        RtoDec.put("XL",40);
        RtoDec.put("XC",90);
        RtoDec.put("CD",400);
        RtoDec.put("CM",900);


        for(int i = 0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(i+1 < s.length()){
                String c2 = c + s.charAt(i + 1);
                if(RtoDec.containsKey(c2)){
                    res+=RtoDec.get(c2);
                    i=i+1;
                    continue;
                }
            }
            res+=RtoDec.get(c);
        }
        return res;
    }

    @Test
    public void test(){
       System.out.println(romanToInt("MCMXCIV"));
    }
}
