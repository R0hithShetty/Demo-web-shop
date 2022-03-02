package automationScript;




	import org.testng.annotations.Test;

	import genericLib.BaseClass;
import pomRepo.TC_JewelryPage_001;
//	import pomRepo.TC_ElectronicsPage_001;
	

	public class TC_001JewelryTest extends BaseClass{
	@Test
		
		public void jewelry() {
			jewelryTab=new TC_JewelryPage_001(driver);
			jewelryTab.getClickOnJewelryTab().click();
			
		
			//Sort by dropdown
			sortby2=new TC_JewelryPage_001(driver);
			sortby2.getClickOnSortByDropdown().click();
			
			//click on one option
			optionZtoA2=new TC_JewelryPage_001(driver);
			optionZtoA2.getClickOnZtoAOption().click();
			           
	        //click on display dropdown
			display2=new TC_JewelryPage_001(driver);
			display2.getClickOnDisplayDropdown().click();
			
			//click on 12 option
			option2=new TC_JewelryPage_001(driver);
			option2.getClickOn12Option().click();
			
			
			//click on view as dropdown
			viewas2=new TC_JewelryPage_001(driver);
			viewas2.getClickOnViewAsDropdown().click();
			
		
		
		   //click on product
			product2=new TC_JewelryPage_001(driver);
			product2.getClickOnProduct().click();
			
			//click on add to cart
			addtocart2=new TC_JewelryPage_001(driver);
			addtocart2.getClickOnAddToCart().click();
			
//			//logout
			logout2=new TC_JewelryPage_001(driver);
			logout2.getClickOnLogout().click();
	}
	}






