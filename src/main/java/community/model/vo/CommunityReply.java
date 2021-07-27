package community.model.vo;

import java.sql.Date;

public class CommunityReply implements java.io.Serializable {

	private static final long serialVersionUID = 11114L;
	
	//���Ӵ�۰��� vo
	private int replyNo;			//����ε���
	private String communityId;		//����ID
	private String userId;			//�ۼ���ID
	private Date cReplyDate;		//�ۼ��Ͻ�
	private Date cModifyDate;		//����������
	private String cReplyContent;	//��۳���
	private int replyLevelNumber;	//Depth(���/����)
	private int cRefNo;				//���۹�ȣ
	private int replyRefNo;			//������۹�ȣ
	
	public CommunityReply() {}

	public CommunityReply(int replyNo, String communityId, String userId, Date cReplyDate, Date cModifyDate,
			String cReplyContent, int replyLevelNumber, int cRefNo, int replyRefNo) {
		super();
		this.replyNo = replyNo;
		this.communityId = communityId;
		this.userId = userId;
		this.cReplyDate = cReplyDate;
		this.cModifyDate = cModifyDate;
		this.cReplyContent = cReplyContent;
		this.replyLevelNumber = replyLevelNumber;
		this.cRefNo = cRefNo;
		this.replyRefNo = replyRefNo;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
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

	public Date getcReplyDate() {
		return cReplyDate;
	}

	public void setcReplyDate(Date cReplyDate) {
		this.cReplyDate = cReplyDate;
	}

	public Date getcModifyDate() {
		return cModifyDate;
	}

	public void setcModifyDate(Date cModifyDate) {
		this.cModifyDate = cModifyDate;
	}

	public String getcReplyContent() {
		return cReplyContent;
	}

	public void setcReplyContent(String cReplyContent) {
		this.cReplyContent = cReplyContent;
	}

	public int getReplyLevelNumber() {
		return replyLevelNumber;
	}

	public void setReplyLevelNumber(int replyLevelNumber) {
		this.replyLevelNumber = replyLevelNumber;
	}

	public int getcRefNo() {
		return cRefNo;
	}

	public void setcRefNo(int cRefNo) {
		this.cRefNo = cRefNo;
	}

	public int getReplyRefNo() {
		return replyRefNo;
	}

	public void setReplyRefNo(int replyRefNo) {
		this.replyRefNo = replyRefNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CommunityReply [replyNo=" + replyNo + ", communityId=" + communityId + ", userId=" + userId
				+ ", cReplyDate=" + cReplyDate + ", cModifyDate=" + cModifyDate + ", cReplyContent=" + cReplyContent
				+ ", replyLevelNumber=" + replyLevelNumber + ", cRefNo=" + cRefNo + ", replyRefNo=" + replyRefNo + "]";
	}

}
