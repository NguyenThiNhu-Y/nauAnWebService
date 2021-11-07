package dataAndroidNauAn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguyenLieu")
public class nguyenLieuEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String ten;
	
	@Column(name = "dinhLuong")
	private String dinhLuong;
	
	
}
