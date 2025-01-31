class Book {
	String title;
	int year;
	String author;
	static int totalBooks = 0;

	Book(String title, int year, String author) {
		this.title = title;
		this.year = year;
		this.author = author;
		totalBooks++;
	}

	void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Publication Year: " + year);
	}

	String getBookString() {
		String bookString = "title:" + title + 
			"\nyear:" + year + 
			"\nauthor:" + author + "\n";
		return bookString;
	}

	static boolean compareTitle(Book book1, Book book2) {
		return book1.title.equals(book2.title);
	}
}
