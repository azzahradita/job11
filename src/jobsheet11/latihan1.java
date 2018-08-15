package jobsheet11;

import java.util.Locale;

public class latihan1 {
    public static void main(String[] args) {
    String identitas = "AZ ZAHRA DITA PRATIWI / XRPL3 / 09";
    System.out.println("Identitas : "+ identitas);

    
        String x = "Operasi";
    System.out.println("isi variabel x : "+ x);
    System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
    
    System.out.println("x adalah kosong : " + x.isEmpty());
    
    String y = "";
    System.out.println("isi variabel y : "+ y);
    System.out.println("y adalah kosong : " + y.isEmpty());
    
        System.out.println("isi x sama dengan y : " + x.equals(y));
    
    String z = "Operasi";
    System.out.println("isi variabel z : "+ z);
    System.out.println("isi x sama dengan z (Case Sensitive) : " + x.equals(z));
    
    String r = "Operasi";
    System.out.println("isi variabel r : "+ r);
    System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equals(r));
    System.out.println("isi x sama dengan r (Not Case Sensitive): " + x.equalsIgnoreCase(r));
    System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
    System.out.println("perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
    System.out.println("perbandingan isi x dengan r (Cara Sensitive): " + x.compareTo(r));
    System.out.println("perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
    
    String s = "operasi";
    System.out.println("isi variabel s : "+ s);
    System.out.println("perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
    System.out.println("pada x terdapat huruf'a' : " + x.contains("a"));
    
    System.out.println("isi variabel x besar semua : " + x.toUpperCase());
    System.out.println("isi variabel x kecil semua : " + x.toLowerCase());
    
    String t ="     operasi string      ";
    System.out.println("isi variabel t : \""+ t.trim() + "\"");
    System.out.println("isi variabel t tanpa spasi : \""+ t.trim() + "\"");
    
    System.out.println("gabungkan isi variabel x dan r : "+ x.concat(r));
    System.out.println("karakter mulai posisi 3 divariabel x : " + x.substring(3));
    System.out.println("karakter dari posisi 3-5 divariabel x : " + x.substring(3,6));
    
    String tolean = t.trim();
    System.out.println("isi variabel tolean : "+ t.trim());
    System.out.println("rubah 'i' jadi 'E' di variabel tolean: " + tolean.replace("i","E"));
    
    String[] arrT = tolean.split(" ");
    System.out.println("pecah kata di variabel tolean : ");
        for (String arrT1 : arrT) {
            System.out.println(arrT1);
        }
    
    String[] arrTr = tolean.split("r");
    System.out.println("pecah berdasarkan huruf 'r' di variabel tolean : ");
        for (String arrTr1 : arrTr) {
            System.out.println(arrTr1);
        }
    double d = 1545454000;
    System.out.println(String.format("Uang saya %,.4f", d));
    
    System.out.println(String.format(Locale.forLanguageTag("in-ID"),"Uang saya Rp %,.2f", d));


    }}

