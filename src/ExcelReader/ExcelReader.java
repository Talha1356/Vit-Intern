package ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		File fs = new File("./ExcelTest/Book1.xlsx");
		FileInputStream fins = new FileInputStream(fs);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs); 
		
		XSSFSheet sheet = workbook.getSheet("Login");
		
		int rows = sheet.getLastRowNum();
		System.out.println("Total number of rows are "+ rows);
		
		short cols = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of columns are "+cols);
		
		String firstname = sheet.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(firstname);
//
		XSSFRow row0 = sheet.getRow(1);
		
		for(int i=0;i<cols;i++) {
			System.out.println(row0.getCell(i).getStringCellValue()+ " ");
		}
	}
}
