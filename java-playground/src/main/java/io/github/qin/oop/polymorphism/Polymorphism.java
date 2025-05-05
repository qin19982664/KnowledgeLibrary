package io.github.qin.oop.polymorphism;
/**
 * 多态中的成员调用
 * */ 
class Base{
    String Var = "Base";

    // 虚方法
    void fun(){
        System.out.println("Base Method");
    }
}

class Sub extends Base{
    // 隐藏父类 publicVar
    String Var = "Sub";

    // 覆盖父类 fun() VMT表更新
    @Override
    void fun(){
        System.out.println("Sub Method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // 父类引用指向子类对象 实例内存中Header的Klass指针指向子类Klass对象
        Base base = new Sub();

        // 
        System.out.println(base.Var);// 输出"Base"

        // base实例 根据Klass对象中的VMT表获取fun()方法并执行
        // base实例 的Klass对象实际为Sub Klass对象
        // Sub Klass对象VMT表中的 fun()方法在JVM加载类时 将父类方法替换为子类方法
        base.fun();// 输出"Sub Method"
    }
}
