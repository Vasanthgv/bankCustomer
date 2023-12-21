package com.BankCustomer.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BankCustomer.entity.BankCustomer;
import com.BankCustomer.repo.BankRepo;
@Repository
public class BankDao {
@Autowired
BankRepo br;
private static Logger log = Logger.getLogger(BankDao.class);
public List<BankCustomer>postDet(List<BankCustomer>a) {
	PropertyConfigurator.configure("logs.properties");
	log.debug(a);
	List<BankCustomer>h=br.saveAll(a);
	log.error(a);
	return h;
}
public List<BankCustomer> getDet() {
	PropertyConfigurator.configure("logs.properties");
	// TODO Auto-generated method stub
	List<BankCustomer>d= br.findAll();
	log.fatal(d);
	return d;
}
public BankCustomer getId(int a) {
	PropertyConfigurator.configure("logs.properties");
	// TODO Auto-generated method stub
	log.info(a);
	 BankCustomer d=br.findById(a).get();
	 log.info(d);
	 return d;
}
public BankCustomer putDet(BankCustomer a) {
	PropertyConfigurator.configure("logs.properties");
	// TODO Auto-generated method stub
	log.info(a);
	BankCustomer h=br.save(a);
	log.info(h);
	return h;
}
public String delDet(int a) {
	PropertyConfigurator.configure("logs.properties");
	// TODO Auto-generated method stub
	log.info(a);
	br.deleteById(a);
	return "deleted";
}
public BankCustomer getAc(int a) {
	// TODO Auto-generated method stub
	return br.getAc(a);
}

}
