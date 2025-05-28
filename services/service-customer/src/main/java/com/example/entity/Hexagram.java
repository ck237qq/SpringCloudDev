package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 卦象
 */
@Data
@Entity
public class Hexagram {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hexagramId;
	
	private Long hexagramNo;
	
	private String hexagramName;
	
	private Long topHexagramKindId;

	private Long upHexagramKindId;

}
