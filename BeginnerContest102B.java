import java.util.Scanner;


public class BeginnerContest102B {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int max = 0;
		int min = 1000000001;

		for (int i = 0; i < n; i++) {

			a = sc.nextInt();

			if (max < a) {
				max = a;
			}

			if (min > a) {
				min = a;
			}
		}

		System.out.println(max - min);
	}
}
