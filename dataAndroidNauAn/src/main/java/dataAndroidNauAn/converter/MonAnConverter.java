package dataAndroidNauAn.converter;

import org.springframework.stereotype.Component;

import dataAndroidNauAn.dto.MonAnDTO;
import dataAndroidNauAn.entity.MonAnEntity;

@Component
public class MonAnConverter {
	
	public MonAnEntity toEntity(MonAnDTO dto) {
		MonAnEntity entity = new MonAnEntity();
		entity.setTenMon(dto.getTenMon());
		entity.setAnh(dto.getAnh());
		entity.setMaMon(dto.getMaMon());
		return entity;
	}
	
	public MonAnDTO toDTO(MonAnEntity entity) {
		MonAnDTO dto = new MonAnDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTenMon(entity.getTenMon());
		dto.setAnh(entity.getAnh());
		dto.setMaMon(entity.getMaMon());
		dto.setMaDM(entity.getdMuc().getMaDM());
		return dto;
		
	}
	
}
