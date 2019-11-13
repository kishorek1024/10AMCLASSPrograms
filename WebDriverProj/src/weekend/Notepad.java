package weekend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepad {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD1010\\1102new.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore");
		bw.newLine();
		bw.append("This is Selenium");
		//bw.write("This is Selenium");
		bw.close();
	}
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD1010\\1102.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null){
			System.out.println(s);
		}

	}*/

}
