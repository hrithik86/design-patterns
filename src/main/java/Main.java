import singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonObj1 = SingletonClass.GetInstance();
        SingletonClass singletonObj2 = SingletonClass.GetInstance();
        String data = singletonObj1.getData();
        System.out.println(data);
    }
}
