package com.deliveryBoy.deliveryBoy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryBoy.deliveryBoy.config.LocConstants;

@Service
public class KafkaService {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	Logger logger = LoggerFactory.getLogger(KafkaService.class) ;
	
	public Boolean  updateLocation() {
		kafkaTemplate.send(LocConstants.LOCATION_UPDATE,"("+Math.random()*100+" ,"+Math.random()*100+")");
		logger.info("Message Sent");
		return true;
	}
}
