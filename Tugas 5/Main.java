package Praktikum.Tugas5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CarRider Ferli = new CarRider("Ferli",19,"089736541898");
        CarRider Salma = new CarRider("Salma", 18, "082647619876");
        CarRider Sasa = new CarRider("Sasa", 19, "08625496127");
        CarRider Riris = new CarRider("Riris", 19,"03746721938");

        CarData info = new CarData();
        info.addCar("SPORT", "B 1234 WSD","FERRARI");
        info.addCar("SUV", "AG 5678 HEH", "VOLVO");
        info.addCar("SEDAN", "N 8763 AJk", "INOVA");
        info.addCar("TRUCK", "B 9270", "MITSUBISHI");

        info.listOfCar();

        RentArchive archive = new RentArchive();
        archive.Rent(Ferli, CarData.carList.get(0),11);
        archive.Rent(Sasa, CarData.carList.get(2),5);
        archive.Rent(Salma, CarData.carList.get(1),2);
        archive.Rent(Riris, CarData.carList.get(2),9);

        archive.Info();

    }
}
