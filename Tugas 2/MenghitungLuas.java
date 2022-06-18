public class MenghitungLuas {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pil = sc.nextInt();
            Soal jawaban = new Soal();
            switch (pil) {
                case 1:
                    jawaban.s = sc.nextInt();
                    System.out.println(jawaban.persegi(jawaban.s));
                    break;
                case 2:
                    jawaban.a = sc.nextInt();
                    jawaban.t = sc.nextInt();
                    System.out.println(jawaban.segitiga(jawaban.a, jawaban.t));
                    break;
                case 3:
                    jawaban.r = sc.nextInt();
                    if (jawaban.r % 7 == 0) {
                        System.out.println((double) jawaban.Lingkaran1(jawaban.r));
                        break;
                    } else {
                        System.out.println((double) jawaban.Lingkaran2(jawaban.r));
                        break;
                    }

                default:
                    System.out.println("Input yang anda masukan tidak sesuai");
            }
        }
    }

    class Soal {
        int s, r, a, t;

        int persegi(int luas) {
            return s * s;
        }

        int segitiga(int alas, int tinggi) {
            return a * t / 2;
        }

        int Lingkaran1(int luas) {
            return (int)(22/7*r*r);
        }

        int Lingkaran2(int luas2) {
            return (int)(3.14 * r * r);
        }
    }