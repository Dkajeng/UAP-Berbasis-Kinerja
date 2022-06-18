import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("Selamat datang di Game Filkom Defend");
        System.out.print("Masukkan Nama Player : ");
        String nama = in.nextLine();
        System.out.println("Silahkan Pilih Role Anda: ");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");
        System.out.print("Masukkan Pilihan: ");
        int pilih = 0;
        try {
            pilih = in.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan Pilihan Yang Sesuai");
            in.nextLine();
            pilih = in.nextInt();
        }
        in.nextLine();

        if (pilih != 1 && pilih != 2 && pilih != 3){
            System.out.println("Masukkan Pilihan Yang Sesuai");
            try {
                pilih = in.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan Pilihan Yang Sesuai");
                in.nextLine();
                pilih = in.nextInt();
            }
            in.nextLine();
        }

        ArrayList<Character> hero = new ArrayList<>();

        if (pilih == 1){
            hero.add(new Magician());
        }
        else if (pilih == 2){
            hero.add(new Healer());
        }
        else if (pilih == 3){
            hero.add(new Warrior());
        }

        hero.add(new Titan());

        System.out.println("\nSelamat datang " + nama);
        Class role = hero.get(0).getClass();
        System.out.println("Anda akan bermain sebagai " + role.getSimpleName() + "\n");

        System.out.println("=== STATUS PLAYER ===");
        info(hero.get(0));
        System.out.println("=== STATUS MUSUH ===");
        info(hero.get(1));

        System.out.println();

        int i = 1;
        do {
            System.out.println("=== Turn " + i + " ===");
            if (hero.get(0).attack()) {
                hero.get(1).receiveDamage(hero.get(0).getAttack());
            }
            i++;
            System.out.println(nama + " HP\t:"+ hero.get(0).getHP());
            System.out.println("Enemy HP\t:"+ hero.get(1).getHP());
            if (hero.get(1).getHP() == 0)
                break;

            System.out.println("=== Turn " + i + " ===");
            if (hero.get(0) instanceof Healer) {
                System.out.println("Hero Mendapatkan Heal!");
                ((Healer) hero.get(0)).heal();
            }

            if (hero.get(1).attack()) {
                hero.get(0).receiveDamage(hero.get(1).getAttack());
            }
            System.out.println(nama + " HP\t:"+ hero.get(0).getHP());
            System.out.println("Enemy HP\t:"+ hero.get(1).getHP());
            i++;
        }
        while(hero.get(0).getHP() != 0 && hero.get(1).getHP() != 0);
        System.out.println("----------------------------------------");
        if (hero.get(0).getHP() == 0)
            System.out.println(nama + " Kalah");
        else
            System.out.println(nama + " Menang");

        System.out.println("=== STATUS PLAYER ===");
        info(hero.get(0));
        System.out.println("=== STATUS MUSUH ===");
        info(hero.get(1));
    }

    static void info(Character hero){
        Class role = hero.getClass();
        System.out.println("Role\t:" + role.getSimpleName() );
        hero.info();
    }
}
