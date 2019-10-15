import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class FirstClassCitizenParameterIllustration {

    public static void main(String[] args) {
        System.out.println(concatAndTransform("Hello ", "World!", String::toUpperCase));

        // From a variable
        final Function<String, String> function = String::toUpperCase;
        System.out.println(concatAndTransform("Hello ", "World!", function));
    }

    public static String concatAndTransform(String a, String b, @Nullable Function<String, String> stringFunction) {
        if (stringFunction != null) {
            a = stringFunction.apply(a);
            b = stringFunction.apply(b);
        }

        return a + b;
    }
}
