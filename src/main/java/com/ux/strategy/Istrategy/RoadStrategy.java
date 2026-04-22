package com.ux.strategy.Istrategy;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Cálculando ruta en auto desde " + origin + " hacia " + destination);
    }
}
