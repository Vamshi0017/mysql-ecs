package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Con {
	@Autowired
	Dao d;
@RequestMapping("/")
public String kk() {
	return "hello world by ecs";
}
@RequestMapping("/add")
public String add(@RequestBody Alien a) {
	d.save(a);
	return "success";
}
@RequestMapping("/get")
public List<Alien> ll(){
	return d.findAll();
}
}
