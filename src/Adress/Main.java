package Adress;

/**
 * Created by zzzxxx on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        Adress adress2=new Adress("65088","Ukraine","Odessa","Shishkin street","38","16");
        System.out.println(adress2.getIndexs());
        System.out.println(adress2.getCountry());
        System.out.println(adress2.getCity());
        System.out.println(adress2.getStreet());
        System.out.println(adress2.getHouse());
    }
}


