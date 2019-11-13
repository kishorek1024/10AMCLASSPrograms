package gridd;

import java.io.FileInputStream;

import jxl.Workbook;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Exc {

	public static void main(String[] args) throws Exception{
		
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\WD1010\\1112.xlsx");
		HSSFWorkbook wb=new HSSFWorkbook(f);
		HSSFSheet s=wb.getSheet("Sheet1");
		
		System.out.println(s.getRow(0).getCell(0).getStringCellValue());
		
		

	}

}
