public class Book implements Cloneable {
    private String title;
    private String author;
    private float price;

    // default constructor
    public Book () {
        this.title = null;
        this.author = null;
    }

    // overloaded constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

	public void setAuthor(String author) {
        this.author = author;
    }

	public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + getTitle() + // can I use the getter method instead?
                "\nAuthor - " + this.author + 
                "\nPrice - "+ String.format("%.2f", this.price);
    }
    
    /**
     * Compare the two books
     * @param otherBook
     * @return
     */
    @Override
    public boolean equals(Book otherBook) {
        if (this.title.equals(otherBook.getTitle()) &&  // use the getter methods instead
            this.author.equals(otherBook.getAuthor()) && 
            this.price == otherBook.getPrice()) {
            return true;
        }
        return false;
    }

    // @Override
    // public boolean equals(Object obj) {
    //     // 1. Check if it's the exact same memory address
    //     if (this == obj) return true;
        
    //     // 2. Check if the other object is actually a Book
    //     if (!(obj instanceof Book)) return false;
        
    //     // 3. Cast it to a Book so we can see the fields
    //     Book otherBook = (Book) obj;
        
    //     // 4. Compare the actual data
    //     return Float.compare(otherBook.price, this.price) == 0 &&
    //         this.title.equals(otherBook.title) &&
    //         this.author.equals(otherBook.author);
    // }
}
