import java.io.*;
import java.util.*;

    public class Selde {

        public static int angka, balikan, angka2;

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            angka = 0;
            balikan = 0;
            angka = in.nextInt();
            angka2 = angka;
            pembalikan(angka, balikan);

        }

        public static void pembalikan(int angka, int balikan) {
            while (angka != 0) {

                balikan = balikan * 10;
                balikan = balikan + angka % 10;
                angka = angka / 10;
            }
            if (balikan == angka2) {
                System.out.println(angka2 + " adalah selde.");

            } else {
                System.out.println(angka2 + " bukan selde.");
            }
        }
    }
