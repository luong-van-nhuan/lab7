package Ex1;

import java.util.Scanner;

public class LibraryItself {
	private Book[] books;
	private LibraryMember[] libraryMembers;
	private BorrowBook[] borrowBooks;
	private static int currentBookNumber = 8;
	private String bookCode;
	private String memberCode;

	public LibraryItself(Book[] books, LibraryMember[] libraryMembers, BorrowBook[] borrowBooks, String bookCode,
			String memberCode) {
		this.books = books;
		this.libraryMembers = libraryMembers;
		this.borrowBooks = borrowBooks;
		this.bookCode = bookCode;
		this.memberCode = memberCode;
	}

	public LibraryItself() {
		books = new Book[1000];
	}

	public void bookAvailable() {
		books[0] = new Book("ms1", "Đắc nhân tâm", "Dale Carnegie", true);
		books[1] = new Book("ms2", "Quẳng gánh lo đi và vui sống", "Dale Carnegie", true);
		books[2] = new Book("ms3", "Nhà giả kim", "Paulo Coelho", true);
		books[3] = new Book("ms4", "Mặc kệ thiên hạ, sống như người Nhật", "Mari Tamagawa", true);
		books[4] = new Book("ms5", "Tuổi trẻ đáng giá bao nhiêu?", "Rosie Nguyễn", true);
		books[5] = new Book("ms6", "Cho tôi xin một vé đi tuổi thơ", "Nguyễn Nhật Ánh", true);
		books[6] = new Book("ms7", "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", true);
		books[7] = new Book("ms8", "Tôi tự học", "Nguyễn Duy Cần", true);
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].output();
				return;
			}
			
		}
		return;
	}

	public void addBook() {
		Book book = new Book();
		if (currentBookNumber < books.length) {
			book.input();
			books[currentBookNumber] = book;
			currentBookNumber++;
		} else {
			System.out.println("The library is full");
		}

	}

	public void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book code to delete");
		bookCode = sc.nextLine();
		for (int i = 0; i < currentBookNumber; i++) {
			if (books[i] != null && books[i].getBookCode().equals(bookCode)) {
				books[i] = null;
			}
		}
	}

	public void borrowBooks() {
		BorrowBook borrowBook = new BorrowBook();
		borrowBook.input();
		
	}

	public void showBook() {
		for (int i = 0; i < currentBookNumber; i++) {
			if (books[i] != null) {
				books[i].output();
			}
		}
	}
}
