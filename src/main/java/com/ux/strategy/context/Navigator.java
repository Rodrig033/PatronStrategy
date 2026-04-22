package com.ux.strategy.context;

import com.ux.strategy.Istrategy.PublicTransportStrategy;
import com.ux.strategy.Istrategy.RoadStrategy;
import com.ux.strategy.Istrategy.RouteStrategy;
import com.ux.strategy.Istrategy.WalkingStrategy;

public class Navigator {
    public static void main(String[] args) {
        RouteStrategy strategy = new PublicTransportStrategy();
        strategy.buildRoute("Xalapa", "Ciudad de México");
        strategy = new WalkingStrategy();
        strategy.buildRoute("Insurgentes", "Xalapeños ilustres");
        strategy = new RoadStrategy();
        strategy.buildRoute("Ciudad de México", "Valle de Bravo");
    }
}
