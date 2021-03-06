//Created by MyEclipse Struts
// XSL source (default): platform:/plugin/com.genuitec.eclipse.cross.easystruts.eclipse_3.9.210/xslt/JavaClass.xsl

package za.ac.unisa.lms.tools.studentoffer.forms;

public class Student {

	// --------------------------------------------------------- Instance Variables

	//Login Variables for new Applicant
	private String number;
	private String surname;
	private String firstnames;
	private String birthYear;
	private String birthMonth;
	private String birthDay;
	
	private String stuTestNo;
	
	private String initials;
	private String maidenName;
	private String title;
	private String gender;

	private String academicYear;
	private String academicPeriod;
	
	private String cellNr;
	private String emailAddress;
	
	private String appTime="";
	
	private String webOpenDate;
	private String webOpenADM;
	private String targetFrame;

	private boolean dateWAPOFFER = false;
	
	//Workstation Info
    private String stuIPAddress = "";
    private String stuBrowser = "";
    private String stuBrowserAgent = "";
    private String stuWksOS = "";
    
    private boolean stuExist = false;
    private boolean stuapqExist = false;
    
	private String qual1;
	private String spec1;
	private String qual2;
	private String spec2;
    
	// --------------------------------------------------------- Methods

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstnames() {
		return firstnames;
	}
	public void setFirstnames(String firstnames) {
		this.firstnames = firstnames;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getStuTestNo() {
		return stuTestNo;
	}
	public void setStuTestNo(String stuTestNo) {
		this.stuTestNo = stuTestNo;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getMaidenName() {
		return maidenName;
	}
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getAcademicPeriod() {
		return academicPeriod;
	}
	public void setAcademicPeriod(String academicPeriod) {
		this.academicPeriod = academicPeriod;
	}
	public String getCellNr() {
		return cellNr;
	}
	public void setCellNr(String cellNr) {
		this.cellNr = cellNr;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAppTime() {
		return appTime;
	}
	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}
	public String getWebOpenDate() {
		return webOpenDate;
	}
	public void setWebOpenDate(String webOpenDate) {
		this.webOpenDate = webOpenDate;
	}
	public String getWebOpenADM() {
		return webOpenADM;
	}
	public void setWebOpenADM(String webOpenADM) {
		this.webOpenADM = webOpenADM;
	}
	public String getTargetFrame() {
		return targetFrame;
	}
	public void setTargetFrame(String targetFrame) {
		this.targetFrame = targetFrame;
	}
	public boolean isDateWAPOFFER() {
		return dateWAPOFFER;
	}
	public void setDateWAPOFFER(boolean dateWAPOFFER) {
		this.dateWAPOFFER = dateWAPOFFER;
	}
	public String getStuIPAddress() {
		return stuIPAddress;
	}
	public void setStuIPAddress(String stuIPAddress) {
		this.stuIPAddress = stuIPAddress;
	}
	public String getStuBrowser() {
		return stuBrowser;
	}
	public void setStuBrowser(String stuBrowser) {
		this.stuBrowser = stuBrowser;
	}
	public String getStuBrowserAgent() {
		return stuBrowserAgent;
	}
	public void setStuBrowserAgent(String stuBrowserAgent) {
		this.stuBrowserAgent = stuBrowserAgent;
	}
	public String getStuWksOS() {
		return stuWksOS;
	}
	public void setStuWksOS(String stuWksOS) {
		this.stuWksOS = stuWksOS;
	}
	public boolean isStuExist() {
		return stuExist;
	}
	public void setStuExist(boolean stuExist) {
		this.stuExist = stuExist;
	}
	public boolean isStuapqExist() {
		return stuapqExist;
	}
	public void setStuapqExist(boolean stuapqExist) {
		this.stuapqExist = stuapqExist;
	}
	public String getQual1() {
		return qual1;
	}
	public void setQual1(String qual1) {
		this.qual1 = qual1;
	}
	public String getSpec1() {
		return spec1;
	}
	public void setSpec1(String spec1) {
		this.spec1 = spec1;
	}
	public String getQual2() {
		return qual2;
	}
	public void setQual2(String qual2) {
		this.qual2 = qual2;
	}
	public String getSpec2() {
		return spec2;
	}
	public  void setSpec2(String spec2) {
		this.spec2 = spec2;
	}
}