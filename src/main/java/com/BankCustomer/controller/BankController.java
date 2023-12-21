package com.BankCustomer.controller;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankCustomer.entity.BankCustomer;
import com.BankCustomer.exception.NoNotFound;
import com.BankCustomer.service.BankService;
import org.apache.log4j.Logger;

@RestController
public class BankController {

	@Autowired
	BankService bs;
	private static Logger log = Logger.getLogger(BankController.class);
  public BankController(BankService g) {
	  this.bs=g;
	  }
	@PostMapping(value = "/val1")
	public String postDet(@RequestBody List<BankCustomer> a) {
		PropertyConfigurator.configure("logs.properties");
		log.info(a);
		List<BankCustomer>d=bs.postDet(a);
		log.info(d);
		return "saved";
	}

	@GetMapping(value = "/val2")
	public List<BankCustomer> getDet() {
		PropertyConfigurator.configure("logs.properties");
		List<BankCustomer>b= bs.getDet();
		log.info(b);
		return b;
	}

	@GetMapping(value = "/val3/{a}")
	public BankCustomer getDet(@PathVariable int a) {
		PropertyConfigurator.configure("logs.properties");
		log.info(a);
		BankCustomer j= bs.getId(a);
		log.info(j);
		return j;
	}

	@PutMapping(value = "/val4")
	public String putDet(@RequestBody BankCustomer a) {
		PropertyConfigurator.configure("logs.properties");
		log.info(a);
		BankCustomer s= bs.putDet(a);
		log.info(s);
		
		return "saved";

	}

	@DeleteMapping(value = "/val5/{a}")
	public String delDet(@PathVariable int a) {
		PropertyConfigurator.configure("logs.properties");
		// TODO Auto-generated method stub
		log.error(a);
		
		return bs.delDet(a);
	}
	@GetMapping(value="/val6/{a}")
	public BankCustomer getAc(@PathVariable int a) throws NoNotFound {
		return bs.getAc(a);
		
	}
}
