package com.cdac.dto;

public class registrationStatus {
	private boolean status;
	private String statusMasg;
	private int cid;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getStatusMasg() {
		return statusMasg;
	}
	public void setStatusMasg(String statusMasg) {
		this.statusMasg = statusMasg;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}
