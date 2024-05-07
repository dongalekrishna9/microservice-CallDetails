package com.micro.calldetails.runner;


import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.micro.calldetails.entity.CallDetails;
import com.micro.calldetails.repository.CallDetailsRepository;
//@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	CallDetailsRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		CallDetails c4=new CallDetails();
		c4.setCallId(4L);
		c4.setCalledBy(9975267675L);
		c4.setCalledTo(6677994455L);
		c4.setCalledOn(new Date());
		c4.setDurationInSeconds(10L);
		
		CallDetails c5=new CallDetails();
		c5.setCallId(5L);
		c5.setCalledBy(9975267675L);
		c5.setCalledTo(8888706024L);
		c5.setCalledOn(new Date());
		c5.setDurationInSeconds(13L);
		
		repo.save(c4);
		repo.save(c5);
		
		
	}

}
