package com.IHI.Holiwis.service;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IHI.Holiwis.Repository.RegionRepository;
import com.IHI.Holiwis.dto.Region;
import com.IHI.Holiwis.dto.RespuestaApi;

@Service
public class RegionServiceImp implements RegionService {

	@Autowired
	RegionRepository regionRepository;
	
	@Override
	public List<Region> getRegions() {
		return regionRepository.getRegions();
	}

	@Override
	public Region getRegion(int id) {
		return regionRepository.getRegion(id);
	}

	@Override
	public RespuestaApi createRegion(Region region) {
		return regionRepository.createRegion(region);
	}

	@Override
	public RespuestaApi updateRegion(Region region, int id) {
		return regionRepository.updateRegion(region, id);
	}

	@Override
	public RespuestaApi deleteRegion(int id) {
		return regionRepository.deleteRegion(id);
	}

}
