package za.ac.unisa.lms.tools.registrationstatus.forms;

public class Qualification {
	
	private String qualCode;
	private String qualDesc;
	private String specCode;
	private String specDesc;
	private String qualType; // U = undergrad, H = honors
	private String institution; // T = TSA
	
	public String getQualCode() {
		return qualCode;
	}
	public void setQualCode(String qualCode) {
		this.qualCode = qualCode;
	}
	public String getQualDesc() {
		return qualDesc;
	}
	public void setQualDesc(String qualDesc) {
		this.qualDesc = qualDesc;
	}
	public String getSpecCode() {
		return specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}
	public String getSpecDesc() {
		return specDesc;
	}
	public void setSpecDesc(String specDesc) {
		this.specDesc = specDesc;
	}
	public String getQualType() {
		return qualType;
	}
	public void setQualType(String qualType) {
		this.qualType = qualType;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}

}
