package dataAndroidNauAn.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import dataAndroidNauAn.entity.UserEntity;

public interface userRepository extends JpaRepository<UserEntity, Long>{
	UserEntity findOneByUserName(String userName);
}
