package Singleton;

public class Singleton {

    int data = 0;

    Singleton() {
    };
    
    private static class SingletonHelper {
        private static final Singleton INSTANCEUNIQUESINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCEUNIQUESINGLETON;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

}
