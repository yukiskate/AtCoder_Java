import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC081B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iLength = sc.nextInt();

		List<Integer> lstInput = new ArrayList<Integer>();

		for(int i = 0; i < iLength; i++) {
			lstInput.add(sc.nextInt());
		}

		int iCount = 0;
		boolean blFlg = true;

		while(blFlg){
			for(int j = 0; j < lstInput.size(); j++) {

				int iInput = lstInput.get(j);

				if(iInput % 2 == 0) {
					lstInput.set(j, iInput/2);

				} else {
					System.out.println(iCount);
					blFlg = false;
					break;
				}
			}
			iCount++;
		}
	}
}
