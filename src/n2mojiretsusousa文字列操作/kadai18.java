package n2mojiretsusousa文字列操作;


public class kadai18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="東京都杉並区";
		String s2 ="荻窪";
		String s3="東京都早宮";
		String s4="練馬区";
		String s5="東京都千代田区東神田";
		String s6 ="千代田区";
		sourcefileUltils s = new sourcefileUltils();
		int position1 =s.searchIndexOf(s3, "都");
		int position2 =s.searchIndexOf(s5, "都");
		
		System.out.println("1と2を追加した結果は'"+s.addString(s1, s2)+"'です");
		System.out.println("3と4を挿入した結果は'"+s.insertString(s3, s4, position1)+"'です");
		System.out.println("5から'"+s6+"'を削除した結果は'"+s.deleteString(s5, s6, position2)+"'です。");
		
		
		
		
		
	}

}

