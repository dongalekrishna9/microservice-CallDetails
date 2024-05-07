package com.micro.calldetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.calldetails.entity.CallDetails;
import com.micro.calldetails.model.CallDetailsDTO;
import com.micro.calldetails.repository.CallDetailsRepository;
import com.micro.calldetails.service.ICallDetailsService;
@Service
public class CallDetailsServiceImpl implements ICallDetailsService {

	@Autowired
	CallDetailsRepository callDetailsRepo;
	
	@Override
	public List<CallDetailsDTO> readCallDetails(Long phoneNumber) {
		
		List<CallDetails> callDetailsList = this.callDetailsRepo.findByCalledBy(phoneNumber);
		
		List<CallDetailsDTO> callDetailsDTOList=new ArrayList<CallDetailsDTO>();		
		callDetailsList.forEach(callDetail->{
			CallDetailsDTO callDetailsDTO=new CallDetailsDTO();
			BeanUtils.copyProperties(callDetail, callDetailsDTO);
			callDetailsDTOList.add(callDetailsDTO);
		});
		
		return callDetailsDTOList;
	}

}
