package advertisement.model.vo;

import java.sql.Date;

public class Banner {
	private String bannerId;
	private String businessId;
	private java.sql.Date bannerPostDate;
	private java.sql.Date bannerEndDate;
	private String BannerURL;
	private String BannerOriginalImage;
	private String BannerRenameImage;
	
	public Banner(){}

	public Banner(String bannerId, String businessId, Date bannerPostDate, Date bannerEndDate, String bannerURL,
			String bannerOriginalImage, String bannerRenameImage) {
		super();
		this.bannerId = bannerId;
		this.businessId = businessId;
		this.bannerPostDate = bannerPostDate;
		this.bannerEndDate = bannerEndDate;
		BannerURL = bannerURL;
		BannerOriginalImage = bannerOriginalImage;
		BannerRenameImage = bannerRenameImage;
	}

	public String getBannerId() {
		return bannerId;
	}

	public void setBannerId(String bannerId) {
		this.bannerId = bannerId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public java.sql.Date getBannerPostDate() {
		return bannerPostDate;
	}

	public void setBannerPostDate(java.sql.Date bannerPostDate) {
		this.bannerPostDate = bannerPostDate;
	}

	public java.sql.Date getBannerEndDate() {
		return bannerEndDate;
	}

	public void setBannerEndDate(java.sql.Date bannerEndDate) {
		this.bannerEndDate = bannerEndDate;
	}

	public String getBannerURL() {
		return BannerURL;
	}

	public void setBannerURL(String bannerURL) {
		BannerURL = bannerURL;
	}

	public String getBannerOriginalImage() {
		return BannerOriginalImage;
	}

	public void setBannerOriginalImage(String bannerOriginalImage) {
		BannerOriginalImage = bannerOriginalImage;
	}

	public String getBannerRenameImage() {
		return BannerRenameImage;
	}

	public void setBannerRenameImage(String bannerRenameImage) {
		BannerRenameImage = bannerRenameImage;
	}

	@Override
	public String toString() {
		return "Banner [bannerId=" + bannerId + ", businessId=" + businessId + ", bannerPostDate=" + bannerPostDate
				+ ", bannerEndDate=" + bannerEndDate + ", BannerURL=" + BannerURL + ", BannerOriginalImage="
				+ BannerOriginalImage + ", BannerRenameImage=" + BannerRenameImage + "]";
	}
	
	
	

}
