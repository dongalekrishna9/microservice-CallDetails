package com.micro.calldetails.service;

import java.util.List;

import com.micro.calldetails.model.CallDetailsDTO;

public interface ICallDetailsService {

	List<CallDetailsDTO> readCallDetails(Long phoneNumber);
}
