package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DP {

	
	public static String[][] getData() throws IOException{
		
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rc = sheet.getLastRowNum();
		int cc = sheet.getRow(0).getLastCellNum();
		
		for(int i=1; i<=rc; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<cc; j++) {
				
				CellType cell = row.getCell(j).getCellType();
				if(cell==cell.STRING) {
					
				}
				
			}
			
		}
		
		return null;
	}
	
	
}
