// TODO: we need to add the missing classes!

// OK, I will add `Substractor` and s33309 will add `Adder`.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
