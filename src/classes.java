class calculator{

    public double add(double n1, double n2){
       double r = n1 + n2;
       return r;
    }
}


public class classes {
    public static void main(String[] args){
        double num1 = 782.3;
        double num2 = 324.2;
    calculator cal = new calculator();
    double result = cal.add(num1,num2);
//        double sum = num1+num2;
      System.out.println(result);
    }
}
