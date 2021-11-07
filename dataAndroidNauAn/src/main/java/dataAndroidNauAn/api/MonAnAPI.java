package dataAndroidNauAn.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dataAndroidNauAn.dto.MonAnDTO;
import dataAndroidNauAn.service.impl.MonAnService;

@RestController
public class MonAnAPI {

	@Autowired
	MonAnService service;
	
	@PostMapping(value = "/monAn")
	public MonAnDTO save(@RequestBody MonAnDTO model) {
		return service.save(model);
	}
//	@GetMapping(value = "/danhMucCon")
//	public List<DanhMucConDTO> getDanhMucCon(@RequestParam(name = "loaiDM") Long idDM){
//		return service.getByIdDM(idDM);
//	}
}
