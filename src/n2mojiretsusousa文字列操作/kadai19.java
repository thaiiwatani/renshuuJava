package n2mojiretsusousa�����񑀍�;


public class kadai19 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="�����s������";
		String s2 ="���E";
		String s3="�����s���{";
		String s4="���n��";
		String s5="�����s���c�擌�_�c";
		String s6 ="���c��";
		sourcefileUltils s = new sourcefileUltils();
		int position1 =s.searchIndexOf(s3, "�s");
		int position2 =s.searchIndexOf(s5, "�s");
		
		System.out.println("1��2��ǉ��������ʂ�'"+s.stringBufferAdd(s1, s2)+"'�ł�");
		System.out.println("3��4��}���������ʂ�'"+s.stringBufferInsert(s3, s4, position1)+"'�ł�");
		System.out.println("5����'"+s6+"'���폜�������ʂ�'"+s.stringBufferDelete(s5, s6, position2)+"'�ł��B");
		
		
		
		
		
	}

}

