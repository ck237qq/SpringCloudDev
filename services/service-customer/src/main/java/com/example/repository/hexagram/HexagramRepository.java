package com.example.repository.hexagram;

import com.example.entity.hexagram.Hexagram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface HexagramRepository extends JpaRepository<Hexagram, Long> {

}
