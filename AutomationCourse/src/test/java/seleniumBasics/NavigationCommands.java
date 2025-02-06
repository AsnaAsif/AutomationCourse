package seleniumBasics;

public class NavigationCommands extends Base {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//eg obsquare site to amazone
		driver.navigate().back();//eg amazone to obsqura site
		driver.navigate().forward();//eg obsquare site to amazone site
		driver.navigate().refresh();//to refresh the page
	}

	public static void main(String[] args) {
		NavigationCommands navigation=new NavigationCommands();
		
		navigation.initiatiseBrower();
		navigation.navigationCommands();
		navigation.driverCloseAndQuit();
		

	}

}
