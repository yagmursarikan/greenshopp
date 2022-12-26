package udemy;

public class mainatm {

    public static void main (String[] args){

        atmcalis atm= new atmcalis();
        hesap hesap = new hesap("yagmur sarikan","yagmur1905",10000);
        atm.calis(hesap);
        System.out.println("Programdan cikiliyor...");


    }



}
