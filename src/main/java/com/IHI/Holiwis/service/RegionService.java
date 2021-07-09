package com.IHI.Holiwis.service;

import java.util.List;

import com.IHI.Holiwis.dto.Region;
import com.IHI.Holiwis.dto.RespuestaApi;


public interface RegionService {
	
	public List<Region> getRegions();
	
	public Region getRegion(int id);
	
	public RespuestaApi createRegion(Region region);
	
	public RespuestaApi updateRegion(Region region, int id);
	
	public RespuestaApi deleteRegion(int id);
}
		