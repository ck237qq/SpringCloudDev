package com.example.repository.hexagram;

import com.example.entity.hexagram.HexagramKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HexagramKindRepository extends JpaRepository<HexagramKind, Long> {
	
}
