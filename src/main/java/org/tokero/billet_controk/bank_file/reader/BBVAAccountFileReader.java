package org.tokero.billet_controk.bank_file.reader;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.tokero.common.model.BankingMovement;

public class BBVAAccountFileReader implements IBankFileReader{
	private static final int HEADER_ROWS = 5;

	public List<BankingMovement> readFile(String filePath) {
		List<BankingMovement> movements = null;
		try {
			XSSFWorkbook  wb = new XSSFWorkbook(new FileInputStream(filePath));
			XSSFSheet sheet = wb.getSheetAt(0);
			XSSFRow row; 
			int rows = sheet.getPhysicalNumberOfRows();

		    for(int r = 0; r < rows - HEADER_ROWS; r++) {
		        row = sheet.getRow(r + HEADER_ROWS);
		        if(row != null) {
		        	String rowDate = row.getCell(1).getStringCellValue();
		        	System.out.println("Row " + r + ": Date " + rowDate);
		        }
		    }
		} catch (Exception ex) {
			System.out.println("Hostiazo como un campano");
		}
		return movements;
	}

}
