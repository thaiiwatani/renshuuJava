package n2mojiretsusousa�����񑀍�;


public class kadai17 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="256";
		String s2 ="128";
		int i3=256;
		int i4=128;
		
		sourcefileUltils s = new sourcefileUltils();
		System.out.println("1��2�̘a��"+s.converToIntAndPlus(s1, s2)+"�ł�");
		System.out.println("1��2�̘a��"+(s.converFromString(s1)+s.converFromString(s2))+"�ł�");
		System.out.println("3�̕ϊ����ʂ�"+s.convertToString(i3)+"�ł�");
		System.out.println("4�̕ϊ����ʂ�"+s.convertToString(i4)+"�ł�");
		
		
		
		
	}

}

