public class BookAccess {

    private static void comparePrices(Book book1, Book book2) {
        float book1Price = book1.getPrice();
        float book2Price = book2.getPrice();
        String priceCmp = "";

        if (book1Price < book2Price) {
            priceCmp = book1.getTitle() + " costs less than " + book2.getTitle();
        } else if (book1Price == book2Price) {
            priceCmp = book1.getTitle() + " costs as much as " + book2.getTitle();
        } else {
            priceCmp = '"' + book1.getTitle() + '"' + " costs more than \"" + book2.getTitle() + '"';
        }
        System.out.println(priceCmp);
    }


    /**
     * compare the two book for each of its attributes
     * @param book1
     * @param book2
     */
    private static void compareBooks (Book book1, Book book2) {
        if (book1.equals(book2)) {
            System.out.println("The two books are the same.");
        } else {
            System.out.println("The two books are different.");
        }
    }

	public static void main(String s[]) throws CloneNotSupportedException {
		Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);

		Book book2 = new Book();
		book2.setTitle("Sapiens");
		book2.setAuthor("Yuval Noah Harari");
		book2.setPrice(25.00f);

		System.out.println("The first book object is ");
		System.out.println(book1);
		System.out.println("The second book object is ");
		System.out.println(book2);

        comparePrices(book1, book2);

        Book book3 = (Book)(book1.clone());
        System.out.println("The third book cloned object is ");
        System.out.println(book3);
	}
}
