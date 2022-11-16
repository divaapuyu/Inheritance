
package Interface;

/**
 *
 * @author DIVA
 */
import java.io.*;
public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        toyotavios tv = new toyotavios();
        hondacivic hc = new hondacivic();
        BMWX1 b = new BMWX1();
        int pilih;
        String input;
        
        System.out.println("Selamat Datang Di Showroom Maju Nerka\nSilahkan pilih yang anda inginkan :D");
        do{
            System.out.println("\n====================Menu====================\n1. Cari Merk Mobil\n2. Cari Berdasarkan Kecepatan Maximal\n3. Cari Berdasarkan Harga\n4. Exit");
            System.out.print("Pilih = ");
            pilih = Integer.parseInt(br.readLine());
            switch (pilih){
                case 1 : 
                    System.out.print("------------------------------------\nInput merk mobil yang dicari : ");
                    input = br.readLine();
                    if (input.equalsIgnoreCase("toyota vios")){
                        tv.merk();
                        tv.kecepatan();
                        tv.harga();
                    }else if (input.equalsIgnoreCase("honda civic")){
                        hc.merk();
                        hc.kecepatan();
                        hc.harga();
                    }else if (input.equalsIgnoreCase("BMC X1")){
                        b.merk();
                        b.kecepatan();
                        b.harga();
                    }else{
                        System.out.println("Merk Tidak Tersedia");
                    };
                    break;
                    
                case 2 : 
                    System.out.print("------------------------------------\nInput maksimal kecepatan yang diinginkan : ");
                    pilih = Integer.parseInt(br.readLine());
                    System.out.println("KECEPATAN MAX YANG MENDEKATI KEINGINAN");
                    if (pilih>=100&&pilih<=200){
                        tv.merk();
                        tv.kecepatan();
                        tv.harga();
                    }else if (pilih>200&&pilih<=300){
                        hc.merk();
                        hc.kecepatan();
                        hc.harga();
                        System.out.println("----------------------");
                        b.merk();
                        b.kecepatan();
                        b.harga();
                    }else{
                        System.out.println("Mobil Belum Tersedia");
                    };
                    break;
                 
                case 3 :
                    System.out.print("------------------------------------\nInput harga mobil yang diinginkan : Rp");
                    pilih = Integer.parseInt(br.readLine());
                    System.out.println("HARGA YANG MENDEKATI KEINGINAN");
                    if (pilih>=300000000&&pilih<=450000000){
                        tv.merk();
                        tv.kecepatan();
                        tv.harga();
                    }else if (pilih>450000000&&pilih<=600000000){
                        hc.merk();
                        hc.kecepatan();
                        hc.harga();
                        System.out.println("----------------------");
                        
                    }else if(pilih>600000000&&pilih<=750000000){
                        b.merk();
                        b.kecepatan();
                        b.harga();
                    }else{
                        System.out.println("Mobil Belum Tersedia");
                    };
                    break;
                    
                case 4 :
                    System.exit(0);
            }
        }while (true);
                
    }
    
}
