package n3File;

import java.io.IOException;

public class kadai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoureFile sF = new SoureFile();
		String fileName="input01.txt";
		boolean check =false;
		try {
			check= sF.makeFile(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check)
		{
			System.out.println("OKKKKKKKKKKKKKKKKKKKKKKKK");
		}

	}

}
