package dataAndroidNauAn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dataAndroidNauAn.entity.MonAnEntity;
import dataAndroidNauAn.entity.DanhMucEntity;

public interface MonAnRepository extends JpaRepository<MonAnEntity, Long>{
}