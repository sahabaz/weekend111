package generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConst
{
	public static String readData(String sheet , int n , int m) throws EncryptedDocumentException, IOException
	{
		Workbook wb = WorkbookFactory.create(new File(PATH));
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(n);
		Cell c = r.getCell(m);
		String s = c.toString();
		return s;
	}
}
