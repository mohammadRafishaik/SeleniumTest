package com.Googleforms;

import org.testng.annotations.Test;

public class Webforms extends Webbaseprogram {
	@Test
	public static void googlefourms() throws Exception {

		Baseclassforexcel exceldata=new Baseclassforexcel();
//		exceldata.setExcelFile("E:\\sivakumarims\\SeleniumTest\\TestData\\TestDataofforum.xlsx", "TestData");
		exceldata.setExcelFile("./TestData/TestDataofforum.xlsx","TestData");
		//Login data
		String url=	exceldata.getCellData(1, 0);
		String Email=exceldata.getCellData(1, 1);
		String password=exceldata.getCellData(1, 2);
		//Options of Google forum
		String Formname=exceldata.getCellData(1, 3);
		String Question=exceldata.getCellData(1, 4);
		String option1=exceldata.getCellData(1, 5);
		String option2=exceldata.getCellData(1, 6);
		String option3=exceldata.getCellData(1, 7);
		String option4=exceldata.getCellData(1, 8);
		
		//Gmail login page
		Webbaseprogram.gmaillogin("Chrome",url,Email,password);

		//Googl Form Filling 
		
		
		Webbaseprogram.formfilling(Formname);
		Webbaseprogram.getscreenshot();
		
		Webbaseprogram.question(Question);
		Webbaseprogram.getscreenshot();
		
		Webbaseprogram.option1(option1);
		Webbaseprogram.getscreenshot();

		Webbaseprogram.option2(option2);
		Webbaseprogram.getscreenshot();

		Webbaseprogram.option3(option3);
		Webbaseprogram.getscreenshot();

		Webbaseprogram.option4(option4);
		Webbaseprogram.getscreenshot();

		Webbaseprogram.savequestions();
		Webbaseprogram.getscreenshot();

		
	}

}
