package org.tokero.billet_controk.bank_file.reader;

import java.util.List;

import org.tokero.common.model.BankingMovement;

public interface IBankFileReader {
	public List<BankingMovement> readFile(String filePath);
}
