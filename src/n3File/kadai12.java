package n3File;
public class kadai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoureFile sF = new SoureFile();
		String link ="C:/Users/J1637009/Desktop/Java_renshuu/input";
		String fileName="input01.txt";
		boolean check =false;

		check= sF.makeDir(link, fileName);
		
		if(check)
		{
			System.out.println("OKKKKKKKKKKKKKKKKKKKKKKKK");
		}

	}

}
