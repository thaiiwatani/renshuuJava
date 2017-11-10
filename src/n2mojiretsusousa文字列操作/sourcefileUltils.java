package n2mojiretsusousa•¶Žš—ñ‘€ì;

public class sourcefileUltils {
	
	
	int countString(String s)
	{
		int count=0;
		count=s.length();
		return count;
	}
	boolean compareString(String s1,String s2)
	{
		boolean result;
		result= s1.equals(s2);
		return result;
	}
	int compareToString(String s1,String s2)
	{
		return s1.compareTo(s2);
	}
	String cutString(String s, int beginIndex, int endIndex)
	{
		String result="";
		if(beginIndex>endIndex)
		{
			System.out.println("Error");
			
		}
		else if(beginIndex==endIndex)
		{
			
			result=s.substring(beginIndex-1, endIndex);
			
		}
		else
		{
			result=s.substring(beginIndex-1, endIndex);
		}
		return result;
	}
	int searchIndexOf(String s,String keywork)
	{
		int result=0;
		result=s.indexOf(keywork)+1;
		return result;
		
	}
	String searchString(String s,String keywork)
	{
		String result="";
		result = cutString(s, searchIndexOf(s, keywork)+countString(keywork), countString(s));
	
		return result;
	}
	int converFromString(String s)
	{
		int result=0;
		try{
		result=Integer.parseInt(s);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error"+e.getMessage());
		}
		
		return result;
	}
	int converToIntAndPlus(String s1,String s2)
	{
		int result=0;
		try{
		result=Integer.parseInt(s1)+Integer.parseInt(s2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error"+e.getMessage());
		}
		
		return result;
	}
	String convertToString(int par)
	{
		String s ="";
		s=String.valueOf(par);
		return s;
	}
	String addString(String s1, String s2)
	{
		return s1+s2;
	}
	//int position parameter is the position of the character needs to be added
	String insertString(String s1, String s2,int position)
	{
		String s ="";
		String temp="";
		temp=s1.substring(0, position);
		temp=temp+s2+s1.substring(position, s1.length());
		
		return temp;
	}
	//int position parameter is the position of the character needs to be delete
	//String s2 parameter is string to delete
	String deleteString(String s1, String s2,int position)
	{
		
		String temp="";
		temp=s1.substring(0, position);
		temp=temp+s1.substring(position+s2.length(), s1.length());
		
		return temp;
	}
	//StringBuffer use
	StringBuffer stringBufferAdd(String s1, String s2)
	{
		StringBuffer sb = new StringBuffer(s1);
		sb.append(s2);
		return sb;
	}
	StringBuffer stringBufferInsert(String s1, String s2,int position)
	{
		StringBuffer sb = new StringBuffer(s1);
		sb.insert(position, s2);
		return sb;
	}
	StringBuffer stringBufferDelete(String s1, String s2,int position)
	{
		StringBuffer sb = new StringBuffer(s1);
		sb.delete(position, position+s2.length());
		return sb;
	}
	//Stringbuilder oneThread
	//StringBuffer is Multi Thread
	//
	
}
