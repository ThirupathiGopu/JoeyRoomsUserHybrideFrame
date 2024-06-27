package com.joeyrooms.utilies;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PropertyReader {
	public static double getdata(String filename, int row, int colu) throws Exception {
		String filepath = ".//TestData//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		return sheet.getRow(row).getCell(colu).getNumericCellValue();
	}

	// Integer data convert to String method
	public static List<String> getdataa(String filename, int row) throws Exception {
		String filepat = ".//TestData//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepat);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		XSSFRow rows = sheet.getRow(row);
		// XSSFCell cell=rows.getCell(colu);
		int cellscount = sheet.getRow(row).getLastCellNum();
		DataFormatter format = new DataFormatter();
		List<String> rowdata = new ArrayList<String>();
		for (int i = 0; i < cellscount; i++) {
			String data = format.formatCellValue(sheet.getRow(row).getCell(i));
			rowdata.add(data);
		}
		return rowdata;
	}

	public static List<String> getData(String filename, int row) throws Exception {
		String filepath = ".//TestData//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int cellscount = sheet.getRow(row).getLastCellNum();
		List<String> rowdata = new ArrayList<String>();
		for (int i = 0; i < cellscount; i++) 
		{
			String data = sheet.getRow(row).getCell(i).getStringCellValue();
			rowdata.add(data);
			
		}
		return rowdata;
	}

	public static String[][] getdata(String filename) throws Exception
	{
		String filepath=".//TestData//"+filename+".xlsx";
		FileInputStream instream=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(instream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows= sheet.getLastRowNum();
		System.out.println("rows="+rows);

		DataFormatter format = new DataFormatter();
		int cellscount=sheet.getRow(rows).getLastCellNum(); 
		 String info[][]=new String[rows][cellscount];
		 System.out.println("cellscount="+cellscount);
		int k=0,l=0;
	
		for(int i=1;i<rows;i++)	
		{
			l=0;
			 Row row = sheet.getRow(i+1);
	            for(int j=0;j<=row.getLastCellNum();j++) {
	            	
	            	String data =format.formatCellValue(sheet.getRow(i).getCell(j));
	                
	                info[i][j] = data;
	                row.getCell(j).getStringCellValue();
	            	l++;
//			for(int j=0;j<cellscount;j++)
//			{
//			//int data=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
//				//System.out.print(format.formatCellValue(sheet.getRow(i).getCell(j)) +"||");
//				String data =format.formatCellValue(sheet.getRow(i).getCell(j));
//                 info[k][l]= data;
//			
			}
			k++;
		}
		return info;
	}


	public static String[][] getdataa(String filename) throws Exception 
	{
		String filepath = ".//TestData//" + filename + ".xlsx";
		FileInputStream instream = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(instream);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println("rows=" + rows);
		int cellscount = sheet.getRow(rows).getLastCellNum();
		System.out.println("cellscount=" + cellscount);
		String info[][] = new String[rows][cellscount];
		DataFormatter format = new DataFormatter();
		int k = 0, l = 0;
		for (int i = 1; i <=rows; i++) 
		{
			l = 0;
			for (int j = 0; j <cellscount; j++) 
			{
				String data =format.formatCellValue(sheet.getRow(i).getCell(j));
				info[k][l] = data;
				l++;
			}
			k++;
		}
		return info;
	}
	public static String getLocater(String filename, String key) throws Exception
	{
		String filepath = ".//Locators//" + filename + ".properties";
		FileInputStream instream = new FileInputStream(filepath);
		Properties pro = new Properties();
		pro.load(instream);
		return pro.getProperty(key);
	}

}
