package n6OverloadOverride;

public class kadai2N6 {
	public void println(String s1)
	{
		String s =("[����]\n"
				+ " ����1��String�^��������R���\�[���ɏo�͂���\n"
				+ "[����]\n"
				+ "����1�FString�^\n"
				+ "[�߂�l]\n"
				+ "�Ȃ�\n");
		Print(s);
	}
	public void println(String s1,String s2)
	{
		String s =("[����]\n"
				+ "����1�ƈ����Q����������String�^��������R���\�[���ɏo�͂���B\n"
				+ "[����]\n"
				+ "����1�FString�^������\n"
				+ "����2�FString�^������\n"
				+ "[�߂�l]\n"
				+ "�Ȃ�\n");
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
