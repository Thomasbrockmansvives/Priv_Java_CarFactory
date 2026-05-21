package be.thomasbrockmans;

public class Store {

      static void main(String[] args) {
            System.out.println("===== CAR FACTORY =====");
            System.out.println("");

            CarFactory factory = FactoryMaker.getFactory();

            factory.createCar(0).printCar();
            factory.createCar(1).printCar();
            factory.createCar(2).printCar();
            factory.createCar(3).printCar();
      }

      public static class FactoryMaker{
            public static CarFactory getFactory(){
                  CarFactory factory = new CarFactory();
                  factory.addCarDesign(new CarDesign() {
                        @Override
                        public Car designCar() {
                              return new Car("Fiesta",95,110,"Phantom Black", "HatchBack");
                        }
                  });
                  factory.addCarDesign(new CarDesign() {
                        @Override
                        public Car designCar() {
                              return new Car("Focus", 150,165,"Race Red", "HatchBack");
                        }
                  });
                  factory.addCarDesign(new CarDesign() {
                        @Override
                        public Car designCar() {
                              return new Car("Puma",125,130,"Desert Island Blue", "Crossover");
                        }
                  });
                  factory.addCarDesign(new CarDesign() {
                        @Override
                        public Car designCar() {
                              return new Car("Kuga",190, 200, "Moondust Silver","SUV");
                        }
                  });

                  return factory;

            }
      }
}
