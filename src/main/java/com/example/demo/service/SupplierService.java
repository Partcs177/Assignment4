package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.SupplierRepository;
import com.example.demo.entity.Supplier;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	public void saveSupplier(@Valid Supplier supplier) {
		supplierRepository.save(supplier);
	}

}
