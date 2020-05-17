package com.oussema.FullStackApp.Test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Test {
	
	@RequestMapping(method = RequestMethod.GET , path = "hello" )
	public String Hello( ) {
		return "Hello Sou ";
	}
	
	@GetMapping(path = "/hello-Bean" )
	public BeanClass HelloBean( ) {
		return new BeanClass("Hello c'est un bean");
	}
	
	@GetMapping(path = "/hello-Bean/{name}" )
	public BeanClass HelloPath( @PathVariable String name) {
		return new BeanClass(String.format("Hello %s, c'est un bean",name));
	}
	@RequestMapping(path = "Bean" )
	public BeanClass Bean( @RequestParam(value = "name") String name) {
		return new BeanClass(String.format("Hello %s, c'est un bean",name));
	}

}
