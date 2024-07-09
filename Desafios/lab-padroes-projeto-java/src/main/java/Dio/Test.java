package Dio;

import Dio.Facede.Facede;
import Dio.Strategy.*;
import Dio.Singleton.SingletonEager;
import Dio.Singleton.SingletonLazy;
import Dio.Singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy == singletonLazy2);

        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager == singletonEager2);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder == singletonLazyHolder2);

        System.out.println("========================");


        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();


        System.out.println("========================");

        Facede facede = new Facede();
        facede.migrarCliente("João", "12345678");

    }
}
