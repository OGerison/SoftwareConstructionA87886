package com.example.financesystem.payload;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ExpensePayLoad {
	
	private Long id;
	
	@NotNull
	@NotBlank
	private String expense;
    private Double amount;
    private Date datereceived;
    private String description;

	public ExpensePayLoad() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDatereceived() {
		return datereceived;
	}
	public void setDatereceived(Date datereceived) {
		this.datereceived = datereceived;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
