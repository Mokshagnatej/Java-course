package methods;

class computer{
    public void musicplaying(){
        System.out.println("Music playing!!!");
    }
    public String getflower(double cost){
      if(cost ==10)
        return "flowers";
      else if (cost <10 ) {
          return "Flower were 10 rupees";

      }
      else
          return "pay only 10 rupees";
    }
}
public class Demo_class {

    public static void main(String[]args){
        computer work = new computer();

        work.musicplaying();
        String flowers = work.getflower(49);
        System.out.println(flowers);
    }
}
