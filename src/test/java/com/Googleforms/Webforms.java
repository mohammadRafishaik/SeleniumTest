package com.Googleforms;

import org.testng.annotations.Test;

public class Webforms extends Webbaseprogram {
	static String filepath ="./TestData/TestDataofforum.xlsx";
	@Test
	public static void googlefourms() throws Exception {

		Baseclassforexcel exceldata=new Baseclassforexcel();
		
		exceldata.setExcelFile("./TestData/TestDataofforum.xlsx", "Login");
		//Login data
		
		String url=	exceldata.getCellData(1, 0);
		String Email=exceldata.getCellData(1, 1);
		String password=exceldata.getCellData(1, 2);
		Webbaseprogram.gmaillogin("Chrome",url,Email,password);
		exceldata.setExcelFile(filepath,"TestData");
		for(int j=1;j<=exceldata.rowcont;j++)
		{
		/*String url=	exceldata.getCellData(j, 0);
		String Email=exceldata.getCellData(j, 1);
		String password=exceldata.getCellData(j, 2);*/
		//Options of Google forum
		String Formname=exceldata.getCellData(j, 0);
		String Question=exceldata.getCellData(j, 1);
		String option1=exceldata.getCellData(j, 2);
		String option2=exceldata.getCellData(j, 3);
		String option3=exceldata.getCellData(j, 4);																																																																								
		String option4=exceldata.getCellData(j, 5);
		String question2=exceldata.getCellData(j, 6);
		String option1q2=exceldata.getCellData(j, 7);
		String option2q2=exceldata.getCellData(j, 8);
		String option3q2=exceldata.getCellData(j, 9);
		String option4q2=exceldata.getCellData(j, 10);



		
		//Gmail login page
		/*Webbaseprogram.gmaillogin("Chrome",url,Email,password);*/

		//Googl Form Filling 
		
		
		Webbaseprogram.formfilling(Formname);
		Webbaseprogram.getscreenshot();
		
		//question 1
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
		
		//Question2
		Webbaseprogram.question2(question2);
		Webbaseprogram.option1qa2(option1q2);
		
		Webbaseprogram.option2qa2(option2q2);
		
		Webbaseprogram.option3op3(option3q2);
		
		Webbaseprogram.option4op4(option4q2);
		
		///Save Forum
		Webbaseprogram.savequestions();
		Webbaseprogram.getscreenshot();
		

		
		
	}
	}
}
