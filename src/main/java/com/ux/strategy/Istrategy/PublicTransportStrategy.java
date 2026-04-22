package com.ux.strategy.Istrategy;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Cálculando ruta en autobús desde " + origin + " hacia " + destination);
    }
}
