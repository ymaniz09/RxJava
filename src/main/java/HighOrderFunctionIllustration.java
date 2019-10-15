import java.util.function.Function;
import java.util.function.Supplier;

public class HighOrderFunctionIllustration {

    public static void main(String[] args) {
        final Supplier<String> supplier = createCombineAndTransform("Hello ", "World!", String::toUpperCase);

        System.out.println(supplier.get());
    }

    public static Supplier<String> createCombineAndTransform(
            final String a,
            final String b,
            final Function<String, String> function
    ) {
        return () -> {
            String aa = a;
            String bb = b;

            if (function != null) {
                aa = function.apply(a);
                bb = function.apply(b);
            }
            return aa + bb;
        };
    }
}
