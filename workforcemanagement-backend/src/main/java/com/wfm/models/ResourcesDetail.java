package com.wfm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RESOURCE_DETAILS")
public class ResourcesDetail {

	@Id
	@SequenceGenerator(initialValue=420, allocationSize=1, name = "rId_seq",sequenceName="rId_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="rId_seq")
	@Column(name="RESOURCE_ID")
	private Integer rId;
	
	@Column(name="RESOURCE_NAME")
	private String rName;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_ROLE_ID")
	private ResourcesRoles Role;
	
	@Column(name="RESOURCE_ROLE_ID",insertable=false,updatable=false)
	private int roleId;
	
	
	
	@Column(name="RESOURCE_EXPERIENCE")
	private Integer rExperience;
	
	@Column(name="RESOURCE_PASSWORD")
	private	String rPassward;
	
	@Column(name="RESOURCE_EMAIL")
	private String rEmail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_DOB")
	private Date rDOB;
	
	@Column(name="RESOURCE_GENDER")
	private String rGender;
	
	@Column(name="RESOURCE_MARITAL_STATUS")
	private String rMaritalStatus;
	
	@Column(name="RESOURCE_PHONE_NUMBER")
	private long rPhoneNumber;
	
	@Column(name="RESOURCE_SKILLS")
	private String rSkills;
	
	@Column(name="RESOURCE_STATUS")
	private String rStatus;
	
	
	
	@OneToOne
	@JoinColumn(name="RESOURCE_PROJECT_ID")
	private Projects Project;
	

	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_START_DATE")
	private Date rProStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_END_DATE")
	private Date rProEndDate;

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public ResourcesRoles getRole() {
		return Role;
	}

	public void setRole(ResourcesRoles role) {
		Role = role;
	}

	

	public Integer getrExperience() {
		return rExperience;
	}

	public void setrExperience(Integer rExperience) {
		this.rExperience = rExperience;
	}

	public String getrPassward() {
		return rPassward;
	}

	public void setrPassward(String rPassward) {
		this.rPassward = rPassward;
	}

	public String getrEmail() {
		return rEmail;
	}

	public void setrEmail(String rEmail) {
		this.rEmail = rEmail;
	}

	public Date getrDOB() {
		return rDOB;
	}

	public void setrDOB(Date rDOB) {
		this.rDOB = rDOB;
	}

	public String getrGender() {
		return rGender;
	}

	public void setrGender(String rGender) {
		this.rGender = rGender;
	}

	public String getrMaritalStatus() {
		return rMaritalStatus;
	}

	public void setrMaritalStatus(String rMaritalStatus) {
		this.rMaritalStatus = rMaritalStatus;
	}

	public long getrPhoneNumber() {
		return rPhoneNumber;
	}

	public void setrPhoneNumber(long rPhoneNumber) {
		this.rPhoneNumber = rPhoneNumber;
	}

	public String getrSkills() {
		return rSkills;
	}

	public void setrSkills(String rSkills) {
		this.rSkills = rSkills;
	}

	public String getrStatus() {
		return rStatus;
	}

	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}

	public Projects getProject() {
		return Project;
	}

	public void setProject(Projects project) {
		Project = project;
	}

	

	public Date getrProStartDate() {
		return rProStartDate;
	}

	public void setrProStartDate(Date rProStartDate) {
		this.rProStartDate = rProStartDate;
	}

	public Date getrProEndDate() {
		return rProEndDate;
	}

	public void setrProEndDate(Date rProEndDate) {
		this.rProEndDate = rProEndDate;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "ResourcesDetail [rId=" + rId + ", rName=" + rName + ", Role=" + Role + ", roleId=" + roleId
				+ ", rExperience=" + rExperience + ", rPassward=" + rPassward + ", rEmail=" + rEmail + ", rDOB=" + rDOB
				+ ", rGender=" + rGender + ", rMaritalStatus=" + rMaritalStatus + ", rPhoneNumber=" + rPhoneNumber
				+ ", rSkills=" + rSkills + ", rStatus=" + rStatus + ", Project=" + Project + ", rProStartDate="
				+ rProStartDate + ", rProEndDate=" + rProEndDate + "]";
	}

	}