package com.vz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.vz.entities.Item;

@RestController
public class ItemController {
	
	@Timed
	@RequestMapping("/item")
	public @ResponseBody Item getItem(){
		
		return new Item(1000,"Apple Iphone6S", "Coolest phone in the world");
	}

}
