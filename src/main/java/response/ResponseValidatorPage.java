package response;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResponseValidatorPage {

	static String response="{\r\n"
			+ "  \"name\": \"Royal Challengers Bangalore\",\r\n"
			+ "  \"location\": \"Bangalore\",\r\n"
			+ "  \"player\": [\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Faf Du Plessis\",\r\n"
			+ "      \"country\": \"South Africa\",\r\n"
			+ "      \"role\": \"Batsman\",\r\n"
			+ "      \"price-in-crores\": \"7\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Virat Kohli\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Batsman\",\r\n"
			+ "      \"price-in-crores\": \"15\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Glenn Maxwell\",\r\n"
			+ "      \"country\": \"Australia\",\r\n"
			+ "      \"role\": \"Batsman\",\r\n"
			+ "      \"price-in-crores\": \"11\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Mohammad Siraj\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Bowler\",\r\n"
			+ "      \"price-in-crores\": \"7\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Harshal Patel\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Bowler\",\r\n"
			+ "      \"price-in-crores\": \"10.75\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Wanindu Hasaranga\",\r\n"
			+ "      \"country\": \"Srilanka\",\r\n"
			+ "      \"role\": \"Bowler\",\r\n"
			+ "      \"price-in-crores\": \"10.75\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Dinesh Karthik\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Wicket-keeper\",\r\n"
			+ "      \"price-in-crores\": \"5.5\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Shahbaz Ahmed\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"All-Rounder\",\r\n"
			+ "      \"price-in-crores\": \"2.4\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Rajat Patidar\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Batsman\",\r\n"
			+ "      \"price-in-crores\": \"0.20\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Josh Hazlewood\",\r\n"
			+ "      \"country\": \"Australia\",\r\n"
			+ "      \"role\": \"Bowler\",\r\n"
			+ "      \"price-in-crores\": \"7.75\"\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"name\": \"Mahipal Lomror\",\r\n"
			+ "      \"country\": \"India\",\r\n"
			+ "      \"role\": \"Bowler\",\r\n"
			+ "      \"price-in-crores\": \"7.75\"\r\n"
			+ "    }\r\n"
			+ "  ]\r\n"
			+ "}";

//	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject(response);
		List<String> ForignCountrylist = new ArrayList<String>();
		List<String> WicketKeeperslist = new ArrayList<String>();

//		String TeamName = jsonObject.getString("name");
//		System.out.println("TeamName: " + TeamName);
		JSONArray jArray = jsonObject.getJSONArray("player");
		
		public List<String> getForeignPlayersList(){
		for (int i = 0; i < jArray.length(); i++) {
			if (!jArray.getJSONObject(i).getString("country").equalsIgnoreCase("India")) {
				ForignCountrylist.add(jArray.getJSONObject(i).getString("country"));
			}
		}
		
		System.out.println(ForignCountrylist);
		return ForignCountrylist;
		}
		
		public List<String> getWicketKeepersList(){
		for (int j = 0; j < jArray.length(); j++) {
			if (jArray.getJSONObject(j).getString("role").equalsIgnoreCase("Wicket-keeper")) {
				WicketKeeperslist.add(jArray.getJSONObject(j).getString("name"));
			}
		}
		
		System.out.println(WicketKeeperslist);
		
		return WicketKeeperslist;
		
		
	}

}