package n2mojiretsusousa文字列操作;


public class kadai17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="256";
		String s2 ="128";
		int i3=256;
		int i4=128;
		
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("1と2の和は"+s.converToIntAndPlus(s1, s2)+"です");
		System.out.println("1と2の和は"+(s.converFromString(s1)+s.converFromString(s2))+"です");
		System.out.println("3の変換結果は"+s.convertToString(i3)+"です");
		System.out.println("4の変換結果は"+s.convertToString(i4)+"です");
		
		
		
		
	}

}

