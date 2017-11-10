package n2mojiretsusousa•¶š—ñ‘€ì;


public class kadai18 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="“Œ‹“s™•À‹æ";
		String s2 ="‰¬ŒE";
		String s3="“Œ‹“s‘‹{";
		String s4="—û”n‹æ";
		String s5="“Œ‹“sç‘ã“c‹æ“Œ_“c";
		String s6 ="ç‘ã“c‹æ";
		sourcefileUltils s = new sourcefileUltils();
		int position1 =s.searchIndexOf(s3, "“s");
		int position2 =s.searchIndexOf(s5, "“s");
		
		System.out.println("1‚Æ2‚ğ’Ç‰Á‚µ‚½Œ‹‰Ê‚Í'"+s.addString(s1, s2)+"'‚Å‚·");
		System.out.println("3‚Æ4‚ğ‘}“ü‚µ‚½Œ‹‰Ê‚Í'"+s.insertString(s3, s4, position1)+"'‚Å‚·");
		System.out.println("5‚©‚ç'"+s6+"'‚ğíœ‚µ‚½Œ‹‰Ê‚Í'"+s.deleteString(s5, s6, position2)+"'‚Å‚·B");
		
		
		
		
		
	}

}

