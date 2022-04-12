import java.util.ArrayList;


public class CheckXPath {

	public static void main(String[] args) {

		// div/select/option[@value='Jammu&Kashmir']
		// TODO Auto-generated method stub
		// div/select/option[@value='Jammu&Kashmir']
		ArrayList<String> stateList = new ArrayList<String>();
		stateList.add("Andhra Pradesh");
		stateList.add("Telangana");
		
		ArrayList<String>  cities = new ArrayList<String>();
		cities.add("Kurnool");
		cities.add("Vijayawada");
		
		int statesSize = stateList.size();


		for (int j = 0; j < statesSize; j++) {
			
			/*System.out.println(stateList.get(j));

			String xpathValue = "//div/select/option[@value=" + "'" + stateList.get(i) + "'" + "]";
			System.out.println(xpathValue);
			String xpathValue1="//div/select/option[@value=" + "'" + cities.get(j) + "'" + "]";
			System.out.println(xpathValue1); */
			
			String stateName = cities.get(j);
			
			/*String clickOnSelection = "//span/ul/li[text()=" + "'" + stateName + "'" + "]";
			
			System.out.println(clickOnSelection); */
			
			String cityName = cities.get(j);
			
			String cityXPath = "//span/ul/li[text()=" + "'" + cityName + "'" + "]";
			
			System.out.println(cityXPath);
			
		}

	}
}
