package com.example.repository.hexagram;

import com.example.entity.hexagram.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
	
}
