package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<Book> booklist = new ArrayList<>();
		int choose = 0;
		do {
			System.out.println("1. More books");
			System.out.println("2. Delete  books");
			System.out.println("3. Borrow  books");
			System.out.println("4. Return the books");
			System.out.println("5. Show available books");
			System.out.println("0. Exit");
			System.out.println("Enter choose");
			choose = sc.nextInt();
			sc.nextLine();
			switch(choose) {
			case 1 :
				
			case 5: 
				
			}
		} while (choose != 0);
	
		
	}
}
