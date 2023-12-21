package com.BankCustomer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.BankCustomer.controller.BankController;
import com.BankCustomer.entity.BankCustomer;
import com.BankCustomer.service.BankService;

@SpringBootTest
class BankCustomerApplicationTests {

	@Test
	void contextLoads() {
	}
	BankService bs=new BankService();
	BankController bc=new BankController(bs);
//	BankCustomer bsc=new BankCustomer("surya",123,"guindy",1000000);
//	BankCustomer bsc1=new BankCustomer("deva",124,"velacherry",1000000);
//	ArrayList<BankCustomer>b=new ArrayList<>();
//	b.add(bsc);
//	b.add(bsc1);
	
//	public void test1() {
//		assertEquals(bc.postDet(null),);
//	}

}
