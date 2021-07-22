package qna.model.vo;

import java.sql.Date;

public class Qna {
	private int qnaNo;
	private String userId;
	private String qnaType;
	private String qnaTitle;
	private String qnaContent;
	private java.sql.Date qnaDate;
	private String qnaOriginalImage;
	private String qnaRenameImage;
	private char qnaopen; //공개 여부
	private int qnaPwd; //질문 공개 여부 비밀번호
	private int qnaReadCount; //조회수
	private String adminId;
	private int answerNo;
	
	public Qna(){}

	public Qna(int qnaNo, String userId, String qnaType, String qnaTitle, String qnaContent, Date qnaDate,
			String qnaOriginalImage, String qnaRenameImage, char qnaopen, int qnaPwd, int qnaReadCount, String adminId,
			int answerNo) {
		super();
		this.qnaNo = qnaNo;
		this.userId = userId;
		this.qnaType = qnaType;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaDate = qnaDate;
		this.qnaOriginalImage = qnaOriginalImage;
		this.qnaRenameImage = qnaRenameImage;
		this.qnaopen = qnaopen;
		this.qnaPwd = qnaPwd;
		this.qnaReadCount = qnaReadCount;
		this.adminId = adminId;
		this.answerNo = answerNo;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getQnaType() {
		return qnaType;
	}

	public void setQnaType(String qnaType) {
		this.qnaType = qnaType;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public java.sql.Date getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(java.sql.Date qnaDate) {
		this.qnaDate = qnaDate;
	}

	public String getQnaOriginalImage() {
		return qnaOriginalImage;
	}

	public void setQnaOriginalImage(String qnaOriginalImage) {
		this.qnaOriginalImage = qnaOriginalImage;
	}

	public String getQnaRenameImage() {
		return qnaRenameImage;
	}

	public void setQnaRenameImage(String qnaRenameImage) {
		this.qnaRenameImage = qnaRenameImage;
	}

	public char getQnaopen() {
		return qnaopen;
	}

	public void setQnaopen(char qnaopen) {
		this.qnaopen = qnaopen;
	}

	public int getQnaPwd() {
		return qnaPwd;
	}

	public void setQnaPwd(int qnaPwd) {
		this.qnaPwd = qnaPwd;
	}

	public int getQnaReadCount() {
		return qnaReadCount;
	}

	public void setQnaReadCount(int qnaReadCount) {
		this.qnaReadCount = qnaReadCount;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public int getAnswerNo() {
		return answerNo;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	@Override
	public String toString() {
		return "Qna [qnaNo=" + qnaNo + ", userId=" + userId + ", qnaType=" + qnaType + ", qnaTitle=" + qnaTitle
				+ ", qnaContent=" + qnaContent + ", qnaDate=" + qnaDate + ", qnaOriginalImage=" + qnaOriginalImage
				+ ", qnaRenameImage=" + qnaRenameImage + ", qnaopen=" + qnaopen + ", qnaPwd=" + qnaPwd
				+ ", qnaReadCount=" + qnaReadCount + ", adminId=" + adminId + ", answerNo=" + answerNo + "]";
	}
	
	

}
