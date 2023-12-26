package com.selenium.datadriventests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file=new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop//InstagramTestData2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		
		XSSFRow row=sheet.createRow(0);
		
		row.createCell(0).setCellValue("akhilaupputoori");
		row.createCell(1).setCellValue("akhilaupputoori@123");
		
		workbook.write(file);
		file.close();
		System.out.println("new data added");
		

	}

}
