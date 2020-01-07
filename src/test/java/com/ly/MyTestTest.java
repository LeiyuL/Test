package com.ly;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MyTestTest {

    @Before
    public void say(){
        System.out.println("---------");
    }
    @Test
    public void letterCombinations() {
        System.out.print(new MyTest().letterCombinations("423"));
    }
}