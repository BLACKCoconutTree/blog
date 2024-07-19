package com.example;

public class AppTest {
    public static void main(String[] args) {
        Father f = new Son();
        //方法看右边
        //属性看左边 属性没有多态
        System.out.println(f.x);
    }

}
