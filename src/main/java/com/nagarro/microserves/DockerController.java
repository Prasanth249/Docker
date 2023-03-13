package com.nagarro.microserves;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/docker")
	public String getValue() {
		return "Started";
	}
	
	
}
