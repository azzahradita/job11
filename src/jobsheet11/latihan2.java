
package jobsheet11;
import java.util.Scanner;
public class latihan2 {private static void tampilJudul(String identitas)
{
    System.out.println("Identitas : "+ identitas);
    
    System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
}

public static void main(String[] args){
    String identitas = "az zahra dita pratiwi / XRPL3 / 9 ";
    tampilJudul(identitas);
    String kalimat = tampilInput();
    
}
    private static String tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;

}
}