package org.tokero.common.model;

import java.time.ZonedDateTime;

public class BankingMovement {
	private ZonedDateTime date;
	private String description;
	private String comment;
	private MovementOperation operation;
	private MovementCategory category;
	private MovementContext context;
	private double amount;
	
	public ZonedDateTime getDate() {
		return date;
	}
	public void setDate(ZonedDateTime date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public MovementOperation getOperation() {
		return operation;
	}
	public void setOperation(MovementOperation operation) {
		this.operation = operation;
	}
	public MovementCategory getCategory() {
		return category;
	}
	public void setCategory(MovementCategory category) {
		this.category = category;
	}
	public MovementContext getContext() {
		return context;
	}
	public void setContext(MovementContext context) {
		this.context = context;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
