
package jobsheet11;
import java.util.Scanner;
public class tugas {public static void main(String[] args)
{
    String identitas = "az zahra dita pratiwi / x rpl 3 / 9";
    System.out.println("Identitas : " + identitas);
    
    System.out.println(" ");
    
    Scanner baca = new Scanner(System.in);
    
    String a = "ATTITUDE";
    System.out.println("isi variabel a: " + a);
    System.out.println("\"" + a + "\" panjang karakter = " + a.length());
    
    System.out.println("jawaban a adalah kosong: " + a.isEmpty());
    
    String z = "IS EVERYTHING";
    System.out.println("isi variabel z : " + z);
    System.out.println("\"" + a + "\" panjang karakter = "+ a.length());

    System.out.println("jawaban z adalah kosong: " + a.isEmpty());
    
    System.out.println("perbandingn a sama dengan z: " + a.equals(z));
    
    System.out.println("variabel a besar semua: " + a.toUpperCase());
    System.out.println("variabel a kecil semua: " + a.toLowerCase());
    
    System.out.println("variabel z besar semua: " + a.toUpperCase());
    System.out.println("variabel z kecil semua: " + a.toLowerCase());
}   

    
}
