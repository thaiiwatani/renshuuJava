/**
 * 
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class kadai1N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("一つ目の文字を入力してください。");
		str = scan.nextLine();
		System.out.println("二つ目の文字を入力してください。");
		str += " " +scan.nextLine();
		System.out.println("三つ目の文字を入力してください。");
		str += " " + scan.nextLine();
		System.out.println(str);
	}
}
