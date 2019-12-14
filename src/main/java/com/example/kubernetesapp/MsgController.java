package com.example.kubernetesapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@RequestMapping(path="/api/msg", method=RequestMethod.GET)
	public String displayMsg() {
		return "Hello from msgController";
	}
	
	

}
