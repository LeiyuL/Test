package com.ly;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class myDemo {

   /* public void testCode(){
        Scanner in = new Scanner(System.in);
        System.out.print("输入:");
        String inNumber =in.next();

        ArrayList list =  letterCombinations(inNumber);
        //返回
        System.out.print("输出:"+list);
    }*/
    ArrayList<String> res = new ArrayList<String>();
    String temp = "";
    public  ArrayList<String> letterCombinations(String inNunmber) {
        if(inNunmber.length() == 0 || inNunmber == null){
            return res;
        }
        HashMap<Character,String> map=new HashMap<Character,String>();
        map.put('0',""); map.put('1',"");map.put('2',"abc");
        map.put('3',"def");map.put('4',"ghi");map.put('5',"jkl");
        map.put('6',"mno"); map.put('7',"pqrs");map.put('8',"tuv");
        map.put('9',"wxyz");
        res = combine(inNunmber, 0,map);
        return res;
    }

    public ArrayList<String> combine(String inNunmber, int start, HashMap<Character,String> map){
        //达到字母组合的总数目，返回结果
        if(start == inNunmber.length()){
            res.add(temp);
            return res;
        }
        Character key = inNunmber.charAt(start);
        String str = map .get(key);
      //  Integer length = str.length();
     //   if (length ==0){
       //     combine(inNunmber, start + 1,map);
     //   }else {
            for (int i = 0; i < str.length(); i++) {
                temp = temp + str.charAt(i);
                combine(inNunmber, start + 1, map);
                temp = temp.substring(0, temp.length() - 1);
            }
      //  }
        return res;
    }

}
