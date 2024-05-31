package com.shoe.platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.platform.model.Orden;
import com.shoe.platform.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService{
	
	@Autowired
	private IOrdenRepository iOrdenRepository;
	
	@Override
	public Orden save(Orden orden) {
		return iOrdenRepository.save(orden);
	}

}
