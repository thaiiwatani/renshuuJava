package n2mojiretsusousa文字列操作;


public class kadai16 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="東京都杉並区";
		String keywork1 ="東";
		String keywork2 ="都杉";
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("`"+keywork1+"'より、後の文字列は'"+s.searchString(s1, keywork1)+"'です。");
		System.out.println("`"+keywork2+"'より、後の文字列は'"+s.searchString(s1, keywork2)+"'です。");
		
		
		
	}

}

