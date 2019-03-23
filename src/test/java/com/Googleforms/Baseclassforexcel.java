package com.Googleforms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Baseclassforexcel  {

	
	
	public static XSSFSheet ExcelWSheet;
	 
	public static XSSFWorkbook ExcelWBook;

	public static XSSFCell Cell;

	public static XSSFRow Row;
	
	public static int rowcont;

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		rowcont = ExcelWSheet.getLastRowNum();

		} catch (Exception e){

			throw (e);

		}

}

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public String getCellData(int RowNum, int ColNum) throws Exception{

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

			}catch (Exception e){

			return"";

			}

}

//This method is to write in the Excel cell, Row num and Col num are the parameters



	}
	
	
	
	
	
	
	
	
	
	
	
	

