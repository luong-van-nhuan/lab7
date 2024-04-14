package Ex1;

import java.util.Scanner;

public class Book {
	private int bookCode;
	private String bookTitle;
	private String author;
	private boolean isBorrowed;

	public Book(int bookCode, String bookTitle, String author, boolean isBorrowed) {
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
		this.isBorrowed = false;
	}

	public Book() {
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book code: ");
		bookCode = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter book title: ");
		bookTitle = sc.nextLine();
		System.out.println("Enter author: ");
		author = sc.nextLine();
		isBorrowed = false;
		sc.close();
	}

	public static void title() {
		String line = String.format("%-20s%-20s%-20s%-20s", "Book code" + "", "Book title", "Author",
				"is Borrowed" + "");
		System.out.println(line);
	}

	public void output() {
		String line = String.format("%-20s%-20s%-20s%-20s", bookCode, bookTitle, author, isBorrowed);
		System.out.println(line);
	}

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	
	}
}
