package sample;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatasuplier {
	public static void main(String args[]) throws IOException
	{
		File excelfile=new File("D:\\Movies\\Book1.xlsx");
		System.out.println(excelfile.exists());
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.getSheet("sheet ");
		
		DataFormatter df=new DataFormatter();
		for(int i=1;i<sheet.getLastRowNum();i++) {
			Row r=sheet.getRow(i);
		
			for(int j=0;j<r.getLastCellNum();j++)
			{
		
				
				String data=df.formatCellValue(sheet.getRow(i).getCell(j));
				
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
		
		
		
		
		
	}

}
