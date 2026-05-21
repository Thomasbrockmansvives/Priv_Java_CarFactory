package be.thomasbrockmans;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
      List<CarDesign> carDesignList;
      private int countCarDesigns;

      public CarFactory(){
            carDesignList = new ArrayList<>();
            this.countCarDesigns = 0;
      }

      public Car createCar(int orderNumber){
            if(orderNumber > countCarDesigns){
                  throw new IndexOutOfBoundsException("Your order number does not exist.");
            }
            return carDesignList.get(orderNumber).designCar();
      }

      public void addCarDesign(CarDesign carDesign){
            if(carDesign == null){
                  throw new IllegalArgumentException("You did not define a correct car design.");
            }
            else{
                  carDesignList.add(carDesign);
                  countCarDesigns += 1;
            }
      }

      public int getCountCarDesigns(){
            return countCarDesigns;
      }
}
