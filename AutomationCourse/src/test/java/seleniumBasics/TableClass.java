package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableClass extends Base {
	
	public void tableHandling()
	{
		//table
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMore.click();
		
		//to get entire table
		WebElement tableField=driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(tableField.getText());
		
		//to get particular row data of the table
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[2]"));
		System.out.println(tableRow.getText());
	}
	
	

	public static void main(String[] args) {
	TableClass tableclass=new TableClass();
	tableclass.initiatiseBrower();
	tableclass.tableHandling();
	//tableclass.driverCloseAndQuit();

	}

}
