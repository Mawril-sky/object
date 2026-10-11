public class Book {
    private  String title;
    private  Author author;
    private int yearPublicationBook;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author ;
        this.yearPublicationBook = year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublicationBook() {
        return yearPublicationBook;
    }

    public void setYearPublicationBook(int year) {
        this.yearPublicationBook = year;

    }

}


