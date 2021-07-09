package com.IHI.Holiwis.dto;


public class Region {
	private int id;
	private String region;
	
	public Region() {}
	
	public Region(int id, String region) {
		this.setId(id);
		this.setRegion(region);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
}
