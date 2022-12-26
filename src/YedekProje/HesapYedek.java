package YedekProje;

public class HesapYedek {
    private String kullanici_adi;
    private String password;
    private static double bakiye;
    private double sepet;


    public  HesapYedek(String kullanici_adi, String password, double bakiye) {
        this.kullanici_adi=kullanici_adi;
        this.password=password;
        this.bakiye=bakiye;
    }
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getSepet() {
        return sepet;
    }

    public void setSepet(double sepet) {
        this.sepet = sepet;
    }


}
