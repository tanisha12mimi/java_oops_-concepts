package oops_java;


//compiletime  or methodoverloading
class cardetails{
    public static void car(){
        System.out.println("default method");
    }
    public static String car(String caramodel){
        return caramodel;
    }
    public static long car(long price ){
        return price;
    }

}
public class polymmarohism {
    public static void main(String[] args) {
        cardetails.car();
        cardetails.car("AUDI");
        cardetails.car(1000000l);
    }
}
