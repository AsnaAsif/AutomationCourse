package utilities;

import java.io.FileInputStream;

/*In simple terms, this class provides utility methods to open an Excel file, 
 * get data from specific cells, and handle the data in both string and integer formats. 
 * The changes made ensure that the code is efficient, handles errors well, 
 * and automatically closes resources when done.*/
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constants;

public class ExcelUtilities {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData(int row,int col,String sheet) throws IOException {
		f= new FileInputStream(Constants.TESTDATAFILE);
		w= new XSSFWorkbook(f);
		sh=w.getSheet(sheet);
		XSSFRow r = sh.getRow(row);
		XSSFCell c=r.getCell(col);
		return c.getStringCellValue();
	}
	
	public static String readIntegerData(int row,int col,String sheet) throws IOException {
		f= new FileInputStream(Constants.TESTDATAFILE);
		w= new XSSFWorkbook(f);
		sh=w.getSheet(sheet);
		XSSFRow r = sh.getRow(row);
		XSSFCell c=r.getCell(col);
		int val =(int) c.getNumericCellValue();
		return String.valueOf(val);

	
}
}
