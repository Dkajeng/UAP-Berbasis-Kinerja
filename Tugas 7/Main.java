package Praktikum.Tugas7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> Filkom = new ArrayList<Pegawai>();
        System.out.println("======== DATABASE FILKOM ========\n");
        Filkom.add(new PegawaiTetap("Baji", "215150700111021", 2000000));
        Filkom.add(new PegawaiTetap("Gurfa", "3556725636537", 1500000));
        Filkom.add(new PegawaiTetap("Tony", "215150700111021", 3000000));
        
        // System.out.println("======== PEGAWAI HARIAN =======\n");
        Filkom.add(new PegawaiHarian("Samuel", "112313123123123", 8500, 40));
        Filkom.add(new PegawaiHarian("Irfan", "45676543456765", 4000, 36));
        Filkom.add(new PegawaiHarian("Bardi", "65432345654345", 8000, 50));

        // System.out.println("============ SALES ===========\n");
        Filkom.add(new Sales("Andik", "215514532665022", 50, 50000));
        Filkom.add(new Sales("Alesha", "215145452424488", 40, 40000));
        Filkom.add(new Sales("Ajeng", "215514532665022", 60, 40000));

        for (int i = 0; i < Filkom.size(); i++) {
            getToString(Filkom.get(i));
            System.out.println("-".repeat(30));
            System.out.println();
        }
    }

    public static void getToString(Pegawai p){
        if (p instanceof PegawaiTetap) {
            PegawaiTetap pegawaiTetap = (PegawaiTetap) p;
            System.out.println(pegawaiTetap.toString()); 
        }else if(p instanceof PegawaiHarian){
            PegawaiHarian pegawaiHarian = (PegawaiHarian) p;
            System.out.println(pegawaiHarian.toString());
        }else if (p instanceof Sales) {
            Sales sales = (Sales) p;
            System.out.println(sales.toString());
        }
    }
}