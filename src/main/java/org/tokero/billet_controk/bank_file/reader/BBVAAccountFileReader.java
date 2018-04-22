package org.tokero.billet_controk.bank_file.reader;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.tokero.common.model.BankingMovement;

public class BBVAAccountFileReader implements IBankFileReader{
	private static final int HEADER_ROWS = 5;

	public List<BankingMovement> readFile(String filePath) {
		List<BankingMovement> movements = null;
		try {
			HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(filePath));
			HSSFSheet sheet=wb.getSheetAt(0);
			int rows = sheet.getPhysicalNumberOfRows();
			HSSFRow row; 

		    for(int r = 0; r < rows - HEADER_ROWS; r++) {
		        row = sheet.getRow(r + HEADER_ROWS);
		        if(row != null) {
		        	
		        }
		    }
		} catch (Exception ex) {
			
		}
		return movements;
	}

}
