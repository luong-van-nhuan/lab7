package Ex1;

import java.util.Scanner;

public class BorrowBook {
	private String bookCode;
	private String memberCode;

	public BorrowBook(String bookCode, String memberCode) {
		this.bookCode = bookCode;
		this.memberCode = memberCode;
	}

	public BorrowBook() {
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book code you want to borrow");
		bookCode = sc.nextLine();
		System.out.println("Enter the name of the member borrowing the book");
		memberCode = sc.nextLine();
	}
	public void output() {
		System.out.println("The book code you want to borrow" + bookCode);
		System.out.println("The name of the member borrowing the book" + memberCode);
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
}
