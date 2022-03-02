package automationScript;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.TC_JewelryPage_001;

public class TC_ChangetheviewTest extends BaseClass{
	@Test
	
	public void jewelry() {
		jewelryTab=new TC_JewelryPage_001(driver);
		jewelryTab.getClickOnJewelryTab().click();
		
//		
	
		
		//click on one option
		optionZtoA2=new TC_JewelryPage_001(driver);
		optionZtoA2.getClickOnZtoAOption().click();
		           
        
		
		
		//click on view as dropdown
		viewas2=new TC_JewelryPage_001(driver);
		viewas2.getClickOnViewAsDropdown().click();
		
		//click on list option
		listoption2=new TC_JewelryPage_001(driver);
		listoption2.getClickOnListOption().click();
	
	   //click on product
		product2=new TC_JewelryPage_001(driver);
		product2.getClickOnProduct().click();
		
		//click on add to cart
		addtocart2=new TC_JewelryPage_001(driver);
		addtocart2.getClickOnAddToCart().click();
		
//		//logout
		logout2=new TC_JewelryPage_001(driver);
		logout2.getClickOnLogout().click();
}
}









