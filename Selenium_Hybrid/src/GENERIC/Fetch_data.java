package GENERIC;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data 
{
	public static String get_data(String st,int rw,int cl)
	{
		String val=null;
		try 
		{
			FileInputStream f=new FileInputStream("./Excel/fbdata.xlsx");
			Workbook b = WorkbookFactory.create(f);
			Sheet s = b.getSheet(st);
			Row r = s.getRow(rw);
			Cell c = r.getCell(cl);
			val=c.toString();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return val;
	}
}
