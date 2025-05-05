package io.github.qin.oop.extend;

class Base{
    // member variable 
    public String publicVar;
    private String privateVar;

    public Base() {
    }

    public Base(String publicVar, String privateVar) {
        this.publicVar = publicVar;
        this.privateVar = privateVar;
    }

    public String getPublicVar() {
        return publicVar;
    }

    public void setPublicVar(String publicVar) {
        this.publicVar = publicVar;
    }

    public String getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(String privateVar) {
        this.privateVar = privateVar;
    }
       
    void showVar(){
        System.out.println("publicVar: " + publicVar);
        System.out.println("privateVar: " + privateVar);
    }
}

class Sub extends Base{
    Sub(String publicVar, String privateVar){
        super(publicVar, privateVar);
    }

    
    public String subGetPublicVar() {
        return super.publicVar;
    }

    public String subGetPrivateVar(){
        // return super.privateVar; //[Error]: The field privateVar is not visible
        return super.getPrivateVar();
    }
}

public class Extend {
    public static void main(String[] args) {
        Sub sub = new Sub("public","private");
        System.out.println(sub.publicVar);
        sub.showVar();
    }    
}
