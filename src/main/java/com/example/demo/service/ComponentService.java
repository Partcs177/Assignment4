package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ComponentRepository;
import com.example.demo.entity.Component;


@Service
public class ComponentService {
	@Autowired
	private ComponentRepository componentRepository;
	public void saveComponent(@Valid Component component) {
		componentRepository.save(component);
	}
}
