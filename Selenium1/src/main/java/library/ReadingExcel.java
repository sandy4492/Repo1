package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ReadingExcel(String excelpath) {

		try {
			File src = new File(excelpath);

			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public String getData(int rownum, int coloumn, int sheetnum) {

		sheet = wb.getSheetAt(sheetnum);

		String data = sheet.getRow(rownum).getCell(coloumn).getStringCellValue();

		return data;

	}

	public int getrowcount(int sheetindex) {

		int rownum = wb.getSheetAt(sheetindex).getLastRowNum();

		return rownum;

	}
}
