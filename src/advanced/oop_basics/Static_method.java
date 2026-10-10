package advanced.oop_basics;

class mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
    }

    public mobile(){
        brand = "";
        price = 132;
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Static_method {
 public static void main(String[] args){

    mobile m1 = new mobile();
    m1.brand = "Samsung";
    m1.price = 12000;
    m1.show();
    mobile m2 = new mobile();
    m2.brand = "Apple";
    m2.price = 15000;
    m2.show();
 }
}
