import java.util.Scanner;

public class BooksMenu {
    /**
     * determine the more expensive book
     * @param book1 price of book 1
     * @param book2 price of book 2
     * @return book that has the higher price
     */
    private static Book getExpensiveBook(Book book1, Book book2) {
        if (book1.getPrice() > book2.getPrice()) {
            return book1;
        } else {
            return book2;
        }
    }

	public static void main(String s[]) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		Book[] books = new Book[10];
		int bkIdx = 0;

		while(true) {
			System.out.println("Press 1 to view books\n" +
                                "2 to add books\n" +
                                "3 to compare book prices\n" +
                                "any other key to exit");
			String userAction = scanner.nextLine();

            // view books
			if (userAction.equals("1")) {
				for(int i = 0; i < books.length; i++) {
					if(books[i] != null) {
						System.out.println(books[i]);
					}
				}
			} 
            // add books
            else if (userAction.equals("2")) {
				if(bkIdx == 10) {
					System.out.println("10 books added already. Cannot add any more books!");
					continue;
				}

				System.out.println("Enter book title");
				String tmpTitle = scanner.nextLine();

				System.out.println("Enter book author");
				String tmpAuthor = scanner.nextLine();

				System.out.println("Enter book price");
				float tmpPrice = Float.parseFloat(scanner.nextLine());

				Book bkTmp = new Book();
				bkTmp.setTitle(tmpTitle);
				bkTmp.setAuthor(tmpAuthor);
				bkTmp.setPrice(tmpPrice);

				books[bkIdx++] = bkTmp;
			} 
            // compare book prices
            else if (userAction.equals("3")) {
                System.out.println("Enter index of the first book to compare");
                int bkIdx_1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter index of the second book to compare");
                int bkIdx_2 = Integer.parseInt(scanner.nextLine());

                if (bkIdx_1 > 10 || bkIdx_2 > 10) {
                    System.out.println("There are only 10 books. Please enter a number between 1...10");
                    scanner.close();
                    break;
                }
                if (books[bkIdx_2] != null && books[bkIdx_2] != null) {
                    System.out.println("Details of the expensive book is\n" + 
                                        getExpensiveBook(books[bkIdx_1], books[bkIdx_2]));
                } else {
                    System.out.println("One of the books is null");
                }
            } else {
                scanner.close();
				break;
			}
		}
	}
}
