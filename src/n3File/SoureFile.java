package n3File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import com.sun.org.apache.regexp.internal.recompile;


public class SoureFile {
	boolean chekFile(String pathname)
	{
		boolean check = true;
		 // 存在 fileをチェック.
		File apath = new File(pathname);
        System.out.println("Path exists? " + apath.exists());
 
        if (apath.exists()) {
 
            // 'apath'がディレクトリであるかどうか確認します
            System.out.println("Directory? " + apath.isDirectory());
 
            // 'apath' が隠れたパスかどうかをチェックする
            System.out.println("Hidden? " + apath.isHidden());
 
            // 簡単なネーム
            System.out.println("Simple Name: " + apath.getName());
 
            //絶対パス。
            System.out.println("Absolute Path: " + apath.getAbsolutePath());
 
            //  fileのサイズをチェック :
            System.out.println("Length (bytes): " + apath.length());
 
            // 最後の時間 
            long lastMofifyInMillis = apath.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);
 
            System.out.println("Last modify date: " + lastModifyDate);
        }
        else check=false;
		return check;
		
	}
	boolean makeDir(String link,String fileName)
	{
		boolean checkFile;
		
		File dir1= new File(link);
		System.out.println("Pathname: " + dir1.getAbsolutePath());
		checkFile=dir1.exists();
		
        System.out.println("Path Exists? " + dir1.exists());
        System.out.println("Parent Path Exists? " + dir1.getParentFile().exists());
 
        // mkdir(), 親ディレクトリは、ディレクトリが存在する場合のみ作成されます。
        boolean created = dir1.mkdir();
        if(created)
        {
			String link2 = link+"/"+fileName;
			OutputStream outFile = null;
			try {
				outFile = new FileOutputStream(link2);
				System.out.println("Path Exists? " + outFile.toString());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				created=false;
			}
			try {
				outFile.close();
				created=true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				created=false;
				e.printStackTrace();
				
			}
        }
        
		
		return created;
	}
	boolean makeFile(String fileName) throws IOException
	{
		boolean created = true;
		try {
			OutputStream os = new FileOutputStream(fileName);
			for(int i =0;i<100;i++)
			{
				try {
					os.write(i);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			created=false;
			
			e.printStackTrace();
			return created;
		}
		
		return created;
	}
	boolean delFile(String pathname)
	{
		boolean check;
		
		File file = new File(pathname);
		
		if(file.exists())
		{
			System.out.println("ファイルが存在します。");
			file.delete();
			System.out.println("ファイルが取消ました。");
			check=true;
		}
		else
		{
			System.out.println("ファイルが存在しません。");
			check=false;
		}
		return check;
	}
	boolean delDir(String pathname)
	{
		boolean check;
		
		File dir = new File(pathname);
		
		if(dir.exists())
		{
			System.out.println("Foderが存在します。");
			File[] children = dir.listFiles();
			if(children.length==0)
			{
				dir.delete();
				System.out.println("Foderが取消ました。");
				check=true;
			}
			else
			{
				System.out.println("Foderの中がファイルとかがありますので取消できません。");
				check=false;
			}
			
		}
		else
		{
			System.out.println("Foderが存在しません。");
			check=false;
		}
		return check;
	}
	
	

}
