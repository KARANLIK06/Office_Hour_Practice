package week10.customClass;

public class Books {
    public String name;
    public int year;
    public String author;
    public String genres;

    public void setBook(String bookName, String bookAuthor, int publishedYear, String bookGenres) {
        this.name = bookName;
        this.year = publishedYear;
        this.author = bookAuthor;
        this.genres = bookGenres;
    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("year = " + year);
        System.out.println("author = " + author);
        System.out.println("genres = " + genres);
    }
}
