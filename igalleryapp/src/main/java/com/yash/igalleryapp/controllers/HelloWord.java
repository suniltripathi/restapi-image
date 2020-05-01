package com.yash.igalleryapp.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWord {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return  new HelloWorldBean("Hello World Bean changed by gautam");
		//throw new RuntimeException("some error has been occured");
	}
	//hello-world/path-variable/sunil
//	http://localhost:8080/hello-world/path-variable/sunil
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) {
		return  new HelloWorldBean(String.format("Hello World,%s", name));
	}
	
	

}
