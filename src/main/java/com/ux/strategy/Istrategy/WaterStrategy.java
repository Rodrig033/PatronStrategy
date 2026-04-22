package com.ux.strategy.Istrategy;

public class WaterStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Cálculando ruta en barco desde " + origin + " hacia " + destination);
    }
}
