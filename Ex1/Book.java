package Ex1;

import java.util.Scanner;

public class Book {
	private int bookCode;
	private String bookTitle;
	private String author;
	

	public Book(int bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
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
		sc.close();
	}

	public static void title() {
		String line = String.format("%-20s%-20s%-20s", "Book code" + "", "Book title", "Author");
		System.out.println(line);
	}

	public void output() {
		String line = String.format("%-20s%-20s%-20s", bookCode, bookTitle, author);
		System.out.println(line);
	}
	
}
