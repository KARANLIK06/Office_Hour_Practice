package week10.constructors;

public class TVShow {
    public String title;
    public String network;
    public int seasons;
    public int episodes;

    public TVShow(String title, String network, int seasons, int episodes) {
        this.title = title;
        this.network = network;
        this.seasons = seasons;
        this.episodes = episodes;


    }

    @Override
    public String toString() {
        return "TVShow{" +
                "title='" + title + '\'' +
                ", network='" + network + '\'' +
                ", seasons=" + seasons +
                ", episodes=" + episodes +
                '}';
    }
}
