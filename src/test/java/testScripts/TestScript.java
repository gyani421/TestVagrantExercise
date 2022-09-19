package testScripts;

import java.io.FileNotFoundException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import response.ResponseValidatorPage;

public class TestScript {
	
	public static Logger logger= LoggerFactory.getLogger(TestScript.class);
	
	@Test(description="To validate the RCB team has only 4 foreign players")
	public void verifyForeignPlayersCount() throws Exception {
		ResponseValidatorPage responseValidatorPage= new ResponseValidatorPage();
		List<String> list1= responseValidatorPage.getForeignPlayersList();
		System.out.println("Foreign Players List: "+list1);
		Assert.assertTrue(list1.size()==4, "Count of foreign players is not exactly 4");
		System.out.println("Team has exactly 4 foreign players");
		logger.info("Team has only 4 foreign players");
		
	}
	
	@Test(description="To validate the team has at least 1 wicket keeper")
	public void verifyWicketKeepersCount() throws Exception {
		ResponseValidatorPage responseValidatorPage= new ResponseValidatorPage();
		List<String> list2= responseValidatorPage.getWicketKeepersList();
		System.out.println("Wicket Keepers List: "+list2);
		Assert.assertTrue(list2.size()>=1, "Count of Wicket Keepers is not atleast 1");
		System.out.println("Team has at least 1 wicket keeper");
		logger.info("RCB Team has at least 1 wicket keeper");
	}
}
