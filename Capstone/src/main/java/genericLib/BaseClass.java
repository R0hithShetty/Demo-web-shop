package genericLib;


	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

//	import pomRepo.TC_ApparelAndShoesPage_001;
//	import pomRepo.TC_ComputerPage_001;
//	import pomRepo.TC_ElectronicsPage_001;

	import pomRepo.TC_JewelryPage_001;

	//import pomRepo.TC_HomePage_001;
	//import pomRepo.TC_InvoiceLookUpImagePage_001;
	import pomRepo.TC_LoginPage_001;
	//import pomRepo.TC_RegistrationPage_001;
import pomRepo.TC_RegistrationPage_001;

	/***
	 * 
	 * @author Sindhu
	 *
	 */

	public class BaseClass {
		
		public WebDriver driver;
		public ExcelLib elib=new ExcelLib();
		public WebDriverWait explicitWait;
		public TC_LoginPage_001 loginPage;
//	    public TC_ComputerPage_001 computersTab;
//	    public TC_ComputerPage_001 desktops;
//	    public TC_ComputerPage_001 sortby;
//	    public TC_ComputerPage_001 optionZtoA;
//	    public TC_ComputerPage_001 display;
//	    public TC_ComputerPage_001 option12;
//	    public TC_ComputerPage_001 viewas;
//	    public TC_ComputerPage_001 listoption;
//	    public TC_ComputerPage_001 product;
//	    public TC_ComputerPage_001 addtocart;
//	    public TC_ComputerPage_001 addtocartnotebook;
//	    public TC_ComputerPage_001 addtocartaccessories;
//	    public TC_ComputerPage_001 logout;
	    //////////////////////////////////////////
	    public TC_RegistrationPage_001 registration;
	    public TC_RegistrationPage_001 radiobutton;
	    public TC_RegistrationPage_001 firstname1;
	    public TC_RegistrationPage_001 lastname1;
	    public TC_RegistrationPage_001 email1;
	    public TC_RegistrationPage_001 password1;
	    public TC_RegistrationPage_001 confirmpassword1;
//	    public TC_ComputerPage_001 notebooks;
//	    public TC_ComputerPage_001 accessories;
	    ////////////////////////////////////////
//	    public TC_ElectronicsPage_001 electronicsTab;
//	    public TC_ElectronicsPage_001 camera;
//	    public TC_ElectronicsPage_001 sortby1;
//	    public TC_ElectronicsPage_001 optionZtoA1;
//	    public TC_ElectronicsPage_001 display1;
//	    public TC_ElectronicsPage_001 option121;
//	    public TC_ElectronicsPage_001 viewas1;
//	    public TC_ElectronicsPage_001 listoption1;
//	    public TC_ElectronicsPage_001 product1;
//	    public TC_ElectronicsPage_001 logout1;
//	    public TC_ElectronicsPage_001 cellphones;
//	    public TC_ElectronicsPage_001 addtocart1;
	    //////////////////////////////////////////////////
	    public TC_JewelryPage_001 jewelryTab;
	    public TC_JewelryPage_001  sortby2;
	    public TC_JewelryPage_001 optionZtoA2;
	    public TC_JewelryPage_001  display2;
	    public TC_JewelryPage_001  option2;
	    public TC_JewelryPage_001 viewas2;
	    public TC_JewelryPage_001  listoption2;
	    public TC_JewelryPage_001  product2;
	    public TC_JewelryPage_001 addtocart2;
	    public TC_JewelryPage_001  logout2;
	    //////////////////////////////////////////////
//	    public TC_ApparelAndShoesPage_001  apparelshoeTab;
//	    public TC_ApparelAndShoesPage_001 sortby3;
//	    public TC_ApparelAndShoesPage_001 optionZtoA3;
//	    public TC_ApparelAndShoesPage_001  display3;
//	    public TC_ApparelAndShoesPage_001  option3;
//	    public TC_ApparelAndShoesPage_001 viewas3;
//	    public TC_ApparelAndShoesPage_001  listoption3;
//	    public TC_ApparelAndShoesPage_001  product3;
//	    public TC_ApparelAndShoesPage_001 addtocart3;
//	    public TC_ApparelAndShoesPage_001  logout3;
	    ///////////////////////////////////////////////////
//	    public TC_ApparelAndShoesPage_001 sortby4;
//	    public TC_ApparelAndShoesPage_001 optionZtoA4;
//	    public TC_ApparelAndShoesPage_001  display4;
//	    public TC_ApparelAndShoesPage_001  option4;
//	    public TC_ApparelAndShoesPage_001 viewas4;
//	    public TC_ApparelAndShoesPage_001  listoption4;
//	    public TC_ApparelAndShoesPage_001  product4;
//	    public TC_ApparelAndShoesPage_001 addtocart4;
//	    public TC_ApparelAndShoesPage_001  logout4;
	   
	   
	    
	    String firstname=ExcelLib.readStringData("Sheet1", 1, 0);
		String lastname=ExcelLib.readStringData("Sheet1", 1, 1);
		String email=ExcelLib.readStringData("Sheet1", 1, 2);
		String password=ExcelLib.readStringData("Sheet1", 1, 3);
		String confirmpassword=ExcelLib.readStringData("Sheet1", 1, 4);

		@Parameters("browserName")
		@BeforeClass(alwaysRun=true)
		public void beforeClass(@Optional("chrome") String bName) {
			if(bName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
				driver=new ChromeDriver();
			}else if(bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
				driver=new FirefoxDriver();
			}else {
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
				driver=new ChromeDriver();
			}
			Reporter.log("Browser is launched Successfully",true);
			driver.manage().window().maximize();
			Reporter.log("Browser is maximized Successfully",true);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			explicitWait=new WebDriverWait(driver,10);
		}
		@BeforeMethod(alwaysRun=true)
		public void beforeMethod() throws InterruptedException {
			//URL
			driver.get(elib.readStringData("Sheet1",0,0));
		//    String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1", 1, 0);

		//	Assert.assertEquals(driver.getTitle(),expectedLoginPageTitle,"Login Page is not displayed successfully");
			Reporter.log("Login Page  displayed successfully",true);
			

			 
				registration=new TC_RegistrationPage_001(driver);
				registration.getClickOnRegistration().click();
				
				//radiobutton
				radiobutton=new TC_RegistrationPage_001(driver);
				radiobutton.getClickOnRadiobutton().click();
				
				firstname1=new TC_RegistrationPage_001(driver);
				firstname1.firstName(firstname);
				
				lastname1=new TC_RegistrationPage_001(driver);
				lastname1.lastName(lastname);
				
				email1=new TC_RegistrationPage_001(driver);
				email1.email(email);
				
				password1=new TC_RegistrationPage_001(driver);
				password1.password(password);
				
				confirmpassword1=new TC_RegistrationPage_001(driver);
				confirmpassword1.confirmPassword(confirmpassword);
				
				

			loginPage=new TC_LoginPage_001(driver);
			loginPage.getClickOnLoginLink().click();
			loginPage.loginToApp(elib.readStringData("Sheet1",0,1),elib.readStringData("Sheet1",0,2));
		//	String expectedHomePageTitle=ExcelLib.readStringData("Sheet1", 1, 1);
		    Reporter.log("Successfully logged in to the application",true);
		    Thread.sleep(2000);
		}
			
			@AfterMethod(alwaysRun=true)
			public void afterMethod() {
			//explicitWait.until(ExpectedConditions.elementToBeClickable(logout. getClickOnLogout()));
//				JavascriptExecutor js=(JavascriptExecutor) driver;
//				Thread.sleep(2000);
//				js.executeScript("window.scrollBy(0,-500);"); 
//				logout.getClickOnLogout().click();
			//	 String expectedLoginPageTitle=ExcelLib.readStringData("Sheet1", 1, 0);
			//	if(driver.getTitle().equals(expectedLoginPageTitle)) {
			//		Reporter.log("Successfully logged out of application",true);
			//	}else {
			//		Reporter.log("Logout was failed",true);
			//	}
				
				
		}
			@AfterClass(alwaysRun=true)
			public void afterClass() {
				driver.quit();
				Reporter.log("Successfully closed the browser",true);
		}
					
			
		
	}



