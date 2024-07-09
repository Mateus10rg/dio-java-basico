package Dio.Singleton;


/**
 * Singleton "apresado".
 *
 * @author falvojr
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance() {
        return instance;
    }
}
