public class Tugas2 {
    public static double hitungLuas (int sisi) {
        return sisi*sisi;
    }
    public static double hitungLuas(int panjang, int lebar){
        return panjang*lebar;
    }
    public static double hitungLuas(int jarijari, double pi){
        return pi*jarijari*jarijari;
    }
    public static double hitungKeliling (int sisi){
        return sisi*4;
    }
    public static double hitungKeliling (int panjang, int lebar){
        return 2* (panjang + lebar);
    }
    public static double hitungKeliling (int jarijari, double pi){
        return 2*pi*jarijari;
    }
    public static void pilihJenisBangunDatar(){
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 :
                System.out.print("Masukan sisi persegi : ");
                int sisi = input.nextInt();
                System.out.println("Luas persegi : " + hitungLuas(sisi) + "\n" + "Keliling persegi : " + hitungKeliling(sisi));
                break;
            case 2 :
                System.out.print("Masukan panjang persegi : ");
                int panjang = input.nextInt();
                System.out.print("Masukan lebar persegi : ");
                int lebar = input.nextInt();
                System.out.println("Luas persegi panjang : " + hitungLuas(panjang,lebar) + "\n" + "Keliling persegi panjang : " + hitungKeliling(panjang,lebar));
                break;
            case 3 :
                System.out.print("Masukan jari - jari lingkaran : ");
                int jariJari = input.nextInt();
                System.out.println("Luas lingkaran : " + hitungLuas(jariJari,Math.PI) + "\n" + "Keliling lingkaran : " + hitungKeliling(jariJari,Math.PI));
                break;
            }
        }
        public static void main(String[] args) {
        System.out.println("Masukan bangun datar : \n");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.print("3.Lingkaran\nMasukan pilihan : ");
        pilihJenisBangunDatar();
    }

}
