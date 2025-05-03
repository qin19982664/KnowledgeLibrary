package io.github.qin.oop;

class Base{
    static String staticVar = "staticVar";
}

final class Tool{
    //Make the constructor private to prevent instantiation. 
    private Tool(){   
    }

    static int getStringLenght(String str){
        return str.length();
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        
        Base base1 = new Base();
        Base base2 = new Base();

        // About static variables
        {
            // Static variables should be accessed through the class name (recommended).
            System.out.println(Base.staticVar);
            
            // Access static variables through an instance (not recommended)
            System.out.println(base1.staticVar);
            System.out.println(base2.staticVar);

            // Don't do it like this.
            base1.staticVar = "staticVar1";
            // Access static variable through the class name.
            System.out.println(Base.staticVar);
            // Access static variable through the instance.
            System.out.println(base1.staticVar);
        }

        // About static methods
        {
            String str = "Hello world!";
            System.out.println(Tool.getStringLenght(str));
        }
    }
}
