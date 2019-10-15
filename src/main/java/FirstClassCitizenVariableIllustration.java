import java.util.function.BiFunction;

public class FirstClassCitizenVariableIllustration {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (s, t) -> s + t;

        System.out.println(concat.apply("hello ", "world"));

        concat = FirstClassCitizenVariableIllustration::concatString;

        System.out.println(concat.apply("hello ", "world"));

        final FirstClassCitizenVariableIllustration firstClassCitizenVariableIllustration = new FirstClassCitizenVariableIllustration();
        final BiFunction<String, String, String> concatString2 = firstClassCitizenVariableIllustration::concatString2;

        System.out.println(concatString2.apply("hello ", "world"));
    }

    private static String concatString(String a, String b) {
        return a + b;
    }

    String concatString2(String a, String b) {
        return a + b;
    }
}
