package dataAndroidNauAn.converter;

import org.springframework.stereotype.Component;

import dataAndroidNauAn.dto.DanhMucConDTO;
import dataAndroidNauAn.entity.monAnEntity;

@Component
public class DanhMucConConverter {
	
	public monAnEntity toEntity(DanhMucConDTO dto) {
		monAnEntity entity = new monAnEntity();
		entity.setTenMon(dto.getTenMon());
		entity.setAnh(dto.getAnh());
		return entity;
	}
	
	public DanhMucConDTO toDTO(monAnEntity entity) {
		DanhMucConDTO dto = new DanhMucConDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTenMon(entity.getTenMon());
		dto.setAnh(entity.getAnh());
		dto.setMaDM(entity.getdMuc().getMaDM());
		return dto;
	}
	
}
