import java.util.Scanner;

public class ABC081 {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		String strInput = sc.next();

		strInput = strInput.replaceAll("0", "");

		System.out.println(strInput.length());
	}
}
