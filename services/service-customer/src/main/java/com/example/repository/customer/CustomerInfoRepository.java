package com.example.repository.customer;

import com.example.entity.customer.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {
	
}
