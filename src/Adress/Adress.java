package Adress;

/**
 * Created by zzzxxx on 09.05.2017.
 */
public class Adress {
    String indexs;
    String country;
    String city;
    String street;
    String house;
    String appartment;

    public Adress(String indexs, String country, String city, String street, String house, String appartment) {
        this.indexs = indexs;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.appartment = appartment;
    }

    public String getIndexs() {
        return indexs;
    }

    public void setIndexs(String indexs) {
        this.indexs = indexs;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAppartment() {
        return appartment;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }
}
