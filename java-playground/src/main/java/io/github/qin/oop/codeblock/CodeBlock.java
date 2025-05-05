package io.github.qin.oop.codeblock;

/**
 * 
 * 局部代码块：
 *  1.控制变量的生命周期
 * 
 * */ 

public class CodeBlock {
    public static void main(String[] args) {
        {
            int tempVar = 0;
        }
        // System.out.println(tempVar);//Error: tempVar cannot be resolved

        Base base1 = new Base(1);
        Base base2 = new Base(2);
    }
}

class Base { 
    private int privateVar; 

    public Base(int privateVar) { 
        this.privateVar = privateVar;
        System.out.println("construction completed");
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    // construction block
    {
        System.out.println("before in constructor method");
    }

    // static block
    static {
        System.out.println("On the first instantiation of the class");
    }
}