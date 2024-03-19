import java.util.*;

public class Odev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList<HashMap<String, String>> ogrenciListesi = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            HashMap<String, String> ogrenci = new HashMap<>();

            System.out.println("Öğrenci #" + (i + 1) + " bilgilerini girin:");

            System.out.print("Ad: ");
            String isim = input.nextLine();
            ogrenci.put("ad", isim);

            System.out.print("Soyad: ");
            String soyisim = input.nextLine();
            ogrenci.put("soyad", soyisim);

            System.out.print("Vize Notu: ");
            String vize = input.nextLine();
            ogrenci.put("vize", vize);

            System.out.print("Final Notu: ");
            String finalNotu = input.nextLine();
            ogrenci.put("final", finalNotu);

            ogrenciListesi.add(ogrenci);
        }
        
        for (HashMap<String, String> ogrenci : ogrenciListesi) {
            System.out.println("Ad: " + ogrenci.get("ad") + ", Soyad: " + ogrenci.get("soyad") + ", Vize: " + ogrenci.get("vize") + ", Final: " + ogrenci.get("final"));
        }

        
        System.out.println("\nBulmak İstediğiniz Öğrenci:");
        System.out.print("Ad: ");
        String arananIsim = input.nextLine();
        System.out.print("Soyad: ");
        String arananSoyisim = input.nextLine();


        boolean bulunduMu = false;
        for (HashMap<String, String> ogrenci : ogrenciListesi) {
            String ad = ogrenci.get("ad");
            String soyad = ogrenci.get("soyad");

            if (ad.equalsIgnoreCase(arananIsim) && soyad.equalsIgnoreCase(arananSoyisim)) {
                bulunduMu = true;
                System.out.println("\nBulunan Öğrenci:");
                System.out.println("Ad: " + ad + ", Soyad: " + soyad + ", Vize: " + ogrenci.get("vize") + ", Final: " + ogrenci.get("final"));
                break;
            }
        }

        if (!bulunduMu) {
            System.out.println("Öğrenci Bulunamadı!");
        }

    }

}
