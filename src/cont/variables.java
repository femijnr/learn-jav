package cont;

public class variables {
    public static void main(String[] args) {

        String a = "first";
        String b = "aid";
        String temp;

        temp = a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);


        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

    }
}
