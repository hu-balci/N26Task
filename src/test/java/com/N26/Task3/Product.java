package com.N26.Task3;

public class Product {

    private String name;
    private String type;
    private int price;
    private int shipping;
    private String upc;
    private String description;
    private  String manufacturer;
    private String model;
    private String url;
    private String image;


    public Product() {
    }

    public Product(String name, String type, int price, int shipping, String upc, String description, String manufacturer, String model, String url, String image) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.shipping = shipping;
        this.upc = upc;
        this.description = description;
        this.manufacturer = manufacturer;
        this.model = model;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getShipping() {
        return shipping;
    }

    public String getUpc() {
        return upc;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", shipping=" + shipping +
                ", upc='" + upc + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", url='" + url + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
