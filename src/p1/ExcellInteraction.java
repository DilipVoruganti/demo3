package p1;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class ExcellInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		/*ArrayList<String> x=readFromExcel( "E:\\Selenium\\Project\\Project\\Resources\\Test_data.xls","Sheet2",1,1);
		for(int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i));
		}
		*/	}
			
			
			
			public static ArrayList<String>  readFromExcel(String filePath,String sheetName) 
			{
				String sdata;
				ArrayList<String> aList=new ArrayList<String>();
				try {

					File src=new File(filePath);
					FileInputStream fis=new FileInputStream(src);
					HSSFWorkbook wb=new HSSFWorkbook(fis);
					HSSFSheet sh1= wb.getSheet(sheetName);
					int iCol=0;
					int noOfColumn=sh1.getRow(0).getPhysicalNumberOfCells();
					for(int i=0;i<noOfColumn;i++)
					{
						 sdata=sh1.getRow(0).getCell(i).getStringCellValue();
						 aList.add(sdata);
					}
					
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
					sdata=null;
				}
				return aList;
			}



	}



