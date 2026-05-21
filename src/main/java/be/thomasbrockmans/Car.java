package be.thomasbrockmans;

public class Car {
      String modelName;
      int horsePower;
      int range;
      String color;
      String type;

      public Car(String modelName, int horsePower, int range, String color, String type){
            this.modelName = modelName;
            this.horsePower = horsePower;
            this.range = range;
            this.color = color;
            this.type = type;
      }

      public String toString(){
            return "%s,  %s %s (%d pk - %d kW)".formatted(this.modelName.toUpperCase(), this.color, this.type, this.horsePower, this.range);
      }

      public void printCar(){
            System.out.println(toString());
      }
}
