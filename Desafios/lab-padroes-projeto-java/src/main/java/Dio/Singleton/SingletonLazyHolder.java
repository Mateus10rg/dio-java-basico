package Dio.Singleton;

/**
 * Singleton "Lazy Holder".
 */

public class SingletonLazyHolder {

        private SingletonLazyHolder() {
            super();
        }

        private static class InstanceHolder {
            public static SingletonLazyHolder instancia = new SingletonLazyHolder();
        }

        public static SingletonLazyHolder getInstance() {
            return InstanceHolder.instancia;
        }
}
