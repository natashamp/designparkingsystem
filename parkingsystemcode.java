import java.io.*;
import java.util.*;

class ParkingSystem {
  private int[] count;
  public ParkingSystem(int big, int medium, int small) {
    this.count = new int[3];
    this.count[0] = big;
    this.count[1] = medium;
    this.count[2] = small;
  }

  public boolean addCar(int carType) {
    if (this.count[carType - 1] > 0){
      this.count[carType - 1]--;
      return true;
    } else {
      return false;
    }
  }
}

class Solution {
  public static void main(String[] args){
    // the amount of empty spaces for each car type
    int big = 1;
    int medium = 1;
    int small = 0;
    ParkingSystem obj = new ParkingSystem(big, medium, small);

    //adding one big car to the garage
    int carType = 1;
    boolean param_1 = obj.addCar(carType);
    System.out.println( param_1);

    //adding one medium car to the garage
    carType = 2;
    param_1 = obj.addCar(carType);
    System.out.println(param_1);

    //adding one small car to the garage
    carType = 3;
    param_1 = obj.addCar(carType);
    System.out.println(param_1);

    carType = 1;
    param_1 = obj.addCar(carType);
    System.out.println(param_1);
  }
}
