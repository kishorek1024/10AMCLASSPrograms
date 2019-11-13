package weekend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Con {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD1010\\xyz.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore");
		bw.newLine();
		bw.write("This is Selenium");
		bw.close();
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD1010\\123.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		while((s=b.readLine())!=null){
			String[] c=s.split(" ");
			
			
			WebDriver driver=new FirefoxDriver();
			driver.get(c[0]);
			driver.manage().window().maximize();
			
			driver.findElement(By.id(c[1])).sendKeys(c[3]);
			driver.findElement(By.id(c[2])).sendKeys(c[4]);
			driver.close();
		}*/
		
		/*String val=b.readLine();
		
		
		
		String s;
		while((s=b.readLine())!=null){
		
		WebDriver driver=new FirefoxDriver();
		driver.get(c[0]);
		
		}*/
		
		/*String s;
		
		while((s=b.readLine())!=null){
			System.out.println(s);
		}*/
		
		
		/*FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD1010\\1234.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 1);
		
		int i;
		for(i=0; i<101; i++){
			Label l=new Label(0, i, "Value is " + i);
			ws.addCell(l);
		}*/
		
		
		
		/*WritableSheet ws1=wwb.createSheet("Result1", 0);
		
		int a=20; int b=40;
		int c=a*b; int d=b-a;
		
		Label l=new Label(0, 0, "C Value is " + c);
		ws.addCell(l);
		Label l1=new Label(0, 0, "D Value is " + d);
		ws1.addCell(l1);
		*/
		//wwb.write();wwb.close();
		
		/*// Identify the location of Excel
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\WD1010\\1020.xls");
		
		// Open Identified Excel
		Workbook wb=Workbook.getWorkbook(f);
		
		// Open Sheet from Opened Excel
		Sheet s=wb.getSheet("Sheet1");
		
		int r=s.getRows(); int c=s.getColumns();
		int i; int j;
		
		for(i=0; i<c; i++){
			for(j=0; j<r; j++){
				String val=s.getCell(i, j).getContents();
				if(val.equals("kumar")==true)
					System.out.println(i + "-" + j);
			}
		}*/
		
		/*int c=s.getColumns();
		int i;
		for(i=0; i<c; i++){
			System.out.println(s.getCell(i, 0).getContents());
		}*/
		
		/*int r=s.getRows();
		int i;
		for(i=0; i<r; i++){
			System.out.println(s.getCell(0, i).getContents());
		}*/
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(s.getCell(0, 1).getContents())).sendKeys(s.getCell(0, 2).getContents());
		driver.findElement(By.xpath(s.getCell(0, 3).getContents())).sendKeys(s.getCell(0, 4).getContents());*/
		
		/*System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell("B1").getContents());*/
		
		

	}

}
