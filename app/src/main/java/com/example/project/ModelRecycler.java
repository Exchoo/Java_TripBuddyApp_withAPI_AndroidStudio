package com.example.project;

public class ModelRecycler {

    private String name, country, city, imgURL,Pricebutton,hotelUrl;

    public String getPricebutton() {
        return Pricebutton;
    }

    public void setPricebutton(String pricebutton) {
        Pricebutton = pricebutton;
    }

    public String getImgURL(){
        return imgURL;
    }

    public void setImgURL(String imgURL){
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelUrl() {
        return hotelUrl;
    }

    public void setHotelUrl(String hotelUrl) {
        this.hotelUrl = hotelUrl;
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

}
