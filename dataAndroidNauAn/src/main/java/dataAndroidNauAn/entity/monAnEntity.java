package dataAndroidNauAn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "danhMucCon")
public class monAnEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tenMon")
	private String tenMon;
	
	@Column(name = "anh")
	private String anh;
	
	@ManyToOne
	@JoinColumn(name = "maDM")
	private DanhMucEntity dMuc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public DanhMucEntity getdMuc() {
		return dMuc;
	}

	public void setdMuc(DanhMucEntity dMuc) {
		this.dMuc = dMuc;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	
	
	
	
}
