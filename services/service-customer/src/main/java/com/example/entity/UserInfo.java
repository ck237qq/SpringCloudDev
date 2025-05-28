package com.example.entity;


import java.sql.Time;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 使用者資訊資料庫欄位
 */
@Data
@Entity
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userInfoId;
	
	private String account;

	private String password;
	
	private Time passwordUpdateTime;
	
	private String name;
	
	private Time buildT;
	
	private Time uploadT;
	
	private UUID userUuid;
	
}
