package com.springbootapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_candidateinfo")
public class TblCandidateinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String cnuid;
	private String companyuid;
	private String fname;
	private String lname;
	private String gender;
	private String mobile;
	private String countrycode;
	private String mobilecountry;
	private String email;
	private String address;
	private int country;
	private int state;
	private int city;
	private String zipcode;
	private String qualification;
	private String designation;
	private String currentcompany;
	private String exp;
	private String currentexp;
	private String totaljob;
	private String profileimg;
	private String resume;
	private String about;
	private String status;
	private String linkedin;
	private String createdcompany;
	private String createdby;
	private String notesrecruiter;
	private String noteshm;
	private Date updatedate;
	private Date insertdate;
	private String authorizedwork;
	private String availabletime;
	private String function;
	private String lookingjobtype;
	private String skill;
	private String source;
	private String visastatus;
	private String otherurl;
	private String statuschangeby;
	
	public TblCandidateinfo() {
	}

	public TblCandidateinfo(String cnuid, String companyuid, String fname, String lname, String gender, String mobile,
			String countrycode, String mobilecountry, String email, String address, int country, int state, int city,
			String zipcode, String qualification, String designation, String currentcompany, String exp,
			String currentexp, String totaljob, String profileimg, String resume, String about, String status,
			String linkedin, String createdcompany, String createdby, String notesrecruiter, String noteshm,
			Date updatedate, Date insertdate, String authorizedwork, String availabletime, String function,
			String lookingjobtype, String skill, String source, String visastatus, String otherurl,
			String statuschangeby) {
		super();
		this.cnuid = cnuid;
		this.companyuid = companyuid;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.mobile = mobile;
		this.countrycode = countrycode;
		this.mobilecountry = mobilecountry;
		this.email = email;
		this.address = address;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.qualification = qualification;
		this.designation = designation;
		this.currentcompany = currentcompany;
		this.exp = exp;
		this.currentexp = currentexp;
		this.totaljob = totaljob;
		this.profileimg = profileimg;
		this.resume = resume;
		this.about = about;
		this.status = status;
		this.linkedin = linkedin;
		this.createdcompany = createdcompany;
		this.createdby = createdby;
		this.notesrecruiter = notesrecruiter;
		this.noteshm = noteshm;
		this.updatedate = updatedate;
		this.insertdate = insertdate;
		this.authorizedwork = authorizedwork;
		this.availabletime = availabletime;
		this.function = function;
		this.lookingjobtype = lookingjobtype;
		this.skill = skill;
		this.source = source;
		this.visastatus = visastatus;
		this.otherurl = otherurl;
		this.statuschangeby = statuschangeby;
	}

	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getCnuid() {
		return cnuid;
	}

	public void setCnuid(String cnuid) {
		this.cnuid = cnuid;
	}

	public String getCompanyuid() {
		return companyuid;
	}

	public void setCompanyuid(String companyuid) {
		this.companyuid = companyuid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getMobilecountry() {
		return mobilecountry;
	}

	public void setMobilecountry(String mobilecountry) {
		this.mobilecountry = mobilecountry;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCurrentcompany() {
		return currentcompany;
	}

	public void setCurrentcompany(String currentcompany) {
		this.currentcompany = currentcompany;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getCurrentexp() {
		return currentexp;
	}

	public void setCurrentexp(String currentexp) {
		this.currentexp = currentexp;
	}

	public String getTotaljob() {
		return totaljob;
	}

	public void setTotaljob(String totaljob) {
		this.totaljob = totaljob;
	}

	public String getProfileimg() {
		return profileimg;
	}

	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getCreatedcompany() {
		return createdcompany;
	}

	public void setCreatedcompany(String createdcompany) {
		this.createdcompany = createdcompany;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getNotesrecruiter() {
		return notesrecruiter;
	}

	public void setNotesrecruiter(String notesrecruiter) {
		this.notesrecruiter = notesrecruiter;
	}

	public String getNoteshm() {
		return noteshm;
	}

	public void setNoteshm(String noteshm) {
		this.noteshm = noteshm;
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

	public String getAuthorizedwork() {
		return authorizedwork;
	}

	public void setAuthorizedwork(String authorizedwork) {
		this.authorizedwork = authorizedwork;
	}

	public String getAvailabletime() {
		return availabletime;
	}

	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getLookingjobtype() {
		return lookingjobtype;
	}

	public void setLookingjobtype(String lookingjobtype) {
		this.lookingjobtype = lookingjobtype;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getVisastatus() {
		return visastatus;
	}

	public void setVisastatus(String visastatus) {
		this.visastatus = visastatus;
	}

	public String getOtherurl() {
		return otherurl;
	}

	public void setOtherurl(String otherurl) {
		this.otherurl = otherurl;
	}

	public String getStatuschangeby() {
		return statuschangeby;
	}

	public void setStatuschangeby(String statuschangeby) {
		this.statuschangeby = statuschangeby;
	}
	
}
