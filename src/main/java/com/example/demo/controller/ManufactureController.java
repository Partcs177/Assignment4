package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.manufactureService.ManufacturerService;

@RestController
public class ManufactureController {
	@Autowired
	ManufacturerService manufacturerService;
	
	@PostMapping("/product")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createProduct(@RequestBody @Valid Product product) {
		manufacturerService.saveProduct(product);
	}
}
