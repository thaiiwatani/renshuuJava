/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai2N4 {
	static Scanner scan;
	static ConsoleUltils conUltil;
	static String input;

	public static void main(String[] args) {
		conUltil = new ConsoleUltils();
		scan = new Scanner(System.in);

		conUltil.showMessage("年(西暦)を入力してください。");
		input = scan.nextLine();
		while(!conUltil.isInteger(input) || Integer.parseInt(input) <1){
			if (!conUltil.isInteger(input)) {
				conUltil.showMessage("入力された値は整数ではありません。");
			}else{
				if (Integer.parseInt(input) < 1) {
					conUltil.showMessage("1以上を入力してください。");
				}
			}
			input = scan.nextLine();
		}
		int year = Integer.parseInt(input);
		if (isLeapYear(year)==true) {
			conUltil.showMessage("入力された値はうるう年です。");
		}else{
			conUltil.showMessage("入力された値はうるう年ではありません。");
		}
	}

	public static boolean isLeapYear(int y){
		if ((y%4==0 && y%100 != 0) || y%400==0) {
			return true;
		}else{
			return false;
		}
	}

}
