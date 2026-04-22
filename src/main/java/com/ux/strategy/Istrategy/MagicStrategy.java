package com.ux.strategy.Istrategy;

public class MagicStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Se teletransportará desde " + origin + " hasta "  +destination);
        System.out.println("¡Abracadabra! ");
    }
}
