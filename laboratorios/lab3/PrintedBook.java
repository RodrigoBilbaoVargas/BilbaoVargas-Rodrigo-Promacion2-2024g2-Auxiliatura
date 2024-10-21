package books;

public class PrintedBook extends Book {
    private int pages;
    private double weight;

    public PrintedBook(String title, String author, int publicationYear, int pages, double weight) {
        super(title, author, publicationYear);
        this.pages = pages;
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pages);
        System.out.println("Weight: " + weight + " kg");
    }
}