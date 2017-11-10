/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai2N1 {

	public static void main(String[] args) {
		ConsoleUltils conUltil = new ConsoleUltils();
		Scanner scan = new Scanner(System.in);

		conUltil.showMessage("整数を入力して下さい。");
		String input = scan.nextLine();



		while(!conUltil .isInteger(input) ){
			conUltil.showMessage("入力されたものは整数ではありません。整数を入力してください。");
			input = scan.nextLine();
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
