package advanced.oop_basics;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);

    }
}
public class static_keyword {
    public static void main(String[] args){

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 2000;
        Mobile.name ="Iphone";

        m1.show();
        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price= 1700;
        Mobile.name ="Android";


      m2.show();
    }
}