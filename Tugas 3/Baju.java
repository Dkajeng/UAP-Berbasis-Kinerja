public class Baju {
        String jenis;
        int harga;
        int jumlah;
        public Baju(String a, int b){
            this.jenis = a;
            this.jumlah = b;
        }
        final int bajua = 100000;
        final int bajub = 125000;
        final int bajuc = 175000;
        void hargaa(){
            if (jumlah > 100) {
                harga = 95000;
            }else {
                harga = bajua;
            }
        }
        void hargab(){
            if (jumlah > 100) {
                harga = 120000;
            }else{
                harga = bajub;
            }
        }

        void hargac(){
            if (jumlah > 100) {
                harga = 160000;
            }else{
                harga = bajuc;
            }
        }
        void display(){
            if (jenis.equalsIgnoreCase("a"))
                hargaa();
            else if (jenis.equalsIgnoreCase("b"))
                hargab();
            else if (jenis.equalsIgnoreCase("c"))
                hargac();
            System.out.println("Jenis yang anda beli : " + jenis);
            System.out.println("Harga per buah       : " + harga);
            System.out.println("Total harga          : " + harga * jumlah);

        }

    }