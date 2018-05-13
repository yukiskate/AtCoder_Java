import java.util.Scanner;

public class WelcometoAtCoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int iSuji1 = sc.nextInt();
		//スペース区切りの整数の入力
		int iSuji2 = sc.nextInt();
		int iSuji3 = sc.nextInt();

		//文字列の入力
		String strMoji1 = sc.next();
		//出力
		System.out.println((iSuji1+iSuji2+iSuji3) + " " + strMoji1);
	}
}
