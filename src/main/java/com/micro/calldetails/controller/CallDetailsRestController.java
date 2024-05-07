package com.micro.calldetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.calldetails.model.CallDetailsDTO;
import com.micro.calldetails.service.ICallDetailsService;

@RestController
public class CallDetailsRestController {
	
	@Autowired
	ICallDetailsService callDetailsService;

	//get all call details of specific phone number

	@GetMapping(value = "/{phoneNumber}", produces = "application/json")
	public ResponseEntity<List<CallDetailsDTO>> getCallDetailsByPhoneNumber(@PathVariable Long phoneNumber)
	{
		return new ResponseEntity<List<CallDetailsDTO>>(this.callDetailsService.readCallDetails(phoneNumber),HttpStatus.OK);
	}
}
