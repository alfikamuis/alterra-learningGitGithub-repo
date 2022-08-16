import java.util.Scanner;

public class PerpustakaanApp {
    static Scanner scan = new Scanner(System.in);
    static String pilihanUser;

    public static void main(String[] args) {

        boolean lanjutkanProses = true;
        while(lanjutkanProses){

            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilihan:");
            pilihanUser = scan.nextLine();

            switch (pilihanUser){
                case "1":
                    System.out.println("\nList Buku");
                    break;
                case "2":
                    System.out.print("\nCari Buku ? ");
                    break;
                case "3":
                    System.out.println("\nTambah buku");
                    break;
                case "4":
                    System.out.println("\nUbah buku");
                    break;
                case "5":
                    System.out.println("\nHapus buku");
                    break;
                default:
                    System.err.println("\nInput salah, gunakan angak 1-5 ");
            }

        }

    }
}

