package com.BankCustomer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankCustomer.dao.BankDao;
import com.BankCustomer.entity.BankCustomer;
import com.BankCustomer.exception.NoNotFound;


@Service
public class BankService {
	
@Autowired
BankDao bd;
private static Logger log = Logger.getLogger(BankService.class);
public List<BankCustomer> postDet(List<BankCustomer>a) {
	PropertyConfigurator.configure("logs.properties");
	log.fatal(a);
	List<BankCustomer>f= bd.postDet(a);
	log.fatal(f);
	return f;
}
public List<BankCustomer> getDet() {
	PropertyConfigurator.configure("logs.properties");

	List<BankCustomer>c= bd.getDet();
	log.error(c);
	return c;
}
public BankCustomer getId(int a) {
	PropertyConfigurator.configure("logs.properties");
	
	log.error(a);
			BankCustomer b=bd.getId(a);
			log.fatal(b);
	return b;
}
public BankCustomer putDet(BankCustomer a) {
	
	log.error(a);
	BankCustomer h=bd.putDet(a);
	log.error(h);
	return h;
}
public String delDet(int a) {
	PropertyConfigurator.configure("logs.properties");

	log.error(a);
	
	
	return bd.delDet(a);
}
public BankCustomer getAc(int a) throws NoNotFound {
     List<BankCustomer>b=getDet();
    List<BankCustomer> j=b.stream().filter(x->x.getAccNo()==a).collect(Collectors.toList());
     if(j.isEmpty())
     {
    	  throw new NoNotFound("acc no not found");
     }
     else {
     return bd.getAc(a);
     }
}
}
