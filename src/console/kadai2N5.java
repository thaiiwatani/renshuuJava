/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai2N5 {
	static Scanner scan;
	static ConsoleUltils conUltil;
	static String input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		conUltil = new ConsoleUltils();
		scan = new Scanner(System.in);

		conUltil.showMessage("整数を入力して下さい。");
		input = scan.nextLine();
		while(!conUltil.isInteger(input)){
			conUltil.showMessage("入力された値は整数ではありません。もう一度入力して下さい。");
			input = scan.nextLine();
		}

		int x = Integer.parseInt(input);
		switch(x) {
		case 1 :
			conUltil.showMessage("いち");
			break;
		case 2 :
			conUltil.showMessage("に");
			break;
		case 3 :
			conUltil.showMessage("さん");
			break;
		case 4 :
			conUltil.showMessage("よん");
			break;
		default :
			conUltil.showMessage("Unknown");
			break;
		}
	}



}
