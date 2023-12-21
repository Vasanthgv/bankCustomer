package com.BankCustomer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BankCustomer.entity.BankCustomer;

public interface BankRepo extends JpaRepository<BankCustomer,Integer> {
	@Query(value = "select * from bank_customer where acc_no=?", nativeQuery = true)
	public BankCustomer getAc(int a) ;
		
	
}
