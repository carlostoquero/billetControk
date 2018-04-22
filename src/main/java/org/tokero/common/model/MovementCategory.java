package org.tokero.common.model;

public class MovementCategory {
	private int id;
	private String operation;
	private String description;
	
	public int getId() {
		return id;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
