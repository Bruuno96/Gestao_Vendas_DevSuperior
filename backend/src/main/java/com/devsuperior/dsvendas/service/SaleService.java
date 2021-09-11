package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.model.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	

	public List<SaleDTO> findAll(){
		List<Sale> result = repository.findAll();
		return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
		
	}
	

}
