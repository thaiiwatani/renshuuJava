/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai3N2 {
	static ConsoleUltils conUltil;

	public static void main(String[] args) {
		conUltil = new ConsoleUltils();

		//get float number 1
		conUltil.showMessage("1つ目の数値を入力してください。。");
		String input1 = conUltil.scan.nextLine();
		float number1 = conUltil.getFloat(input1);

		//get float number 2
		conUltil.showMessage("2つ目の数値を入力してください。");
		String input2 = conUltil.scan.nextLine();
		float number2 = conUltil.getFloat(input2);



		//結果を処理
		conUltil.showMessage("足し算結果は " + conUltil.round(number1+number2,7));
		conUltil.showMessage("引き算結果は " + conUltil.round(number1-number2,7));
		conUltil.showMessage("掛け算結果は " + number1*number2);
		conUltil.showMessage("割り算結果は " + conUltil.round(number1/number2,7));
	}
}
