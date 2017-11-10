package n2mojiretsusousa文字列操作;


public class kadai15 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="東京都杉並区";
		String keywork1 ="杉";
		String keywork2 ="京都杉";
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("`"+keywork1+"'が最初に出現するのは"+s.searchIndexOf(s1, keywork1)+"文字目です。");
		System.out.println("`"+keywork2+"'が最初に出現するのは"+s.searchIndexOf(s1, keywork2)+"文字目です。");
		
		
		
	}

}

