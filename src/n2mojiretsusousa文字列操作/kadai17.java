package n2mojiretsusousa•¶š—ñ‘€ì;


public class kadai17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="256";
		String s2 ="128";
		int i3=256;
		int i4=128;
		
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("1‚Æ2‚Ì˜a‚Í"+s.converToIntAndPlus(s1, s2)+"‚Å‚·");
		System.out.println("1‚Æ2‚Ì˜a‚Í"+(s.converFromString(s1)+s.converFromString(s2))+"‚Å‚·");
		System.out.println("3‚Ì•ÏŠ·Œ‹‰Ê‚Í"+s.convertToString(i3)+"‚Å‚·");
		System.out.println("4‚Ì•ÏŠ·Œ‹‰Ê‚Í"+s.convertToString(i4)+"‚Å‚·");
		
		
		
		
	}

}

