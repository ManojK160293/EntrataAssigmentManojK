//import java.util.concurrent.TimeUnit;

//import javax.xml.datatype.Duration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EntrataAssignement { 
 //Global declaration 
	public static WebDriver driver = null; 
	WebDriverWait wait =null;
	SoftAssert softAssert = null;//
	
	@BeforeTest
	  public void setUp() throws Exception  
	{
	  
	driver = new ChromeDriver(); //Chorme driver object creation 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Use implicit Wait 
	wait = new WebDriverWait(driver,Duration.ofSeconds(20)); //Object create 
	softAssert =new SoftAssert(); //Object create soft assertion 
	}
	
	//Test Case 1 
	@Test (priority = 1)    //Control the next method to be executed and set priority as 1 
	public void launchBrowser()
	{
		
		driver.get("https://www.entrata.com/"); //Launch broswer 
		driver.manage().window().maximize();   //Maximize window 
	}
	
	//Test case 2 
	@Test (priority = 2)
	public void Homepage() 
	
	{
		driver.findElement(By.id("rcc-confirm-button")).click();//Accept cookies using ID locator 
		
		
			
		WebElement button=driver.findElement(By.xpath("(//*[@class=\"button-default solid-dark-button\"])[1]"));
		button.click(); //using xpath finnd watch button and Click 
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='FirstName']"))); //Wait until next element visible  
		
	}

	//Test case 3 
	@Test (priority = 3)
	public void formsubmit()
	{
		//Find Text box and Select count from dropdon and send values 
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Manoj");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Katkar");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("katkarm27@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("TMT PVT LTD");
		driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("8390245424");
		WebElement	unit=driver.findElement(By.xpath("//*[@id=\"Unit_Count__c\"]")); //Select drop down value using index 
		Select s1=new Select(unit);
		s1.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("QA");
		
		//driver.findElement(By.xpath("//*[@type=\"submit\"]")).click(); //Here we find Watch Demo button but as per requirement/assignment we are not clicking on button .
		
	    driver.navigate().back();//navigate back to home page	
		
		}
	    @Test (priority = 4)
	    public void verifyResult()
	    {
	    	//clicon on SignIn button ->click on residnet login ->Verify Resident portal page display or not compare result 
	    	driver.findElement(By.xpath("//*[@class='button-default outline-dark-button']")).click();
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Resident Portal Login Button']")));
	    	driver.findElement(By.xpath("//*[@title='Resident Portal Login Button']")).click();
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[.='View the App']")));  //Wait untill next element is visible 
	    	softAssert.assertEquals((driver.findElement(By.xpath(".//div[.='View the App']")).getText()).equals("View the App"),true,"Welcome To resident portal page match ");
	    	//use assertion to compare expected with actual result if value not match test run failed 
	    	driver.navigate().to("https://www.entrata.com/"); //Navigate to main page 
	    
	    }
	    
	    @Test (priority=5)
	    public void dyanamicElefind()
	    {
	   // dyanmic Element handle and select 
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='header-nav-item']/div[contains(text(),'Solutions')]")));
	    	driver.findElement(By.xpath(".//div[@class='header-nav-item']/div[contains(text(),'Solutions')]")).click(); //Select solution 
	    	driver.findElement(By.xpath(".//div[@class='header-drop-nav']/a[.='Student']")).click(); //Select Student from dropdown 
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//p[contains(text(),'Student properties')]"))); 
	    	softAssert.assertEquals((driver.findElement(By.xpath(".//p[contains(text(),'Student properties')]")).getText()).contains("Student properties"),true,"Welcome To Student page match "); //Compare result expected vs actual result 
	    }	
	    
	   @AfterTest //this method run after the all mehtod run 
	   public void Endemethod()  
	   {
		   System.out.println("Test completed");
		   
		   driver.quit(); //Quit the open broswer 
	   }
	    
	}
	

	

