package com.oneDayCart.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getCommonKeyValue(String key) {
		Properties prop = null;
		try {
			FileInputStream file=new FileInputStream("./src/test/java/commonData/commonData.properties");
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public Object[][] readAllDataFromExcel(String sheetName){
		Object[][] data=null;
		try {
			
			FileInputStream fil=new FileInputStream("./src\\test\\java\\commonData\\Search.xlsx");
			Workbook wb=WorkbookFactory.create(fil);
			Sheet sh=wb.getSheet(sheetName);
			int rowCount=sh.getLastRowNum();
			int cellCount=sh.getRow(0).getLastCellNum();
			data=new Object[rowCount][cellCount];
			for(int i=0;i<rowCount;i++)
			{
				for(int j=0;j<cellCount;j++)
				{
					data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
		
	}
}
