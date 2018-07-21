import java.util.Scanner;

public class BeginnerContest103B {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		boolean flg = false;

		for (int i = 0; i < a.length(); i++) {

			if (a.equals(b)) {
				flg = true;
				break;

			} else {

				a = a.substring(1) + a.charAt(0);
			}
		}

		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
