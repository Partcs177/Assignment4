package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Integer> {

}
