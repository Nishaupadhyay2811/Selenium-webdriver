package TestNgDataProvider;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class dataprovider{
		
	

		@DataProvider
		public Object[][] getData()
		{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];

		// 1st row
		data[0][0] ="deepakUSER";
		data[0][1] = "deepakPASS";

		// 2nd row
		data[1][0] ="shrutiUSER";
		data[1][1] = "shrutiPASS";
		
		// 3rd row
		data[2][0] ="ektaUSER";
		data[2][1] = "ektaPASS";

		return data;
		}
		
		
		
		@Test(dataProvider="getData")
		public void setData(String username, String password)
		{
			System.out.println("you have provided username as::"+username);
			System.out.println("you have provided password as::"+password);
		}
	}
	
