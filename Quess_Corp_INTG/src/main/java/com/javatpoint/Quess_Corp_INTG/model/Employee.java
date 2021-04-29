package com.javatpoint.Quess_Corp_INTG.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "EmployeeCode")
	private String EmployeeCode;
	@Column(name = "EmployeeID")
	private String EmployeeID;
	@Column(name = "Salutation")
	private String Salutation;
	@Column(name = "EmployeeName")
	private String EmployeeName;
	@Column(name = "FirstName")
	private String FirstName;
	@Column(name = "LastName")
	private String LastName;
	@Column(name = "MiddleName")
	private String MiddleName;
	@Column(name = "FatherName")
	private String FatherName;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Gender")
	private String Gender;
	@Column(name = "Mobile")
	private String Mobile;
	@Column(name = "DateofBirth")
	private String DateofBirth;
	@Column(name = "DateOfJoining")
	private String DateOfJoining;
	@Column(name = "Dateofconfirmation")
	private String Dateofconfirmation;
	@Column(name = "DateOfLeaving")
	private String DateOfLeaving;
	@Column(name = "EmployeeStatus")
	private String EmployeeStatus;
	@Column(name = "Age")
	private String Age;
	@Column(name = "PAN")
	private String PAN;
	@Column(name = "UAN")
	private String UAN;
	@Column(name = "AadhaarNumber")
	private String AadhaarNumber;
	@Column(name = "PFAccountNumber")
	private String PFAccountNumber;
	@Column(name = "ESICAccountNumber")
	private String ESICAccountNumber;
	@Column(name = "ReportingManagerName")
	private String ReportingManagerName;
	@Column(name = "ReportingManagerCode")
	private String ReportingManagerCode;
	@Column(name = "LastModified")
	private String LastModified;
	@Column(name = "CreatedDate")
	private String CreatedDate;
	@Column(name = "EmpFlag")

	private String EmpFlag;
	@Column(name = "DateofResignation")
	private String DateofResignation;
	@Column(name = "ExitDate")
	private String ExitDate;
	@Column(name = "GroupDOJ")
	private String GroupDOJ;
	@Column(name = "ExitTypeName")
	private String ExitTypeName;
	@Column(name = "ExitReason1")
	private String ExitReason1;
	@Column(name = "ExitReason2")
	private String ExitReason2;
	@Column(name = "EmploymentType")
	private String EmploymentType;

	// @Column(name = "EmployeeCode")
//	List<Object> Attributes = new ArrayList<Object>();
//	List<Object> ApproverDetails = new ArrayList<Object>();
	// private String ClaimApproverDetails;

	// Getter Methods

	public String getEmployeeCode() {
		return EmployeeCode;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public String getSalutation() {
		return Salutation;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public String getFatherName() {
		return FatherName;
	}

	public String getEmail() {
		return Email;
	}

	public String getGender() {
		return Gender;
	}

	public String getMobile() {
		return Mobile;
	}

	public String getDateofBirth() {
		return DateofBirth;
	}

	public String getDateOfJoining() {
		return DateOfJoining;
	}

	public String getDateofconfirmation() {
		return Dateofconfirmation;
	}

	public String getDateOfLeaving() {
		return DateOfLeaving;
	}

	public String getEmployeeStatus() {
		return EmployeeStatus;
	}

	public String getAge() {
		return Age;
	}

	public String getPAN() {
		return PAN;
	}

	public String getUAN() {
		return UAN;
	}

	public String getAadhaarNumber() {
		return AadhaarNumber;
	}

	public String getPFAccountNumber() {
		return PFAccountNumber;
	}

	public String getESICAccountNumber() {
		return ESICAccountNumber;
	}

	public String getReportingManagerName() {
		return ReportingManagerName;
	}

	public String getReportingManagerCode() {
		return ReportingManagerCode;
	}

	public String getLastModified() {
		return LastModified;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public String getEmpFlag() {
		return EmpFlag;
	}

	public String getDateofResignation() {
		return DateofResignation;
	}

	public String getExitDate() {
		return ExitDate;
	}

	public String getGroupDOJ() {
		return GroupDOJ;
	}

	public String getExitTypeName() {
		return ExitTypeName;
	}

	public String getExitReason1() {
		return ExitReason1;
	}

	public String getExitReason2() {
		return ExitReason2;
	}

	public String getEmploymentType() {
		return EmploymentType;
	}

	// Setter Methods

	public void setEmployeeCode(String EmployeeCode) {
		this.EmployeeCode = EmployeeCode;
	}

	public void setEmployeeID(String EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	public void setSalutation(String Salutation) {
		this.Salutation = Salutation;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public void setFatherName(String FatherName) {
		this.FatherName = FatherName;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public void setMobile(String Mobile) {
		this.Mobile = Mobile;
	}

	public void setDateofBirth(String DateofBirth) {
		this.DateofBirth = DateofBirth;
	}

	public void setDateOfJoining(String DateOfJoining) {
		this.DateOfJoining = DateOfJoining;
	}

	public void setDateofconfirmation(String Dateofconfirmation) {
		this.Dateofconfirmation = Dateofconfirmation;
	}

	public void setDateOfLeaving(String DateOfLeaving) {
		this.DateOfLeaving = DateOfLeaving;
	}

	public void setEmployeeStatus(String EmployeeStatus) {
		this.EmployeeStatus = EmployeeStatus;
	}

	public void setAge(String Age) {
		this.Age = Age;
	}

	public void setPAN(String PAN) {
		this.PAN = PAN;
	}

	public void setUAN(String UAN) {
		this.UAN = UAN;
	}

	public void setAadhaarNumber(String AadhaarNumber) {
		this.AadhaarNumber = AadhaarNumber;
	}

	public void setPFAccountNumber(String PFAccountNumber) {
		this.PFAccountNumber = PFAccountNumber;
	}

	public void setESICAccountNumber(String ESICAccountNumber) {
		this.ESICAccountNumber = ESICAccountNumber;
	}

	public void setReportingManagerName(String ReportingManagerName) {
		this.ReportingManagerName = ReportingManagerName;
	}

	public void setReportingManagerCode(String ReportingManagerCode) {
		this.ReportingManagerCode = ReportingManagerCode;
	}

	public void setLastModified(String LastModified) {
		this.LastModified = LastModified;
	}

	public void setCreatedDate(String CreatedDate) {
		this.CreatedDate = CreatedDate;
	}

	public void setEmpFlag(String EmpFlag) {
		this.EmpFlag = EmpFlag;
	}

	public void setDateofResignation(String DateofResignation) {
		this.DateofResignation = DateofResignation;
	}

	public void setExitDate(String ExitDate) {
		this.ExitDate = ExitDate;
	}

	public void setGroupDOJ(String GroupDOJ) {
		this.GroupDOJ = GroupDOJ;
	}

	public void setExitTypeName(String ExitTypeName) {
		this.ExitTypeName = ExitTypeName;
	}

	public void setExitReason1(String ExitReason1) {
		this.ExitReason1 = ExitReason1;
	}

	public void setExitReason2(String ExitReason2) {
		this.ExitReason2 = ExitReason2;
	}

	public void setEmploymentType(String EmploymentType) {
		this.EmploymentType = EmploymentType;
	}

}
