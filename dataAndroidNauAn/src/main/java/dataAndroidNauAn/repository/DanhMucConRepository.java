package dataAndroidNauAn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dataAndroidNauAn.entity.monAnEntity;
import dataAndroidNauAn.entity.DanhMucEntity;

public interface DanhMucConRepository extends JpaRepository<monAnEntity, Long>{
}
