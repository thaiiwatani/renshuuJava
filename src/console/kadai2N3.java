/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai2N3 {
	static ConsoleUltils conUltil;

	public static void main(String[] args) {
		conUltil = new ConsoleUltils();
		//Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		conUltil.showMessage("整数を入力して下さい。");
		String input = conUltil.scan.nextLine();

		while(!conUltil .isInteger(input) ){
			conUltil.showMessage("入力された値は整数ではありません");
			input = conUltil.scan.nextLine();
		}


		try {
			int x = Integer.parseInt(input);
			String result = conUltil.createStringNumber(x, 1, 9);
			System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("エラーです。");
		}
	}
}
