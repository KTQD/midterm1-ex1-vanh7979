public class Book extends Item {
    public String author;
    public int numberOfPages;
    public String genre;
    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }



    @Override
    public void showInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("Book Description: " + getDescription());
        System.out.println("Book ID: " + ID);
        System.out.println("Book Price: " + price);
        System.out.println("Book Author: " + author);
        System.out.println("Book Number of Pages: " + numberOfPages);
        System.out.println("Book Genre: " + genre);

    }
}
