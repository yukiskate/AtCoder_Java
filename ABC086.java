import java.util.Scanner;

public class ABC086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//整数の入力
		int iSuji1 = sc.nextInt();
		int iSuji2 = sc.nextInt();

		if((iSuji1 * iSuji2) % 2 == 0){
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
