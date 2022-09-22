package OptiAM_Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {
	 
	public String Url;
	public String UserName;
	public String Password;
	 public String CaseNumber;
	 
	
	  
	public static void main(String[] args) throws IOException {
		
	
		File src  = new File("C:\\Users\\Sony\\eclipse-workspace\\Optiam\\OptiAM\\Info_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
	   XSSFSheet sheet = xsf.getSheetAt(0);
	String Url = sheet.getRow(1).getCell(1).getStringCellValue();
	String UserName = sheet.getRow(2).getCell(1).getStringCellValue();
	String Password = sheet.getRow(3).getCell(1).getStringCellValue();
	String CaseNumber = sheet.getRow(4).getCell(1).getStringCellValue();

	   xsf.close();
	   System.out.println(Url);
	   System.out.println(UserName);
	   System.out.println(Password);
	   System.out.println(CaseNumber);

	}
		
	}

