package io.github.qin.oop;

import java.util.Objects;

public class ObjectDemo {
   public static void main(String[] args) {
      Object obj = new Object();
      System.out.println(obj.toString()); // java.lang.Object@{address}
      System.out.println(obj);            // java.lang.Object@{address}
      
      //default compare to address
      System.out.println(obj.equals(obj));

      System.out.println(obj.hashCode());

      System.out.println(Objects.isNull(obj));
   } 
}
