import java.util.Scanner;

public class BeginnerContest099A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (1 <= a && a<= 999) {

			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
	}
}
