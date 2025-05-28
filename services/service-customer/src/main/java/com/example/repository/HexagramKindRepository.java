package com.example.repository;

import com.example.entity.HexagramKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HexagramKindRepository extends JpaRepository<HexagramKind, Long> {
	
}
