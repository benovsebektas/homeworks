package entity;

public class Watch {

    private String location;
    private boolean isnewwatch;
    private boolean isDelivered;
    private String model;
    private  String brand;
    private String Contactnumber;
    private int price;
    private String name;
    private int id;


    public Watch() {
    }

    public Watch(String location, boolean isnewwatch, boolean isDelivered, String model, String brand, String contactnumber, int price, String name,int id) {
        this.location = location;
        this.isnewwatch = isnewwatch;
        this.isDelivered = isDelivered;
        this.model = model;
        this.brand = brand;
        Contactnumber = contactnumber;
        this.price = price;
        this.name = name;
        this.id=id;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isIsnewwatch() {
        return isnewwatch;
    }

    public void setIsnewwatch(boolean isnewwatch) {
        this.isnewwatch = isnewwatch;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getContactnumber() {
        return Contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        Contactnumber = contactnumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "location='" + location + '\'' +
                ", isnewwatch=" + isnewwatch +
                ", isDelivered=" + isDelivered +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", Contactnumber='" + Contactnumber + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

