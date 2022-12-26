package udemy;

public class araba {

    public int Yıl;
    private int kapısayisi;
    private int tekerleksayisi;
    private String model;
    private int yıl;
    private String renk;


    public int getKapısayisi(int i) {
        return kapısayisi;
    }

    public void setKapısayisi(int kapısayisi) {
        if (kapısayisi < 0) {
            System.out.println("Kapi sayisi negatif deger alamaz.");
        } else {
            this.kapısayisi = kapısayisi;
            System.out.println("kapi sayisi = " + kapısayisi);
        }
    }

    public int getTekerleksayisi() {
        return tekerleksayisi;
    }

    public void setTekerleksayisi(int tekerleksayisi) {
        if (tekerleksayisi < 0) {
            System.out.println("Tekerlek sayisi negatif deger alamaz.");
        } else {
            this.tekerleksayisi = tekerleksayisi;
            System.out.println("tekerlek sayisi = " + tekerleksayisi);
        }
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        if (yıl < 0) {
            System.out.println("Uretildigi yıl negatif deger alamaz.");
        } else {
            this.yıl = yıl;
            System.out.println("Uretim yili = " + yıl);
        }
    }

    public String getModel(String next) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("model = " + model);
    }

    public String getRenk(String a) {
        return renk;
    }
    public void setRenk(String renk){
        this.renk=renk;
        System.out.println("renk="+renk);
    }
}