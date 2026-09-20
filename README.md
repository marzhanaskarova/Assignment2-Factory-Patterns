# Assignment 2: Factory Method and Abstract Factory

## Project Description

This project demonstrates two creational design patterns in Java: Factory Method and Abstract Factory.

The application is a simple logistics system that supports two types of transportation: ROAD and SEA. It also supports two operating system interface families: WINDOWS and MACOS.

The user can choose the required transport and operating system. The application then creates the corresponding transport and user interface components.

## Technologies

Java, JDK 17, IntelliJ IDEA, Git and GitHub.

## Factory Method

The Factory Method pattern is implemented in the `factorymethod` package.

The `Transport` interface is the product interface. `Truck` and `Ship` are concrete products that implement `Transport`.

The `Logistics` class is the creator and contains the `createTransport()` factory method.

`RoadLogistics` and `SeaLogistics` are concrete creators. `RoadLogistics` creates a `Truck`, while `SeaLogistics` creates a `Ship`.

The structure is:

Logistics → RoadLogistics → Truck

Logistics → SeaLogistics → Ship

## Abstract Factory

The Abstract Factory pattern is implemented in the `abstractfactory` package.

The `Button` and `Checkbox` interfaces are abstract products.

`WindowsButton` and `WindowsCheckbox` are Windows concrete products.

`MacOSButton` and `MacOSCheckbox` are MacOS concrete products.

The `GUIFactory` interface is the abstract factory. `WindowsFactory` and `MacOSFactory` are concrete factories.

`WindowsFactory` creates a Windows button and Windows checkbox. `MacOSFactory` creates a MacOS button and MacOS checkbox.

## Application Integration

The `DeliveryApplication` class combines both design patterns.

It receives a `Logistics` object and a `GUIFactory` object through its constructor. It uses these interfaces to create the required transport and UI components.

The `Main` class reads the user's choices and selects the required logistics and GUI factories.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is configured.
3. Run `Main.java`.
4. Choose a transport: ROAD or SEA.
5. Choose an operating system: WINDOWS or MACOS.

For example:

Choose transport (ROAD/SEA): ROAD

Choose OS (WINDOWS/MACOS): WINDOWS

The output will be:

Rendering Windows button

Rendering Windows checkbox

Truck delivers Laptop to Astana

Another example:

Choose transport (ROAD/SEA): SEA

Choose OS (WINDOWS/MACOS): MACOS

The output will be:

Rendering MacOS button

Rendering MacOS checkbox

Ship delivers Laptop to Astana

## Invalid Input Handling

The application also handles invalid user input.

If an invalid transport is entered, for example AIR, the application displays:

Invalid transport choice.

If an invalid operating system is entered, for example LINUX, the application displays:

Invalid OS choice.

## Design Patterns Together

Factory Method is responsible for creating the transport objects, such as Truck and Ship.

Abstract Factory is responsible for creating related UI components, such as WindowsButton with WindowsCheckbox or MacOSButton with MacOSCheckbox.

Both patterns are integrated into the same logistics application through the `DeliveryApplication` class.

## Conclusion

This project demonstrates the use of Factory Method and Abstract Factory in one Java application.

Factory Method provides flexibility for creating different transport objects, while Abstract Factory creates compatible families of user interface components.

The application supports ROAD and SEA transportation and WINDOWS and MACOS interface families.
