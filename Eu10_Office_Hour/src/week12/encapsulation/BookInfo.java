package week12.encapsulation;

public class BookInfo {
    private String bookName;
    private int year;
    private long ISSN;
    private boolean isBorrowed;

    public BookInfo(String bookName, int year, long ISSN, boolean isBorrowed) {
        this.bookName = bookName;
        this.year = year;
        this.ISSN = ISSN;
        this.isBorrowed = isBorrowed;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getISSN() {
        return ISSN;
    }

    public void setISSN(long ISSN) {
        this.ISSN = ISSN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
