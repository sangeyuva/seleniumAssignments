package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataFromExcel {
	

	public static String[][] readExcelData(String filename , String sheetname) throws IOException
	{
		//open the workbook using file path
		XSSFWorkbook wb = new XSSFWorkbook("./TestData/"+filename+".xlsx");
		XSSFSheet Sheet = wb.getSheet(sheetname);
		XSSFRow row = Sheet.getRow(1);
	//	String stringCellValue = row.getCell(3).getStringCellValue();
	//	System.out.println(stringCellValue);
		int rowCount = Sheet.getLastRowNum();
		int colCount = Sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(colCount);
		XSSFRow row3 = Sheet.getRow(0);
		for (int k = 0; k <colCount; k++) {
			String ColNames = row3.getCell(k).getStringCellValue();
		//	System.out.print(ColNames + "       ");	
		}
		String[][] data = new String[rowCount][colCount];
	for (int i = 1; i <= rowCount; i++) {
		System.out.println();
		XSSFRow row2 = Sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			String s1 = row2.getCell(j).getStringCellValue();
		//System.out.print(s1+ "       ");
		data[i-1][j]=s1;
					
		}
		
	}
	
	wb.close();
	return data;
	
	}
	}
	
	
	
		
	
		
	
	
