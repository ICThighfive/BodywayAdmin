package advertisement.model.vo;

import java.sql.Date;

public class BusinessInfo {
	private String businessId;
	private String businessName;
	private String businessNo;
	private String businessAddress;
	private String businessPhone;
	private String managerDept;
	private String managerName;
	private String managerPhone;
	private String managerFax;
	private String managerEmail;
	private java.sql.Date adContractStart;
	private java.sql.Date adContractEnd;
	private char recontract;
	private int adFee;
	private String adURL;
	private String adCategory;
	private String adminId;
	
	public BusinessInfo() {}

	public BusinessInfo(String businessId, String businessName, String businessNo, String businessAddress,
			String businessPhone, String managerDept, String managerName, String managerPhone, String managerFax,
			String managerEmail, Date adContractStart, Date adContractEnd, char recontract, int adFee, String adURL,
			String adCategory, String adminId) {
		super();
		this.businessId = businessId;
		this.businessName = businessName;
		this.businessNo = businessNo;
		this.businessAddress = businessAddress;
		this.businessPhone = businessPhone;
		this.managerDept = managerDept;
		this.managerName = managerName;
		this.managerPhone = managerPhone;
		this.managerFax = managerFax;
		this.managerEmail = managerEmail;
		this.adContractStart = adContractStart;
		this.adContractEnd = adContractEnd;
		this.recontract = recontract;
		this.adFee = adFee;
		this.adURL = adURL;
		this.adCategory = adCategory;
		this.adminId = adminId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public String getManagerDept() {
		return managerDept;
	}

	public void setManagerDept(String managerDept) {
		this.managerDept = managerDept;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPhone() {
		return managerPhone;
	}

	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}

	public String getManagerFax() {
		return managerFax;
	}

	public void setManagerFax(String managerFax) {
		this.managerFax = managerFax;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public java.sql.Date getAdContractStart() {
		return adContractStart;
	}

	public void setAdContractStart(java.sql.Date adContractStart) {
		this.adContractStart = adContractStart;
	}

	public java.sql.Date getAdContractEnd() {
		return adContractEnd;
	}

	public void setAdContractEnd(java.sql.Date adContractEnd) {
		this.adContractEnd = adContractEnd;
	}

	public char getRecontract() {
		return recontract;
	}

	public void setRecontract(char recontract) {
		this.recontract = recontract;
	}

	public int getAdFee() {
		return adFee;
	}

	public void setAdFee(int adFee) {
		this.adFee = adFee;
	}

	public String getAdURL() {
		return adURL;
	}

	public void setAdURL(String adURL) {
		this.adURL = adURL;
	}

	public String getAdCategory() {
		return adCategory;
	}

	public void setAdCategory(String adCategory) {
		this.adCategory = adCategory;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "BusinessInfo [businessId=" + businessId + ", businessName=" + businessName + ", businessNo="
				+ businessNo + ", businessAddress=" + businessAddress + ", businessPhone=" + businessPhone
				+ ", managerDept=" + managerDept + ", managerName=" + managerName + ", managerPhone=" + managerPhone
				+ ", managerFax=" + managerFax + ", managerEmail=" + managerEmail + ", adContractStart="
				+ adContractStart + ", adContractEnd=" + adContractEnd + ", recontract=" + recontract + ", adFee="
				+ adFee + ", adURL=" + adURL + ", adCategory=" + adCategory + ", adminId=" + adminId + "]";
	}
	
	

}
