package io.github.qin.oop.innerclass;

public class AnonymousInnerClass {    
    public static void main(String[] args) {
        new I(){
            @Override
            public void sout() {
                System.out.println("sout");
            }
        }.sout();;

       new C().fun();;
    }
}

class C{
    void fun(){
        System.out.println("fun is running...");
    }
}

interface I{   
    void sout();
}

