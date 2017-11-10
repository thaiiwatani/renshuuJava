package n2mojiretsusousa•¶š—ñ‘€ì;
public class kadai13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="123";
		String s2 ="456";
		String s3 ="DEF";
		String s4 ="ABC";
		String s5 ="123";
		
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("1‚Æ2‚Ì‘å¬”äŠrŒ‹‰Ê = "+s.compareToString(s1, s2));
		System.out.println("3‚Æ4‚Ì‘å¬”äŠrŒ‹‰Ê = "+s.compareToString(s3, s4));
		System.out.println("1‚Æ5‚Ì‘å¬”äŠrŒ‹‰Ê = "+s.compareToString(s1, s5));
		
		
	}

}

