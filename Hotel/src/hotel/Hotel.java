package hotel;
import java.util.Scanner;
public class Hotel{
    public static void main(String[] args) {
     System.out.print("\tSelamat Datang Di Hotel Del Luna\n");
     Scanner in = new Scanner( System.in );
        System.out.print("Masukan Nama Tamu : ");
        String nama = in.nextLine();
        System.out.print("\n 1. Superior\n 2. Deluxe\n 3. Premium\n Pilih Tipe Kamar : ");
        String pilih = in.nextLine();
        if ( pilih == "1"){
            System.out.println("Superior");
        }
        else if ( pilih == "2"){
            System.out.println("Deluxe");
        }
        else if ( pilih == "3"){
            System.out.println("Premium");
        }
        System.out.print("Lama Menginap /Hari : ");
        int lamaInap = in.nextInt();
        if (pilih == "1"){
            if ( lamaInap >= 2 ){
            System.out.print(100000*lamaInap);
            }
            else if ( lamaInap >2 && lamaInap >= 4){
            System.out.print(90000*lamaInap*10/100);
            }
            else if (lamaInap>5){
            System.out.print(80000*lamaInap*20/100);
            }
        }
        
    }
}