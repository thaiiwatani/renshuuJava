package n6OverloadOverride;

public class kadai2N6 {
	public void println(String s1)
	{
		String s =("[説明]\n"
				+ " 引数1のString型文字列をコンソールに出力する\n"
				+ "[引数]\n"
				+ "引数1：String型\n"
				+ "[戻り値]\n"
				+ "なし\n");
		Print(s);
	}
	public void println(String s1,String s2)
	{
		String s =("[説明]\n"
				+ "引数1と引数２を結合したString型文字列をコンソールに出力する。\n"
				+ "[引数]\n"
				+ "引数1：String型文字列\n"
				+ "引数2：String型文字列\n"
				+ "[戻り値]\n"
				+ "なし\n");
		Print(s);
	}
	
	
	public void Print(String s)
	{
		System.out.println(s);
	}
	

}

 class testRun {
	public static void main(String args[]){  
		
		kadai2N6 n6 = new kadai2N6();
		

	}
}
