package GreenShopp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DekorasyonBitkilerii implements Bitki  {
      Scanner scanner = new Scanner(System.in);

    @Override
    public void isim(int no) {
        String [] Dekisim = {"ANTROYUM 120TL","ZEZE BİTKİSİ 110TL","DEVE TABANI 115TL","ORKİDE 300TL\n" +
                ""+
        "AROKARYA 550TL","AŞK MERDİVENİ 145TL","ATATÜRK ÇİÇEĞİ 160TL","FİL KULAĞI 192TL",};
        for ( int i=0; i<Dekisim.length; i++){
            System.out.println(Dekisim[i]);
        }
    }

    @Override
    public double fiyat(int numara) {
        int [] Dekfiyat = {120,110,115,300,550,145,160,192};

        return Dekfiyat [numara];
    }

    @Override
    public void Bitki_Bilgileri(int bitkino) {
        ArrayList<String>Dekbitkileri=new ArrayList<>();
        Dekbitkileri.add("ANTROYUM\n");
        Dekbitkileri.add("Fiyatı 120 tl\n");
        Dekbitkileri.add("Antoryum haftalarca süren kalp şeklindeki çarpıcı" +
                " kırmızı veya pembe çiçeklere sahiptir. \n");
        Dekbitkileri.add("Çok fazla parlak, dolaylı ışığa ihtiyacı vardır.\n");
        Dekbitkileri.add("Sulamalar arasında toprağın biraz kurumasını bekleyin.\n");

        List<String> Dekbitkileri2 = new ArrayList<>();
        Dekbitkileri2.add(("---ZEZE BİTKİSİ---\n"));
        Dekbitkileri2.add("Fiyatı 110tl\n");
        Dekbitkileri2.add("Parlak, mumsu görünümlü yapraklara sahiptir.\n");
        Dekbitkileri2.add(" Karanlık köşelerde rahatlıkla bakılabilir\n");
        Dekbitkileri2.add("Birkaç hafta sulamayı unutsanız bile hayatta kalan en " +
                "sert ev bitkilerinden biridir.");

        List<String> Dekbitkileri3 = new ArrayList<>();
        Dekbitkileri3.add(("---DEVE TABANI---\n"));
        Dekbitkileri3.add("Fiyatı 115tl\n");
        Dekbitkileri3.add("En büyük ev bitkilerinden  olan  deve tabanı doğrudan güneş "+
                "ışığı istemez ama aydınlık ortam sever.\n");
        Dekbitkileri3.add("Salonunuz yeterince aydınlıksa ve doldurmak istediğiniz büyükçe bir alanınız varsa\n");
        Dekbitkileri3.add("ana vatanı olan Güney Amerika’nın yağmur ormanları havasını evinize getirir.");

        List<String> Dekbitkileri4 = new ArrayList<>();
        Dekbitkileri4.add(("---ORKİDE---\n"));
        Dekbitkileri4.add("Fiyatı 300TL \n");
        Dekbitkileri4.add("Sabah ve akşam güneşi gören bir pencere önünde mutlu yaşar\n");
        Dekbitkileri4.add("Yapraklar koyu yeşil ve yumuşaksa bitki az ışık alıyor demektir.\n");
        Dekbitkileri4.add("Sarımsı ya da kızarmış yapraklar ışığın fazla geldiğini gösterir.\n");
        Dekbitkileri4.add("Beyaz, pembe, sarı, mor gibi farklı renklerde ve bambu orkide, minyatür gibi farklı "+
                "türleriyle evinize misafir edebilirsiniz.\n");

        List<String> Dekbitkileri5 = new ArrayList<>();
        Dekbitkileri5.add(("---AROKARYA---\n"));
        Dekbitkileri5.add("Fiyatı 550tl \n");
        Dekbitkileri5.add(" Geniş bir alana sahipseniz bu bitki sizin için ideal bir seçim olur\n");
        Dekbitkileri5.add("Dekoratif görüntüsüyle dikkat çeker.\n");
        Dekbitkileri5.add("Aynı zamanda uzun ömürlüdür. Fazla sıcakta kaldığında sağlıklı gelişim gösteremez..\n");
        Dekbitkileri5.add("Bulunduğu ortamın, aydınlık ve az nemli olmasına dikkat etmelisiniz.\n");

        List<String> Dekbitkileri6 = new ArrayList<>();
        Dekbitkileri6.add(("---AŞK MERDİVENİ---\n"));
        Dekbitkileri6.add("Fiyatı 145TL \n");
        Dekbitkileri6.add("Sarkık formu, yapraklarının görüntüsüyle dikkat çeken bir başka iç mekan bitkisidir.\n");
        Dekbitkileri6.add("Nemli ortamı sever. Gelişim döneminde bolca sulamalısınız\n");
        Dekbitkileri6.add(" Kış aylarında ise daha az su vermeniz yeterlidir.\n");
        Dekbitkileri6.add("Nisan-ağustos  aylarında 15 günde bir gübrelemeyi ihmal etmeyin.\n");

        List<String> Dekbitkileri7 = new ArrayList<>();
        Dekbitkileri7.add(("---ATATÜRK ÇİÇEĞİ---\n"));
        Dekbitkileri7.add("Fiyatı 160TL \n");
        Dekbitkileri7.add("Yeşil-kırmızı yapraklarıyla renkli bir bitkidir. Doğrudan güneş ışığında kalmayı sevmez.\n");
        Dekbitkileri7.add("İlkbahar ve yaz aylarında bolca sulama yapmanız bitkiyi kuvvetlendirir.\n");
        Dekbitkileri7.add("Çiçeklenme döneminde, su miktarını azaltmalısınız.\n");
       Dekbitkileri7.add("Her yıl nisan ayında saksısını değiştirirseniz, daha sağlıklı gelişir.\n");

        List<String> Dekbitkileri8 = new ArrayList<>();
        Dekbitkileri8.add(("---FİL KULAĞI BİTKİSİ---\n"));
        Dekbitkileri8.add("Fiyatı 192TL \n");
        Dekbitkileri8.add("Yeşil yaprakları üzerindeki beyaz çizgileri ile etkileyici bir görünüme sahiptir..\n");
        Dekbitkileri8.add("Doğrudan güneş ışığını sever. Güneş ışığını gören kısımlar ışığa doğru bir eğilimde bulunur.\n");
        Dekbitkileri8.add("Gölgede kalan kısımların da güneş görmesi için düzenli olarak saksının döndürülmesi gerekir..\n");



        if (bitkino == 1){
            System.out.println(Dekbitkileri+"\n\n");
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }

        } else if (bitkino == 2) {
            System.out.println(Dekbitkileri2);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 3) {
            System.out.println(Dekbitkileri3);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 4) {
            System.out.println(Dekbitkileri4);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 5) {
            System.out.println(Dekbitkileri5);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 6) {
            System.out.println(Dekbitkileri6);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 7) {
            System.out.println(Dekbitkileri7);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }



    }


}
