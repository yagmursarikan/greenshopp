package udemy;

public class hesap {
    private String kullanici_ad;
    private String password;
    private double bakiye;

    public hesap (String kullanici_ad, String password, double bakiye){
        this.bakiye=bakiye;
        this.kullanici_ad=kullanici_ad;
        this.password=password;
    }
    public String getKullanici_ad() {
        return kullanici_ad;
    }

    public void setKullanici_ad(String kullanici_ad) {
        this.kullanici_ad = kullanici_ad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }


    public void para_cekme( double miktar){
        if(miktar>bakiye){
            System.out.println("Bakiyeniz yetersiz..");
        }
        else if (bakiye>=miktar){
            bakiye-=miktar;
            System.out.println("Yeni bakiyeniz = "+bakiye);
        }
    }
    public void para_yatırma(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni bakiyeniz = "+bakiye);
    }
}
