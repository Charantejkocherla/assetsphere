package com.spheredigital.assetsphere.core.models;

public class AssetItem {
	private String title;
	private String path;
	private String mimeType;
	private String thumbnail;
	private String uploadedLabel;
	private String actionLabel;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getUploadedLabel() {
		return uploadedLabel;
	}
	public void setUploadedLabel(String uploadedLabel) {
		this.uploadedLabel = uploadedLabel;
	}
	public String getActionLabel() {
		return actionLabel;
	}
	public void setActionLabel(String actionLabel) {
		this.actionLabel = actionLabel;
	}
}
