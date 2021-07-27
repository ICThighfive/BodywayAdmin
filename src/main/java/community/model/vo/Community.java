package community.model.vo;

import java.sql.Date;

public class Community implements java.io.Serializable{
	
	private static final long serialVersionUID = 11111L;
	
	//���ӽ�û�� vo
	private String communityId;	 	//����ID
	private String userId;			//��û��ID
	private Date applicationDate;	//��û��
	private String communityName;	//�����̸�
	private String communityIntro;	//���ӼҰ���
	private int capacityMin;		//�����ּ��ο�
	private int capacityMax;		//�����ִ��ο�
	private String interests;		//���ɻ�
	private String cOriginalImage;	//������ǥ�̹�����
	private String cRenameImage;	//�����ǥ�̹�����
	private String approvalYn;		//���ο���
	private String adminId;			//������ID(������ID)
	private int communityIndex;		//�����ε���
	
	public Community() {}
	
	public Community(String communityId, String userId, Date applicationDate, String communityName,
			String communityIntro, int capacityMin, int capacityMax, String interests, String cOriginalImage,
			String cRenameImage, String approvalYn, String adminId, int communityIndex) {
		super();
		this.communityId = communityId;
		this.userId = userId;
		this.applicationDate = applicationDate;
		this.communityName = communityName;
		this.communityIntro = communityIntro;
		this.capacityMin = capacityMin;
		this.capacityMax = capacityMax;
		this.interests = interests;
		this.cOriginalImage = cOriginalImage;
		this.cRenameImage = cRenameImage;
		this.approvalYn = approvalYn;
		this.adminId = adminId;
		this.communityIndex = communityIndex;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityIntro() {
		return communityIntro;
	}

	public void setCommunityIntro(String communityIntro) {
		this.communityIntro = communityIntro;
	}

	public int getCapacityMin() {
		return capacityMin;
	}

	public void setCapacityMin(int capacityMin) {
		this.capacityMin = capacityMin;
	}

	public int getCapacityMax() {
		return capacityMax;
	}

	public void setCapacityMax(int capacityMax) {
		this.capacityMax = capacityMax;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getcOriginalImage() {
		return cOriginalImage;
	}

	public void setcOriginalImage(String cOriginalImage) {
		this.cOriginalImage = cOriginalImage;
	}

	public String getcRenameImage() {
		return cRenameImage;
	}

	public void setcRenameImage(String cRenameImage) {
		this.cRenameImage = cRenameImage;
	}

	public String getApprovalYn() {
		return approvalYn;
	}

	public void setApprovalYn(String approvalYn) {
		this.approvalYn = approvalYn;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public int getCommunityIndex() {
		return communityIndex;
	}

	public void setCommunityIndex(int communityIndex) {
		this.communityIndex = communityIndex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Community [communityId=" + communityId + ", userId=" + userId + ", applicationDate=" + applicationDate
				+ ", communityName=" + communityName + ", communityIntro=" + communityIntro + ", capacityMin="
				+ capacityMin + ", capacityMax=" + capacityMax + ", interests=" + interests + ", cOriginalImage="
				+ cOriginalImage + ", cRenameImage=" + cRenameImage + ", approvalYn=" + approvalYn + ", adminId="
				+ adminId + ", communityIndex=" + communityIndex + "]";
	}
	

}
