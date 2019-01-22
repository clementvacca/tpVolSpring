package tpVolSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpVolSpring.repository.PassagerRepository;

@Service
public class PassagerService {
	
	@Autowired
	private PassagerRepository passagerRepository;
}
