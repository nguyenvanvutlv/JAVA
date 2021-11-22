package BAI2;

public class Book  extends  Document{
    private int NumberOfPage;
    private String Author;


    public Book(int numberOfPage, String author) {
        NumberOfPage = numberOfPage;
        Author = author;
    }

    public Book(int ID, String name, String publisher, float price, int numberOfPage, String author) {
        super(ID, name, publisher, price);
        NumberOfPage = numberOfPage;
        Author = author;
    }

    public Book() {

    }


    public int getNumberOfPage() {
        return NumberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        NumberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
