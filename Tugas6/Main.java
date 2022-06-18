package Praktikum.Tugas6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> Filkom = new ArrayList<Manusia>();

        Filkom.add(new Manusia("Aku", "3923842934",true, true));
        Filkom.add(new Manusia("Kamu", "0987654567", false, true));
        Filkom.add(new Manusia("Dia", "5676547656", true, false));
        
        Filkom.add(new MahasiswaFilkom("I Gede Manuk", "351923848239", false,false, "205150601111018",3.85));
        Filkom.add(new MahasiswaFilkom("I Made Ngurah", "636436434639", true,true, "343242342342343",3.70));
        Filkom.add(new MahasiswaFilkom("I Ngurah Rai", "7654345676543", true,false, "67876545676543",2.95));

        Filkom.add(new Pekerja(9, 25,"195105839283", "Aldy Wijaya", "351717969", true,true));
        Filkom.add(new Pekerja(6, 29,"724234434234", "Vionatte Guyon", "654567678", false,true));
        Filkom.add(new Pekerja(12, 20,"365434567877", "Sampun Dior", "45432346545", true,false));
        
        Filkom.add(new Manajer(9, 20,"204837283728", "Diajeng Kinasih", "3517073843920",false, false, 1500));
        Filkom.add(new Manajer(10, 17,"345676545678", "Andhika Ihsan ", "8765434567876",true, true, 900));
        Filkom.add(new Manajer(11, 25,"989899410988", "Naila Alesha ", "6543456789876",true, false, 600));
        
        for (Manusia manusia : Filkom) {
            System.out.println(manusia.toString());
            System.out.println("===============================================");
        }

        
    }
}
