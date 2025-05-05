package io.github.qin.oop.abstractclass;

public class AbstractClass {
    public static void main(String[] args) {
        
    }
}

// “图形” 作为一个概念，是抽象而非具体的
abstract class Shape {
    // 面积作为图形的属性，当图形不确定时，面积的计算方法是不确定的
    protected abstract double getArea();
}

// 圆形继承图形 它们符合"is-a"关系 即 圆形是图形
// 当我们书写提供其父类中 getArea() 的具体实现时 报错 "The type Circle must implment the inherited abstract method Shape.getArea()"
// 编译器强制 子类 实现 抽象父类中的抽象方法 否则不通过编译
class Circle extends Shape {

    @Override
    protected double getArea() {
        return 2 * this.radius * this.radius * PI;
    }

    // 每个具体的圆的圆周率是相同的，因此它应该作为 static 静态的，因为这个属于这类事物
    // 圆周率是常量，因此它应该作为 final 不可修改的
    static final double PI = Math.PI;
    
    // 圆的半径
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public static double getPi() {
        return PI;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

}