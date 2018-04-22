/**
 * 
 */
package org.tokero.common.model;

public class MovementContext {
	private int id;
	private String operation;
	private String description;
	// Grouping context into ACCOUNT / CARD to have a distribution of movements.
	private String group;
	
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
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
