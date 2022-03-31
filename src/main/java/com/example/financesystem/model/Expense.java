package com.example.financesystem.model;

import com.example.financesystem.model.audit.UserDateAudit;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import java.util.Date;


@Entity
public class Expense extends UserDateAudit {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
    private String expense;
    private Double amount;
    private Date datereceived;
    private String description;
	public Expense(Long id, String expense, Double amount, Date datereceived, String description) {
		super();
		this.id = id;
		this.expense = expense;
		this.amount = amount;
		this.datereceived = datereceived;
		this.description = description;
	}
	public Expense() {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
    
    }
