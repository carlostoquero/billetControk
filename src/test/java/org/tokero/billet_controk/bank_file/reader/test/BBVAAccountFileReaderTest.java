package org.tokero.billet_controk.bank_file.reader.test;

import java.util.List;

import javax.inject.Inject;

import org.tokero.billet_controk.bank_file.reader.BBVAAccountFileReader;
import org.tokero.common.model.BankingMovement;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BBVAAccountFileReaderTest extends TestCase {

	@Inject BBVAAccountFileReader accountFileReader;
	
	public void testReadFile() {
		List<BankingMovement> movements = accountFileReader.readFile("E:\\Desarrollo\\BilletControk\\files\\bbva_account.xlsx");
		Assert.assertNotNull(movements);
	}

}
