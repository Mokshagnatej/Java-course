class computer{
    int num1 = 8;
    int num2 = 4;
public int add1(int num1,int num2){
    return num1+num2;
}
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class Stack_Heap_data {
    public static void main(String[]args){
       computer obj = new computer();
       computer obj1 = new computer();
       obj.add(10, 20);
       obj1.add1(8,4);
       System.out.println("Addition of two numbers is: " + obj.add(10, 20));
       System.out.println("num value are:"+ obj.add1(8,4));
    }
}
