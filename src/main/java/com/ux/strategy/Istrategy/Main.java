package com.ux.strategy.Istrategy;

import com.ux.strategy.context.Navigator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Navigator navigator = new Navigator();
        System.out.print("Origen: ");
        String origen = scanner.next();

        System.out.print("Destino: ");
        String destino = scanner.next();

        System.out.println("----- Tipo de navegación -----");
        System.out.println("1. Road");
        System.out.println("2. Walk");
        System.out.println("3. Public transport");
        System.out.println("4. Water");
        System.out.println("5. Magic");

        System.out.print("Seleccione el tipo de navegación: ");
        int option = scanner.nextInt();
        RouteStrategy strategy;
        switch (option){
            case 1:
                strategy = new RoadStrategy();
                strategy.buildRoute(origen, destino);
                break;
            case 2:
                strategy = new WalkingStrategy();
                strategy.buildRoute(origen, destino);
                break;
            case 3:
                strategy = new PublicTransportStrategy();
                strategy.buildRoute(origen, destino);
                break;
            case 4:
                strategy = new WaterStrategy();
                strategy.buildRoute(origen, destino);
                break;
            case 5:
                strategy = new MagicStrategy();
                strategy.buildRoute(origen, destino);
                break;
            default:
                System.out.println("Opción no válida. Usando RoadStrategy por defecto");
                strategy = new RoadStrategy();
                strategy.buildRoute(origen, destino);
        }
    }
}
