import java.util.Scanner;

public class BeginnerContest101C {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		System.out.println((int)Math.ceil((double)(n-1)/(k-1)));

	}
}
