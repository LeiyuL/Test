package com.ly;

import org.junit.Before;
import org.junit.Test;

public class myDemoTest {

    @Before
    public void say(){
        System.out.println("---------");
    }
    @Test
    public void letterCombinations() {
        System.out.print("输出:"+new myDemo().letterCombinations("235"));
    }
}