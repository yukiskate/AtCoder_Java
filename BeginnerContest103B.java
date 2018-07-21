import java.util.Scanner;

public class BeginnerContest103B {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		boolean flg = false;

		String[] str = a.split("");

		for (int i = 0; i < str.length; i++) {

			StringBuffer sb = new StringBuffer();

			sb.append(str[str.length-1]);

			for(int j = 0; j < str.length-1; j++ ) {

				sb.append(str[j]);
			}

			if (sb.toString().equals(b)) {
				flg = true;
				break;
			}

			str = sb.toString().split("");

		}

		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
