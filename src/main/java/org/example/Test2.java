package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
@Test
    public static  void m2(){
        System.out.println("sample class");
    }

    @Test
    public static  void m22(){
        System.out.println(" m22 sample class");
    }
@BeforeMethod
    public static  void before(){
        System.out.println("before sample class");
    }


}
