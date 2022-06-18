package Praktikum.Tugas5;

import java.util.ArrayList;

public class CarData {
   public static ArrayList<Car> carList = new ArrayList<Car>();

   public void addCar(String carType, String polNum, String merk){
       Car car = new Car(carType,polNum,merk,true);
       carList.add(car);
   }

   public void listOfCar(){
       System.out.println("--------------------------------");
       System.out.printf("%-15s","DAFTAR MOBIL\n");
       System.out.println("--------------------------------");
       for (Car cars : carList){
           System.out.println("TIPE MOBIL : "+ cars.getCarType());
           System.out.println("NO. POLISI : "+ cars.getPolNum());
           System.out.println("MERK MOBIL : "+ cars.getMerk());
           System.out.println("--------------------------------");
       }
   }
}
