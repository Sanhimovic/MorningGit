package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_excel 
{
	public static String get_Data(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String value="";
		FileInputStream fis=new FileInputStream("./excel/hybrid.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
		value=c.getStringCellValue();
		return value;
	}
}
