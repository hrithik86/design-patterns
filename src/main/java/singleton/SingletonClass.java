package singleton;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass() {

    }
    public static SingletonClass GetInstance() {
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
    public String getData() {
        return "Data returned";
    }
}

