package pboif2.pkg10119079.latihan29.warnakepribadian;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   Coding melihat kepribadian seseorang dari warna
 *
 */
public class PBOIF210119079Latihan29WarnaKepribadian {

    public static void main(String[] args) {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";
        
        String bgRed = "\u001b[41m";
        String bgGreen = "\u001b[42m";
        String bgYellow = "\u001b[43m";
        String bgBlue = "\u001b[44m";
        String bgPurple = "\u001b[45m";
        
        System.out.print(RED + "YUK " + RESET);
        System.out.print(GREEN + "CEK " + RESET);
        System.out.print(YELLOW + "KEPRIBADIANMU " + RESET);
        System.out.print(CYAN + "DARI " + RESET);
        System.out.print(PURPLE + "WARNA " + RESET);
        System.out.println(BLUE + "FAVORITMU " + RESET);
        
        System.out.println("");
        
        System.out.print(bgRed + WHITE + "\t MERAH \t\t\n" + RESET);
        System.out.print(bgGreen + WHITE + "\t HIJAU \t\t\n" + RESET);
        System.out.print(bgYellow + WHITE + "\t KUNING \t\n" + RESET);
        System.out.print(bgBlue + WHITE + "\t BIRU \t\t\n" + RESET);
        System.out.print(bgPurple + WHITE + "\t UNGU \t\t\n" + RESET);
        
        String warna,nama;
        Scanner input = new Scanner(System.in);
        System.out.printf("Pilih warna favoritmu: ");
        warna = input.next();
        String warnaUp = warna.toUpperCase();
        
        System.out.printf("Nama kamu: ");
        nama = input.next();
        
        System.out.println("");
        System.out.println("====Hasil Test Kepribadian " + nama + "====");
        
        System.out.print("Warna Favoritmu adalah...... ");
            switch(warnaUp){
                case "MERAH":
                  System.out.print(RED + " Merah \n" + RESET);
                    System.out.println("""
                                       1. Terbuka,
                                       2. Berani,
                                       3. Agresif,
                                       4. Impulsif,
                                       5. Penuh Semangat,
                                       6. Optimis, 
                                       7. Disiplin.""");
                break;
                               
                case "HIJAU":
                  System.out.print(RED + " Hijau \n" + RESET);
                    System.out.println("""
                                       1. Harmonis,
                                       2. Lembut,
                                       3. Jujur,
                                       4. Terus terang,
                                       5. Damai,
                                       6. Sabar, 
                                       7. Tidak suka menonjol.""");
                break;
                   
                case "KUNING":
                  System.out.print(RED + " Kuning \n" + RESET);
                    System.out.println("""
                                       1. Petualang,
                                       2. Cerdik,
                                       3. Humoris,
                                       4. Bebas,
                                       5. Independen,
                                       6. Ceria, 
                                       7. Bijaksana.""");
                break;
                                
                case "BIRU":
                  System.out.print(RED + " Biru \n" + RESET);
                    System.out.println("""
                                       1. Sabar,
                                       2. Sensitif,
                                       3. Pengendalian diri yang bagus,
                                       4. Loyal,
                                       5. Terlalu hati hati,
                                       6. Konservatif, 
                                       7. Stabil.""");
                break;
                                
                case "UNGU":
                  System.out.print(RED + " Ungu \n" + RESET);
                    System.out.println("""
                                       1. Individualistik,
                                       2. Sensitif,
                                       3. Unik,
                                       4. Kreatif,
                                       5. Toleran,
                                       6. Tempramental, 
                                       7. Harga diri tinggi.""");
                break;
                default:
                    System.out.println(" Uh-oh sepertinya warna favoritmu belum terdefinisikan nih, tunggu ya kak");
                break;
     
            }
        
        
        
        
    }
    
}
