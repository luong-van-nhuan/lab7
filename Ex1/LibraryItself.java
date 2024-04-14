package Ex1;

import java.util.ArrayList;
import java.util.List;

public class LibraryItself {
	List<Book> books = new ArrayList<>();
	List<LibraryMember> libraryMembers = new ArrayList<>();
	public LibraryItself(List<Book> books, List<LibraryMember> libraryMembers) {
		this.books = books;
		this.libraryMembers = libraryMembers;
	}
	public LibraryItself() {
	}
	

}
