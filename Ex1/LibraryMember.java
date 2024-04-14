package Ex1;

import java.util.Scanner;

public class LibraryMember {
	private String memberCode;
	private String memberName;
	public LibraryMember() {
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter member code: ");
		memberCode = sc.nextLine();
		System.out.println("Enter member name: ");
		memberName = sc.nextLine();
	}
	public void output() {
		System.out.println("Member code: " + memberCode);
		System.out.println("Member name: " + memberName);
	}
}
