package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import library.ReadingExcel;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {

		ReadingExcel excel = new ReadingExcel("D:\\Selenium\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(1, 1, 0));

	}
}