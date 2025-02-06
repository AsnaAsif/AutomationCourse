package seleniumBasics;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String url = driver.getCurrentUrl();
		System.out.println(url);// for url show in console(sysout control space)

		String title = driver.getTitle();// to get tittle in console
		System.out.println(title);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);// to get handle id means unique id for each webpage.
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);//to get code of webpage.

	}

	public static void main(String[] args) {

		BrowserCommands browser = new BrowserCommands();
		browser.initiatiseBrower();
		browser.browserCommands();
		browser.driverCloseAndQuit();

	}

}
