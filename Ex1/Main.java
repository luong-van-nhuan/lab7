package Ex1;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
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
			switch (choose) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("Good bye");
				break;
			default:
				System.out.println("Error!!!");
			}
		} while (choose != 0);

	}
}
