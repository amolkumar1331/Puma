package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWrite {

	public static Workbook wb;
	public static FileInputStream fp;
	public static FileOutputStream fo;
	public static Sheet sh;
	static Object[][] obj;

	/*
	 * public static Row rw; public static Cell cel;
	 */
	public ExcelReadandWrite(String sheetname) throws IOException {

		fp = new FileInputStream("F:\\Workspace\\amol_workspace\\com.puma\\src\\main\\resources\\TestData.xlsx");

		wb = new XSSFWorkbook(fp);

		sh = wb.getSheet(sheetname);

	}

	public void totalRows(String sheetname) {

		int totalrows = sh.getLastRowNum();

	}

	public void totalCell() {

		// int cell = rw.getLastCellNum();
	}

	public static Object[][] readData() {

		int totalrow = sh.getLastRowNum();
		System.out.println(totalrow);

		Row firstrow = sh.getRow(1);

		int totalcell = firstrow.getLastCellNum();
		System.out.println(totalcell);

		obj = new Object[totalrow][totalcell];

		for (int i = 1; i <= totalrow; i++) {
			for (int j = 0; j < totalcell; j++) {

				obj[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}

		}
		return obj;
	}

	public static void writedata() throws IOException {

		Row rw = sh.getRow(1);
		fo = new FileOutputStream(
				"F:\\\\Workspace\\\\amol_workspace\\\\com.puma\\\\src\\\\main\\\\resources\\\\TestData.xlsx");
		rw.createCell(2).setCellValue("Pass");
		wb.write(fo);
	}
}
