import rx.Observable;

public class SimpleCreationExamples {

    public static void main(String[] args) {
        Observable<Integer> observable = null;

        System.out.println("---------------------------------------------");
        System.out.println("Observable creation from a single value");
        System.out.println("---------------------------------------------");
        observable = Observable.from(new Integer[]{42});
        observable.subscribe(System.out::println);
    }
}
