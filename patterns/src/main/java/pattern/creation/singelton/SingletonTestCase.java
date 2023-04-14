package pattern.creation.singelton;

public class SingletonTestCase {
    public static void main(String[] args) {
        System.out.println("Если видно одинаковые значения - синглтон использовался повторно");
        System.out.println("Если видны разные - создано 2 синглтона");

        Singleton singleton = Singleton.getInstance("first");
        Singleton singleton2 = Singleton.getInstance("second");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}