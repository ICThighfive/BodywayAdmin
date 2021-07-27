package community.model.vo;

import java.sql.Date;

public class CommunityInfo implements java.io.Serializable{
	
	private static final long serialVersionUID = 11112L;
	
	//����Ȱ������ vo
	private int cInfoNo;			//�۹�ȣ
	private String communityId;		//����ID
	private Date cMeetingDate;		//���ӳ�¥	
	private String cMeetingPlace;	//�������
	private String cMeetingFeeYn;	//����ȸ�񿩺�
	private int cMeetingFee;		//����ȸ��
	private String memberList;		//������ ���
	private String cHeart;			//��Ʈ
	
	public CommunityInfo() {}

	public CommunityInfo(int cInfoNo, String communityId, Date cMeetingDate, String cMeetingPlace, String cMeetingFeeYn,
			int cMeetingFee, String memberList, String cHeart) {
		super();
		this.cInfoNo = cInfoNo;
		this.communityId = communityId;
		this.cMeetingDate = cMeetingDate;
		this.cMeetingPlace = cMeetingPlace;
		this.cMeetingFeeYn = cMeetingFeeYn;
		this.cMeetingFee = cMeetingFee;
		this.memberList = memberList;
		this.cHeart = cHeart;
	}

	public int getcInfoNo() {
		return cInfoNo;
	}

	public void setcInfoNo(int cInfoNo) {
		this.cInfoNo = cInfoNo;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Date getcMeetingDate() {
		return cMeetingDate;
	}

	public void setcMeetingDate(Date cMeetingDate) {
		this.cMeetingDate = cMeetingDate;
	}

	public String getcMeetingPlace() {
		return cMeetingPlace;
	}

	public void setcMeetingPlace(String cMeetingPlace) {
		this.cMeetingPlace = cMeetingPlace;
	}

	public String getcMeetingFeeYn() {
		return cMeetingFeeYn;
	}

	public void setcMeetingFeeYn(String cMeetingFeeYn) {
		this.cMeetingFeeYn = cMeetingFeeYn;
	}

	public int getcMeetingFee() {
		return cMeetingFee;
	}

	public void setcMeetingFee(int cMeetingFee) {
		this.cMeetingFee = cMeetingFee;
	}

	public String getMemberList() {
		return memberList;
	}

	public void setMemberList(String memberList) {
		this.memberList = memberList;
	}

	public String getcHeart() {
		return cHeart;
	}

	public void setcHeart(String cHeart) {
		this.cHeart = cHeart;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CommunityInfo [cInfoNo=" + cInfoNo + ", communityId=" + communityId + ", cMeetingDate=" + cMeetingDate
				+ ", cMeetingPlace=" + cMeetingPlace + ", cMeetingFeeYn=" + cMeetingFeeYn + ", cMeetingFee="
				+ cMeetingFee + ", memberList=" + memberList + ", cHeart=" + cHeart + "]";
	}
	
}
