import java.util.Scanner;

public class ABC081 {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		String strSuji = sc.next();

		int iSuji1 = Character.getNumericValue(strSuji.charAt(0));
		int iSuji2 = Character.getNumericValue(strSuji.charAt(1));
		int iSuji3 = Character.getNumericValue(strSuji.charAt(2));

		System.out.println(iSuji1+iSuji2+iSuji3);
	}
}
