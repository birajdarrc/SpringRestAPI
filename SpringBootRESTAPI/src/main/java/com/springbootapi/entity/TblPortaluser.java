package com.springbootapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//tbl_portaluser
@Entity
@Table(name = "tbl_portaluser")
public class TblPortaluser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String uid;
	private String companyuid;
	private String mobile;
	private String email;
	private String password;
	private String category;
	private String status;
	private String activstatus;
	private String phoneno;
	private Date updatedate;
	private Date insertdate;
	private String regcode;
	private Date regcodedate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCompanyuid() {
		return companyuid;
	}
	public void setCompanyuid(String companyuid) {
		this.companyuid = companyuid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActivstatus() {
		return activstatus;
	}
	public void setActivstatus(String activstatus) {
		this.activstatus = activstatus;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public Date getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}
	public String getRegcode() {
		return regcode;
	}
	public void setRegcode(String regcode) {
		this.regcode = regcode;
	}
	public Date getRegcodedate() {
		return regcodedate;
	}
	public void setRegcodedate(Date regcodedate) {
		this.regcodedate = regcodedate;
	}
	
}
