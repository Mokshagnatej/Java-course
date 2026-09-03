package intermediate.methods;

class OverloadCalculator {
    public int add(int n1,int n2,int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public double add(double n1,double n2)
    {
        return n1 + n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args){

        OverloadCalculator cal = new OverloadCalculator();
        int r1 = cal.add(10, 20, 30);
        System.out.println("Addition of three numbers is: " + r1);
        int r2 = cal.add(10, 20);
        System.out.println("Addition of two numbers is: " + r2);
        double r3 = cal.add(10.2, 20.5);
        System.out.println("Addition of two decimal numbers is: " + r3);
    }
}
