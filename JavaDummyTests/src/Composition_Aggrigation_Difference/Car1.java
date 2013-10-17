//Compisition
package Composition_Aggrigation_Difference;
final class Car {
  private final Engine engine;

  Car(int hp) {
    engine = new Engine(hp);
  }

  void move() {
    engine.work();
  }
}