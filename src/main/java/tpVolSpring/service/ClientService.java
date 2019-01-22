package tpVolSpring.service;

import java.util.Optional;
import java.util.function.LongToIntFunction;

import org.springframework.beans.factory.annotation.Autowired;

import tpVolSpring.entity.Client;
import tpVolSpring.entity.ClientPhysique;
import tpVolSpring.entity.Login;
import tpVolSpring.repository.ClientEiRepository;
import tpVolSpring.repository.ClientMoralRepository;
import tpVolSpring.repository.ClientPhysiqueRepository;
import tpVolSpring.repository.ClientRepository;
import tpVolSpring.repository.LoginRepository;

public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ClientPhysiqueRepository clientPhysiqueRepository;
	@Autowired
	private ClientMoralRepository clientMoralRepository;
	@Autowired
	private ClientEiRepository clientEiRepository;
	@Autowired
	private LoginRepository loginRepository;
	
	public void deleteClientWithLogin(Long id) {
		Optional<Login> opt = loginRepository.findById(id);
		if (opt.isPresent()) {
			Login log = opt.get();
			log.getClient().setLogin(null);
			clientRepository.save(log.getClient());
			clientRepository.deleteById(id);
		}
		
	}
	
	
	
}
