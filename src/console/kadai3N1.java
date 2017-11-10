/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author J1637001
 *
 */
public class kadai3N1 {
	//static Scanner scan;
	static ConsoleUltils conUltil;

	public static void main(String[] args) {
		conUltil = new ConsoleUltils();
		//scan = new Scanner(System.in);

		conUltil.showMessage("1つ目の数値を入力してください。。");
		String input1 = conUltil.scan.nextLine();
		float number1 = conUltil.getFloat(input1);

		conUltil.showMessage("2つ目の数値を入力してください。");
		String input2 = conUltil.scan.nextLine();
		float number2 = conUltil.getFloat(input2);

		//割り算
		//Dem chuoi ket qua
			//Neu sau dau cham la 3 chu so thi hien thi luon
			//Neu tren 4 chu so thi lam tron thanh 3 chu so -> hien thi
		conUltil.showMessage("割り算結果は : " + conUltil.round(number1/number2,3));
	}
}
