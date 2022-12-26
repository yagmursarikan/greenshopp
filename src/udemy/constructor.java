package udemy;

public class constructor {
    private double bakiye;
    private double miktar;
    private String isim;
    private Double telefonno;

    public constructor(double bakiye, double miktar, String isim, double telefonno) {
        this.bakiye = bakiye;
        this.miktar = miktar;
        this.isim = isim;
        this.telefonno = telefonno;
    }
    public void merhaba(String isim){
        System.out.println("Hosgeldin "+isim);
    }
    public void paracekme (double bakiye, double miktar) {
        this.bakiye = bakiye;
        this.miktar = miktar;
        bakiye -= miktar;
        if (bakiye < 0) {
            System.out.println("Bu islem icin yeterli bakiyeniz yok");
        } else {
            System.out.println("Yeni bakiyeniz = " + bakiye+"tl");

        }
    }  public void parayatırma (double bakiye,double miktar) {
        this.bakiye = bakiye;
        this.miktar = miktar;
        bakiye += miktar;
       System.out.println("Yeni bakiyeniz = "+bakiye+"tl");
    }
    public void bilgilerigöster(){
        System.out.println("Isim = "+this.isim);
        System.out.println("Telefon no = "+this.telefonno);
        System.out.println("Yeni Bakiye = "+this.bakiye);
    }

}
