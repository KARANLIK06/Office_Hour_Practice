package week10.constructors;

public class Phone {
    public String brand;
    public String model;
    public int storage;
    public double price;

    public Phone(String brand, String model, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
