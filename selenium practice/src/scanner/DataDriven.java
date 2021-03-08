package scanner;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDriven 
{

	public static void main(String[] args) throws Exception 
	{
	
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
          Workbook wb= WorkbookFactory.create(fis);
          Sheet sh=wb.getSheet("sheet1");
          Row r=sh.createRow(0);
           Cell c=r.createCell(5);
          c.setCellValue("manager");
        //permission
       FileOutputStream fos=new FileOutputStream("./Excel/Book1.xlsx");
        wb.write(fos);
        
         
	}

}
