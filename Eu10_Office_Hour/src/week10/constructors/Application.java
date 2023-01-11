package week10.constructors;

public class Application {
    public String name;
    public String version;
    public String developer;


    public Application(String name) {
        this.name = name;
    }

    public Application(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public Application(String name, String version, String developer) {
        this.name = name;
        this.version = version;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
