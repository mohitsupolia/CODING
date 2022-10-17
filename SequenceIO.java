package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceIO
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\User\\Desktop\\IOException.java");
			FileInputStream fileInputStream1=new FileInputStream("C:\\Users\\User\\Desktop\\IOError.java");
			SequenceInputStream sequenceInputStream=new SequenceInputStream(fileInputStream,fileInputStream1);
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\p2.java");
			String s="Hii,My name is Mohit Supolia.......";
			byte b[]=s.getBytes();
			try {
				fileOutputStream.write(b);
			}
			catch (IOException e1) {
				e1.printStackTrace();
			}
			while(true)
			{
			
			try {
			int	i = sequenceInputStream.read();
			if(i==-1)
				break;
			System.out.println((char)i);
			}
			
			catch (IOException e) {
				
				e.printStackTrace();
			}
			}
		}
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}

	}

}
