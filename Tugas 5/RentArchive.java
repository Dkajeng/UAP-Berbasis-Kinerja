package Praktikum.Tugas5;

import java.util.ArrayList;

public class RentArchive {
    private  ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider , Car car, int rentDur){
        CarRent carRent = new CarRent(rider, car, rentDur);

        if(car.isStatus() == true){
            System.out.println("MOBIL BERHASIL DISEWA");
            rentData.add(carRent);
            car.setStatus(String.valueOf(false));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void Info(){
        System.out.println("-----------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-----------------------");
        for (CarRent rent : rentData){
            System.out.println("NAMA PELANGGAN : "+rent.getRider().getName());
            System.out.println("TIPE MOBIL     : "+rent.getCar().getMerk());
            System.out.println("NO. POLISI     : "+rent.getCar().getPolNum());
            System.out.println("LAMA RENTAL    : "+rent.getRentDur());
            System.out.println("-----------------------");
        }

    }
}
