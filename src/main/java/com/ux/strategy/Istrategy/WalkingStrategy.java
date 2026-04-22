package com.ux.strategy.Istrategy;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Cálculando ruta caminando desde " + origin + " hacia " + destination);
    }
}
