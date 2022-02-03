package com.example.demo.manufactureService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ManufacturerRepository;
import com.example.demo.entity.Product;


@Service
public class ManufacturerService {
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	public void saveProduct(@Valid Product product) {
		manufacturerRepository.save(product);
	}

}
