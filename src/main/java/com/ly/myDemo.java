package com.ly;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class myDemo {

   public static  Map<Character,String> myMap = new HashMap<Character,String>();
    static{
        myMap.put('0',null);
        myMap.put('1',null);
        myMap.put('2',"ABC");
        myMap.put('3',"DEF");
        myMap.put('4',"GHI");
        myMap.put('5',"JKL");
        myMap.put('6',"MNO");
        myMap.put('7',"PQRS");
        myMap.put('8',"TUV");
        myMap.put('9',"WXYZ");
    }

    static ArrayList<String> res = new ArrayList<String>();
    static String temp = "";
    public  static ArrayList<String> letterCombinations(String inNunmber) {
        if(inNunmber.length() == 0 || inNunmber == null){
            return res;
        }
       /* HashMap<Character,String> map=new HashMap<Character,String>();
        map.put('0',""); map.put('1',"");map.put('2',"abc");
        map.put('3',"def");map.put('4',"ghi");map.put('5',"jkl");
        map.put('6',"mno"); map.put('7',"pqrs");map.put('8',"tuv");
        map.put('9',"wxyz");
        res = combine(inNunmber, 0,map);*/
        res = combine2(inNunmber, 0);
        return res;
    }

    public static ArrayList<String> combine(String inNumber, int start, HashMap<Character,String> map){
        //达到字母组合的总数目，返回结果
        if(start == inNumber.length()){
            res.add(temp);
            return res;
        }
        Character key = inNumber.charAt(start);
        String str = map .get(key);
        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.charAt(i);
            combine(inNumber, start + 1, map);
            temp = temp.substring(0, temp.length() - 1);
        }
        return res;
    }

    public static ArrayList<String> combine2(String inNumber, int start){
        //达到字母组合的总数目，返回结果
        if(start == inNumber.length()){
            res.add(temp);
            return res;
        }
        Character key = inNumber.charAt(start);
        String str = myMap .get(key);
        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.charAt(i);
            combine2(inNumber, start + 1);
            temp = temp.substring(0, temp.length() - 1);
        }
        return res;
    }
}
