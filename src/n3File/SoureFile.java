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
		 // ���� file���`�F�b�N.
		File apath = new File(pathname);
        System.out.println("Path exists? " + apath.exists());
 
        if (apath.exists()) {
 
            // 'apath'���f�B���N�g���ł��邩�ǂ����m�F���܂�
            System.out.println("Directory? " + apath.isDirectory());
 
            // 'apath' ���B�ꂽ�p�X���ǂ������`�F�b�N����
            System.out.println("Hidden? " + apath.isHidden());
 
            // �ȒP�ȃl�[��
            System.out.println("Simple Name: " + apath.getName());
 
            //��΃p�X�B
            System.out.println("Absolute Path: " + apath.getAbsolutePath());
 
            //  file�̃T�C�Y���`�F�b�N :
            System.out.println("Length (bytes): " + apath.length());
 
            // �Ō�̎��� 
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
 
        // mkdir(), �e�f�B���N�g���́A�f�B���N�g�������݂���ꍇ�̂ݍ쐬����܂��B
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
			System.out.println("�t�@�C�������݂��܂��B");
			file.delete();
			System.out.println("�t�@�C��������܂����B");
			check=true;
		}
		else
		{
			System.out.println("�t�@�C�������݂��܂���B");
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
			System.out.println("Foder�����݂��܂��B");
			File[] children = dir.listFiles();
			if(children.length==0)
			{
				dir.delete();
				System.out.println("Foder������܂����B");
				check=true;
			}
			else
			{
				System.out.println("Foder�̒����t�@�C���Ƃ�������܂��̂Ŏ���ł��܂���B");
				check=false;
			}
			
		}
		else
		{
			System.out.println("Foder�����݂��܂���B");
			check=false;
		}
		return check;
	}
	
	

}
