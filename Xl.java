package Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xl {

	public int getRow(String path, String sheet) {
		FileInputStream fis;
		int rc = -1;
		try {
			fis = new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			rc = w.getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rc;
	}

	public int getColumn(String path, String sheet) {
		{
			FileInputStream fis;
			int cc = -1;
			try {
				fis = new FileInputStream(path);
				Workbook w = WorkbookFactory.create(fis);
				cc = w.getSheet(sheet).getRow(0).getLastCellNum();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return cc;
		}

	}

	public static String getData(String path, String sheet, int row, int col) {
		String value = "";
		Workbook w;
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			w = WorkbookFactory.create(fis);
			value = w.getSheet(sheet).getRow(row).getCell(col).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
