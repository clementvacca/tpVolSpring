package tpVolSpring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tpVolSpring.repository.ClientEiRepository;
import tpVolSpring.repository.ClientMoralRepository;
import tpVolSpring.repository.ClientPhysiqueRepository;

public class ClientService {
	
	@Autowired
	private ClientPhysiqueRepository clientPhysiqueRepository;
	@Autowired
	private ClientMoralRepository clientMoralRepository;
	@Autowired
	private ClientEiRepository clientEiRepository;
	
	
	
}
