package com.capgemini.merchantstore.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.hibernate.engine.internal.Cascade;

@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int merchantId;
	private boolean isThirdPartyMerchant;
	
	@ManyToMany(mappedBy="merchant", cascade=CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();
	
	private Date addMerchantDate;
	private String password;
	private String email;
	private String phoneNumber;
	private Date removeMerchantDate;
	private String merchantName;
	private String securityQuestion;
	private String securityAnswer;
	private String merchantStatus;
	{
		merchantStatus = "Disapproved";
	}
	
	//@JoinColumn(name="adminId")
	//private Admin admin;
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public boolean isThirdPartyMerchant() {
		return isThirdPartyMerchant;
	}
	public void setThirdPartyMerchant(boolean isThirdPartyMerchant) {
		this.isThirdPartyMerchant = isThirdPartyMerchant;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Date getAddMerchantDate() {
		return addMerchantDate;
	}
	public void setAddMerchantDate(Date addMerchantDate) {
		this.addMerchantDate = addMerchantDate;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getRemoveMerchantDate() {
		return removeMerchantDate;
	}
	public void setRemoveMerchantDate(Date removeMerchantDate) {
		this.removeMerchantDate = removeMerchantDate;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantStatus() {
		return merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	/*public Merchant(int merchantId, boolean isThirdPartyMerchant, List<Product> products, Date addMerchantDate,
			String password, String email, String phoneNumber, Date removeMerchantDate, String merchantName,
			String merchantStatus) {
		super();
		this.merchantId = merchantId;
		this.isThirdPartyMerchant = isThirdPartyMerchant;
		this.products = products;
		this.addMerchantDate = addMerchantDate;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.removeMerchantDate = removeMerchantDate;
		this.merchantName = merchantName;
		this.merchantStatus = merchantStatus;
	}*/
	public Merchant() {
		super();
	}
	/*@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", isThirdPartyMerchant=" + isThirdPartyMerchant + ", products="
				+ products + ", addMerchantDate=" + addMerchantDate + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", removeMerchantDate=" + removeMerchantDate + ", merchantName="
				+ merchantName + ", merchantStatus=" + merchantStatus + "]";
	}*/
	
}
