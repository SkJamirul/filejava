import java.util.*;
import java.io.*;

class FileDemo
{
	void reading()
	{
		FileReader fr=null;
		
		try{
			
				File fileObj=new File("Result12072023.txt");
				fr=new FileReader(fileObj);
				
				int ch;
				while((ch=fr.read())!=-1)
				{			
					System.out.print((char)ch);
				}
				
				
		}
		catch(Exception ex)
		{
			System.out.println("File exception");
		}
		finally
		{
			try{
				fr.close();
			}
			catch(Exception ex)
			{
				System.out.println("File closing exception");
			}
		}
	}
	void writing()
	{
		FileWriter fw=null;
		String res;
		String myfilename;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Write something to be stored on file : ");
		res=sc.nextLine();
		System.out.println("provide file name for write op : ");
		myfilename=sc.nextLine();
		
		//System.out.println("Length of string : "+res.length());
		
		try{
			
				//File fileObj=new File("Result12072023.txt");
				File fileObj=new File(myfilename);
				fw=new FileWriter(fileObj);
				
				char ch;
				int i=0;
				while(i<res.length())
				{			
					ch=res.charAt(i);
					fw.write(ch);
					i++;
				}
				
				
		}
		catch(Exception ex)
		{
			System.out.println("File exception");
		}
		finally
		{
			try{
				fw.close();
			}
			catch(Exception ex)
			{
				System.out.println("File closing exception");
			}
		}
	}

}
class fileDemoRun
{
	public static void main(String args[])
	{
		FileDemo obj=new FileDemo();
		obj.writing();
		obj.reading();
	}
}