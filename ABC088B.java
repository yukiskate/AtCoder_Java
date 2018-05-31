
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ABC088B {


	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer a[] = new Integer[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a, Comparator.reverseOrder());

		int Alice = 0;

		int Bob = 0;

		for (int j = 0; j < N; j+=2) {
			Alice += a[j];
		}

		for (int k = 1; k < N; k+=2) {
			Bob += a[k];
		}

		System.out.println(Alice - Bob);
	}
}
