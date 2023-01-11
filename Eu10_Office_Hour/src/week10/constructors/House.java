package week10.constructors;

public class House {
    public String address;
    public int year;
    public String type;

    public House(String address, int year, String type) {
        this.address = address;
        this.year = year;
        this.type = type;
    }

    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
