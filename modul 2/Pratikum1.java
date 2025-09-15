import java.util.Scanner;
    public class Pratikum1 {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Menu: ");
            System.out.println("1. menghitung luas dan keliling persegi panjang\n2. menghitung luas dan keliling lingkaran\n3. menghitung luas dan keliling segitiga ");
            System.out.print("Pilihan anda: ");
            int pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("Masukan Panjang : ");
                    int panjang = input.nextInt();
                    System.out.print("Masukan Lebar : ");
                    int lebar = input.nextInt();

                    int keliling = 2*(panjang + lebar);
                    int luas = panjang * lebar;

                    System.out.printf("Keliling Persegi Panjang : %d cm\nLuas Persegi Panjang : %d cm2\n", keliling, luas);
                    break;
                case 2: 
                    System.out.print("Masukan Jari-Jari : ");
                    int r = input.nextInt();
                    double phi = 3.14;

                    double kel = phi * (2 * r);
                    double luasLingkaran = phi * Math.pow(r, 2);

                    System.out.printf("Keliling Lingkaran : %.2f cm\nLuas Lingkaran : %.2f cm2\n", kel, luasLingkaran);
                    break;
                case 3: 
                    System.out.print("Masukan Alas : ");
                    int alas = input.nextInt();
                    System.out.print("Masukan Tinggi : ");
                    int tinggi = input.nextInt();
                    System.out.print("Masukan Sisi Miring : ");
                    int miring = input.nextInt();

                    int luasSegitiga = alas * tinggi / 2 ;
                    int kelilingSegitiga = alas + tinggi + miring;

                    System.out.printf("Keliling Segitiga : %d cm\nLuas Segitiga : %d cm2\n", kelilingSegitiga, luasSegitiga);
                    break;

                default :
                    System.out.print("Data tak ditemukan, program dihentikan ...");

            }   
        }
    }
