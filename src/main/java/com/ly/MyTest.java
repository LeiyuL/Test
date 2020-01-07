package com.ly;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    public  List<String> letterCombinations(String inNunmber) {
        if(inNunmber.length() == 0 || inNunmber == null){
            return new ArrayList<String>();
        }
        HashMap<Character,String> map=new HashMap<Character,String>();
        map.put('0',""); map.put('1',"");map.put('2',"abc");
        map.put('3',"def");map.put('4',"ghi");map.put('5',"jkl");
        map.put('6',"mno"); map.put('7',"pqrs");map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> resList = new ArrayList<String>();//结果集
        Character qqq  = inNunmber.charAt(0);
        String first = map.get(inNunmber.charAt(0));
        for(char c : first.toCharArray()) {
            resList.add(c+"");
        }
        for(int i=1;i<inNunmber.length();i++) {
            String str = map.get(inNunmber.charAt(i));
            resList = addNextStr(resList,str);
        }
        return resList;
    }
    //添加拼接下一个字符串
    //eg:(23)
    //			a	b	c
    //===>		ad	ae	af	bd	be	bf	cd	ce	cf
    private  List<String> addNextStr(List<String> resList, String str) {
        List<String> newList = new ArrayList<String>();
        for(String s : resList) {
            for(char nextCh : str.toCharArray()) {
                newList.add(s+nextCh);
            }
        }
        return newList;
    }
}
