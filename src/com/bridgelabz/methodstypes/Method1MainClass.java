package com.bridgelabz.methodstypes;

public class Method1MainClass {
    static int x =100;//static variable
    static int y = 200;// instance variable
    static void method1(){
        int y = 400;
        System.out.println("Static method called ");
        System.out.println(y);//if local and instance variable name same then if access i have access directly reference given to be local variable
        Method1MainClass obj1 = new Method1MainClass();
        System.out.println(obj1.x);
    }
    void method3(){
        method1();
        System.out.println("Non-static method 2");
    }
    void method2(){
        method1();
        method3();//if we want to access non-method in non-method then we don't want to create again another method
        // because we are also create a method for non-static method2
        System.out.println("Non-static Method Called ");
        System.out.println(y);//access static variable within a class
        System.out.println(x);//also create a object for accessing non-static variable so don't need to create 2 time obj
    }

    public static void main(String[] args) {
        System.out.println("Welcome method program");
        Method1MainClass obj1 = new Method1MainClass();
        System.out.println("Instance variable print");
        System.out.println(obj1.x);//access instance variable
        System.out.println("Method2 non-static method print");
        obj1.method2();//call non-static method
        System.out.println("method1 print static");
        method1();//call static method (we don't want obj  to call static method)
        System.out.println("print static variable");
        System.out.println(y);
        obj1.x = 500;
        System.out.println(obj1.x);


    }
}
