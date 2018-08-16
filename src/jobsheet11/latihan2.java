
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
    String convert = vokal2Angka(kalimat);
    tampilPerKata(kalimat, convert);

}

    private static String tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
}
    public static String vokal2Angka(String kalimat)
    {
        char [][] arConvert =
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
            
        kalimat = kalimat.toLowerCase();
        for (int i = 0; i < arConvert.length; i++) 
                kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
            
        return kalimat;
    }    
}
