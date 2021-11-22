package BAI2;

public class Document {
    private int ID;
    private String Name;
    private String Publisher;
    private float Price;


    public Document() {
    }

    public Document(int ID, String name, String publisher, float price) {
        this.ID = ID;
        Name = name;
        Publisher = publisher;
        Price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
