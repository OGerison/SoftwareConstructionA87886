package com.example.financesystem.payload;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class IncomePayLoad {
	
	private Long id;
	
	@NotNull
	@NotBlank
	private String income;
    private Double amount;
    private Date datereceived;
    private String description;

	public IncomePayLoad() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
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
