/**
 *
 */
package console;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class ConsoleUltils {
	static public Scanner scan;

	ConsoleUltils(){
		scan = new Scanner(System.in);
	}


	public static float getFloat(String str){
		String input = str;
		try {
			while(!isFloat(input)){
				showMessage("入力された値が不正です。もう一度入力してください。");
				input = scan.nextLine();
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			showMessage("入力エラーです。");
		}
		float num = Float.parseFloat(input);
		return num;
	}

	public static boolean isFloat(String str) throws Exception {
		try{
			String regex = "^([+-]?\\d*\\.?\\d*)$";
			if (str.matches(regex)) {
				return true;
			}else{
				return false;
			}
		}catch(Exception ex){
			throw ex;
		}
	}


	public boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

	public String createStringNumber(int start, int jump, int lengh) {
		String str = "";
		str += start + " ";
		for(int i=0;i<lengh;i++) {
			start += jump;
			str += start + " ";
		}
		return str;
	}


	public static float round(float number, int digit){
		if (digit > 0){
			int temp = 1, i;
			for (i = 0; i < digit; i++)
				temp = temp*10;
			number = number*temp; //1.69375 * 1000 = 1693.75
			number = Math.round(number);  //1693.75 ->  1694
			number = number/temp;  //1694-> 1.694
			return number;
		}
		else
			return 0;
	}

	public static void showMessage(String str) {
		System.out.println(str);
	}



}
