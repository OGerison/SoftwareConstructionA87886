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
public class Income extends UserDateAudit {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false)
	private User user;
    private String income;
    private Double amount;
    private Date datereceived;
    private String description;
	public Income(Long id, String income, Double amount, Date datereceived, String description) {
		super();
		this.id = id;
		this.income = income;
		this.amount = amount;
		this.datereceived = datereceived;
		this.description = description;
	}
	public Income() {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    
    
    
    }
