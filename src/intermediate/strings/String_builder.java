package intermediate.strings;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("MokshagnaTej");
        //builder.append(" Reddy");
        //builder.deleteCharAt(4);
        builder.insert(0, "Kalepalli ");
        //builder.delete(0,8);
        //builder.reverse();
        System.out.println(builder);
    }
}
