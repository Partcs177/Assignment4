package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ManufacturerRepository;
import com.example.demo.entity.Component;
import com.example.demo.entity.Product;
import com.example.demo.entity.Supplier;
import com.example.demo.service.ComponentService;
import com.example.demo.service.SupplierService;

@RestController
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	
	@PostMapping("/supplier")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createSupplier(@RequestBody @Valid Supplier supplier) {
		supplierService.saveSupplier(supplier);
	}

}
