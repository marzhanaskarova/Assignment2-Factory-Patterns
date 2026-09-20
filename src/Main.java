import abstractfactory.DeliveryApplication;
import abstractfactory.GUIFactory;
import abstractfactory.MacOSFactory;
import abstractfactory.WindowsFactory;
import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose transport (ROAD/SEA): ");
        String transport = scanner.nextLine().toUpperCase();

        System.out.print("Choose OS (WINDOWS/MACOS): ");
        String os = scanner.nextLine().toUpperCase();

        Logistics logistics;

        if (transport.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (transport.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid transport choice.");
            return;
        }

        GUIFactory guiFactory;

        if (os.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (os.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Invalid OS choice.");
            return;
        }

        DeliveryApplication app =
                new DeliveryApplication(logistics, guiFactory);

        app.run("Laptop", "Astana");
    }
}