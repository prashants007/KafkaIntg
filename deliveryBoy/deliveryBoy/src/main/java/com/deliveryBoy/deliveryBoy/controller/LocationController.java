package com.deliveryBoy.deliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryBoy.deliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	KafkaService kafkaService;
	
	@GetMapping("/update")
	public ResponseEntity<?> updateLocation(){
		kafkaService.updateLocation();
		return new ResponseEntity<>(Map.of("Message","Location Update"), HttpStatus.OK);
	}
	
}
