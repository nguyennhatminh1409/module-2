public class FictionBook extends Book{
    private String category;
    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    // Getter và Setter cho thuộc tính category của FictionBook
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
