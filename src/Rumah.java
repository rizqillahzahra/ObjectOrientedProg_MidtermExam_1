import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Rumah {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        double HargaTemp1 = 0;
        double HargaTemp2 = 0;
        double HargaTotal;
        char inputLagi;
        
        Locale locale = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        Sultan sultanArab = new Sultan(1, "Sultan Arab", 2100000000);
        Sultan sultanAsia = new Sultan(2, "Sultan Asia", 1700000000);
        Sultan sultanAfrika = new Sultan(3, "Sultan Afrika", 1000000000);

        Expatriat expatriatImport = new Expatriat(1, "Expatriat Import", 988000000);
        Expatriat expatriatLokal = new Expatriat(2, "Expatriat Lokal", 920000000);
        Expatriat expatriatNew = new Expatriat(3, "Expatriat New", 900000000);

        System.out.println("---------- Welcome to Toko Jual Rumah -----------");
        System.out.println("=================================================");
        System.out.print("Masukkan Nama Pelanggan : " + "\t");
        String namaPembeli = scanner.nextLine();
        System.out.print("Masukkan No.HP Pelanggan : " + "\t");
        String noHP = scanner.nextLine();
        System.out.println("-----------------------<*>-----------------------");
        System.out.print  ("Apakah Anda ingin membeli : [y/t]" + "\t");
        char input = scanner.next().charAt(0);

        while (input == 'y') {
            System.out.println("-----------------------<*>-----------------------");
            System.out.println("Jenis Rumah yang Tersedia : " + "\n"
            + "1. SULTAN" +  "\n"
            + "2. EXPATRIAT");
            System.out.println("-----------------------<*>-----------------------");
            System.out.print  ("Pilihan Rumah : " + "\t");
            int pilihRumah = scanner.nextInt();
            if (pilihRumah == 1) {
                System.out.println("-----------------------<*>-----------------------");
                System.out.println("\t\t" + "RUMAH JENIS SULTAN");
                System.out.println("-----------------------<*>-----------------------");
                System.out.println(sultanArab);
                System.out.println(sultanAsia);
                System.out.println(sultanAfrika);
                System.out.println("-----------------------<*>-----------------------");
                System.out.print  ("Pilihan Anda : " + "\t");
                int pilihJenis = scanner.nextInt();
                System.out.print  ("Banyaknya Rumah yang Dibeli: " + "\t");
                int banyaknyaRumah = scanner.nextInt();
                if (pilihJenis == 1) {
                    sultanArab.setJumlahRumah(banyaknyaRumah);
                    HargaTemp1 = HargaTemp1 + sultanArab.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp1));
                }
                else if (pilihJenis == 2) {
                    sultanAsia.setJumlahRumah(banyaknyaRumah);
                    HargaTemp1 = HargaTemp1 + sultanAsia.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp1));
                }
                else if (pilihJenis == 3) {
                    sultanAfrika.setJumlahRumah(banyaknyaRumah);
                    HargaTemp1 = HargaTemp1 + sultanAfrika.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp1));
                }
                System.out.println("Data Tersimpan");
                HargaTotal = HargaTemp1;
            }
            else if (pilihRumah == 2) {
                System.out.println("-----------------------<*>-----------------------");
                System.out.println("\t\t" + "RUMAH JENIS EXPATRIAKI");
                System.out.println("-----------------------<*>-----------------------");
                System.out.println(expatriatImport);
                System.out.println(expatriatLokal);
                System.out.println(expatriatNew);
                System.out.println("-----------------------<*>-----------------------");
                System.out.print  ("Pilihan Anda : " + "\t");
                int pilihJenis = scanner.nextInt();
                System.out.print  ("Banyaknya Rumah yang Dibeli: " + "\t");
                int banyaknyaRumah = scanner.nextInt();
                if (pilihJenis == 1) {
                    expatriatImport.setJumlahRumah(banyaknyaRumah);
                    HargaTemp2 = HargaTemp2 + expatriatImport.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp2));
                }
                else if (pilihJenis == 2) {
                    expatriatLokal.setJumlahRumah(banyaknyaRumah);
                    HargaTemp2 = HargaTemp2 + expatriatLokal.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp2));
                }
                else if (pilihJenis == 3) {
                    expatriatNew.setJumlahRumah(banyaknyaRumah);
                    HargaTemp2 = HargaTemp2 + expatriatNew.getBesaranRumah();
                    System.out.println("Harga sebesar : " + "\t" + numberFormat.format(HargaTemp2));
                }
                System.out.println("Data Tersimpan");
                HargaTotal = HargaTemp2;
            }
            else {
                System.out.println("-----------------------<*>-----------------------");
                System.out.println("------------------Invalid Input------------------");
                System.out.println("-----------------------<*>-----------------------");
                break;
            }
            System.out.print("Beli rumah lagi: " + "\t");
            inputLagi = scanner.next().charAt(0);
            if (inputLagi == input) {
                input = inputLagi;
            }
            else break;
            
        }
        HargaTotal = HargaTemp1 + HargaTemp2;
        System.out.println("Total harga yang harus dibayar : " + numberFormat.format(HargaTotal));
        System.out.println("Terimakasih " + namaPembeli + " sudah membeli rumah di Toko Jual Rumah" + "\n"
                + "Rumah idaman dan nyaman. Kami solusinya ^_^");
        while (input == 't') {
            System.out.println("-----------------------<*>-----------------------");
            System.out.println("-------------SILAKAN DATANG KEMBALI--------------");
            System.out.println("-----------------------<*>-----------------------");
            break;
        }
    }
}
