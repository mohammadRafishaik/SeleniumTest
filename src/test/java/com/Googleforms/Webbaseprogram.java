package com.Googleforms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;



public class Webbaseprogram extends Baseclassforexcel {
	public static WebDriver driver;
	public static Baseclassforexcel exceldata;

	
	public static WebDriver gmaillogin(String Browser,String URL,String Email,String Password) throws InterruptedException {
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TT089\\Downloads\\drivers\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(URL);	
			driver.findElement(By.xpath("//input[@type='email']")).clear();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Email);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='passwordNext']//content[@class='CwaK9']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(4000);
		}	
		
		else
		{
			System.out.println("Element are not found in base method");
		}
		return driver;
		
	

}
	public static void formfilling(String Nameofform) throws InterruptedException {
		//Enter name of Untitled form 
		WebElement element = driver.findElement(By.xpath("//textarea[contains(text(),'Untitled form')]"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), Nameofform);

	}
		public static void question(String question) throws InterruptedException {
			//Enter name of Untitled Question
		WebElement element = driver.findElement(By.xpath("//textarea[contains(text(),'Untitled Question')]"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), question);
		Thread.sleep(4000);
	}

	public static void option1(String op1) throws InterruptedException {
		//Enter option1
		WebElement element = driver.findElement(By.xpath("//input[@value='Option 1']"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), op1);
		Thread.sleep(4000);

	
		
	}
	public static void option2(String op2) throws InterruptedException {
		//Enter Name of option 2
		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text']")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Option 2']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), op2);
		Thread.sleep(4000);

	}
	public static void option3(String op3) throws InterruptedException {
		//Enter Name of option 3

		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text'] ")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Option 3']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), op3);
		Thread.sleep(4000);
	}
	public static void option4(String op4) throws InterruptedException {
		//Enter Name of option 4

		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text']")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Option 4']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), op4);
		Thread.sleep(4000);

	}
	
	//Enter question2
	public static void question2(String Qu2) throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='freebirdFormeditorViewItemRoot itemBorder freebirdFormeditorViewItemActive']//div[@class='freebirdMaterialIconIconImage freebirdMaterialIconIconDarkIcon freebird-qp-icon-copy-b']")).click();
		WebElement element1=driver.findElement(By.xpath("//textarea[contains(text(),'BDD Is Popular and can be utilized for')]"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"),Qu2);
		Thread.sleep(4000);
			}
	
	//Enter Option1
	public static void option1qa2(String q2op1) throws InterruptedException {
		//Enter option1
		WebElement element = driver.findElement(By.xpath("//input[@value='Unit Test Cases']"));
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), q2op1);
		Thread.sleep(4000);
}
	//Enter Option2
	public static void option2qa2(String q2op2) throws InterruptedException {
		//Enter Name of option 2
		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text']")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Unit Test Cases']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), q2op2);
		Thread.sleep(4000);

	}
	//Eneter option3
	public static void option3op3(String q2op3) throws InterruptedException {
		//Enter Name of option 3

		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text'] ")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Ui leave Test Cases']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), q2op3);
		Thread.sleep(4000);
	}
	//Eneter option4

	public static void option4op4(String q2op4) throws InterruptedException {
		//Enter Name of option 4

		driver.findElement(By.xpath("//div[@class='quantumWizTextinputSimpleinputEl docssharedWizOmnilistGhostitemInput freebirdFormeditorViewOmnilistGhostitemInput freebirdThemedInput']//input[@type='text']")).click();
		WebElement element1=driver.findElement(By.xpath("//input[@value='Unit integration system level test cases']"));
		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), q2op4);
		Thread.sleep(4000);

	}
	
	
	
	
	
	
	
	
	
	
	
	public static void savequestions() throws InterruptedException {
		//Save question

		driver.findElement(By.xpath("//div[@class='freebirdMaterialIconIconImage freebirdLightIconWithHeader freebird-qp-icon-settings-w']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//content[contains(text(),'Quizzes')]")).click();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//div[@class='quantumWizTogglePapertoggleEl docssharedWizToggleLabeledControl freebirdThemedToggle']//div[@class='quantumWizTogglePapertoggleTrack exportTrack']"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		executor.executeScript("arguments[0].click();", element);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='quantumWizButtonEl quantumWizButtonPaperbuttonEl quantumWizButtonPaperbuttonFlat quantumWizButtonPaperbuttonFlatColored quantumWizButtonPaperbutton2El2 quantumWizDialogPaperdialogDialogButton exportDefaultDialogButton isUndragged']//span[@class='quantumWizButtonPaperbuttonLabel exportLabel'][contains(text(),'Save')]")).click();
	Thread.sleep(4000);
	}
	
	public static void getscreenshot() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(source,new File("./Screenshots/Test_"+Webbaseprogram.getexecutiontime()+".png"));
	} 
	catch (IOException e) 
	{
		System.out.println("File is not loaded");
	}
		
		
	}
	public static String getexecutiontime() {
		SimpleDateFormat datevalue=new SimpleDateFormat("MM_DD_YYYY_HH_mm_ss");
		Date currentdate=new Date();
		return datevalue.format(currentdate);
		
		
	}
	@AfterTest
	public static void closebrowser()
	{
		//Close the browser
		//driver.close();
	}
}

		
	

