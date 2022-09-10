package testScripts;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import response.ResponseValidatorPage;

public class TestScript {
	
	
	@Test
	public void verifyForeignPlayersCount() {
		ResponseValidatorPage responseValidatorPage= new ResponseValidatorPage();
		List<String> list1= responseValidatorPage.getForeignPlayersList();
		System.out.println("Foreign Players List: "+list1);
		Assert.assertTrue(list1.size()==4, "Count of foreign players is not exactly 4");
		System.out.println("Team has exactly 4 foreign players");
	}
	
	@Test
	public void verifyWicketKeepersCount() {
		ResponseValidatorPage responseValidatorPage= new ResponseValidatorPage();
		List<String> list2= responseValidatorPage.getWicketKeepersList();
		System.out.println("Wicket Keepers List: "+list2);
		Assert.assertTrue(list2.size()==1, "Count of Wicket Keepers is not exactly 1");
		System.out.println("Team has exactly 1 Wicket Keepers");
	}
}
