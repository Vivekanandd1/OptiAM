package OptiAM_Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReader {
	
	
	public static void FileReader() throws IOException {
		File src  = new File("C:\\VivekDD\\OptiAM\\Info_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
	   XSSFSheet sheet = xsf.getSheetAt(0);
	   String Url = sheet.getRow(1).getCell(1).getStringCellValue();
	   String UserName = sheet.getRow(2).getCell(1).getStringCellValue();
	   String Password = sheet.getRow(3).getCell(1).getStringCellValue();
	   String CaseNumber = sheet.getRow(3).getCell(1).getStringCellValue();
	   System.out.println(CaseNumber);
	   xsf.close();
	}
	
		
	}

