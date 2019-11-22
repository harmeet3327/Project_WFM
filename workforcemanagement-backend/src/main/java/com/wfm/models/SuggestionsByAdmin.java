package com.wfm.models;

public class SuggestionsByAdmin {
	
	private Integer sugsId;
	private Integer suggResId;
	private Integer suggReqId;
	
	public Integer getSugsId() {
		return sugsId;
	}
	public void setSugsId(Integer sugsId) {
		this.sugsId = sugsId;
	}
	public Integer getSuggResId() {
		return suggResId;
	}
	public void setSuggResId(Integer suggResId) {
		this.suggResId = suggResId;
	}
	
	public Integer getSuggReqId() {
		return suggReqId;
	}
	public void setSuggReqId(Integer suggReqId) {
		this.suggReqId = suggReqId;
	}
	@Override
	public String toString() {
		return "SuggestionsByAdmin [sugsId=" + sugsId + ", suggResId=" + suggResId + ", suggReqId=" + suggReqId + "]";
	}
	
	

}
