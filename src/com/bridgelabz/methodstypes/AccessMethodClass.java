package com.bridgelabz.methodstypes;

public class AccessMethodClass {
    public static void main(String[] args) {
        Method1MainClass obj2= new  Method1MainClass();
        System.out.println(obj2.y);
        obj2.method2();
        Method1MainClass.method1();//call outside class static method using class name
    }
}
