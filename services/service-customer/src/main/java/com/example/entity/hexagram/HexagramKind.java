package com.example.entity.hexagram;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 卦象種類
 */
@Data
@Entity
public class HexagramKind {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long hexagramKindId;
	
	private Long hexagramKindNo;

	private String hexagramKindName;

}
