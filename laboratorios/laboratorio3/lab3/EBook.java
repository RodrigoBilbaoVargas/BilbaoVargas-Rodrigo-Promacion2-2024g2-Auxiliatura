package books;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, int publicationYear, double fileSize, String format) {
        super(title, author, publicationYear);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}