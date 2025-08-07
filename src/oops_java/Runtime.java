package oops_java;

import java.sql.SQLOutput;

class phone{
    public void phno(){
        System.out.println("SIM1");
    }
}
 class phone1 extends phone{
     @Override
     public void phno() {
         System.out.println("SIM2");
     }
     public void phmodel(){
         System.out.println("oppo");
     }
 }
 class phone2 extends phone{
     @Override
     public void phno() {
         System.out.println("SIM3");
     }

 }
 class phone3 extends phone{
    public void phno(){
        System.out.println("SIM4");
    }
 }

public class Runtime {
    public static void main(String[] args) {
        phone p1= new phone1();
        p1.phno();
//        p1.phmodel // not allowed
    }
}
