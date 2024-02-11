package sample;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateandWriteExcel {
	public static void main(String[] args) throws IOException {
	
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("testsheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell  (0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("guru");
		sheet.getRow(1).createCell(1).setCellValue("hari");
		File file=new File("D:\\hari selenium\\newproject\\EXCELFILE\\testdata3.xls");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(file);
		workbook.close();
		
	}

}
