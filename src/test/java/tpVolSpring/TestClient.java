package tpVolSpring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tpVolSpring.entity.Client;
import tpVolSpring.entity.ClientPhysique;
import tpVolSpring.repository.ClientPhysiqueRepository;
import tpVolSpring.repository.ClientRepository;
import tpVolSpring.service.ClientService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TestClient {
	
	@Autowired
	private ClientPhysiqueRepository clientPhysiqueRepository;
	@Autowired
	private ClientRepository clientRepository;

	@Test
	public void clientPhysiqueAutowired() {
		assertNotNull(clientPhysiqueRepository);
	}

	@Test(expected = DataIntegrityViolationException.class)
	public void nomNull() {
		ClientPhysique client1 = new ClientPhysique();
		client1.setNom(null); //Lefebvre
		client1.setPrenom("Paul");
		client1.setEmail("pl@gg.com");
		clientPhysiqueRepository.save(client1);
	}
	@Test
	public void deleteClientWithLoginTest() {
		ClientPhysique client1 = new ClientPhysique();
		client1.setNom("Lefebvre"); 
		client1.setPrenom("Paul");
		client1.setEmail("pl@gg.com");
		tpVolSpring.entity.Login login = new tpVolSpring.entity.Login("eee", "eeeee", true);
		client1.setLogin(login);
		clientRepository.save(client1);
		clientRepository.deleteClientWithLogin(client1.getIdClient());
		
	}

	
	
//	@Test
//	public void deleteClientWithLogin() {
//		ClientPhysique client1 = new ClientPhysique();
//		client1.setNom("Lefebvre"); 
//		client1.setPrenom("Paul");
//		client1.setEmail("pl@gg.com");
//		client1.getLogin().setClient(client1);
//		client1.getLogin().setId((long) 1);
//		client1.getLogin().setAdmin(false);
//		client1.getLogin().setMotDePasse("POPOL31");
//		client1.getLogin().setLogin("POPOL");
//		clientPhysiqueRepository.save(client1);
//		
//	}
	
	
//	@Test(expected = DataIntegrityViolationException.class)
//	public void emailNull() {
//		ClientPhysique client1 = new ClientPhysique();
//		client1.setNom("Lefebvre"); //Lefebvre
//		client1.setPrenom("Paul");
//		client1.setEmail(null);
//		clientPhysiqueRepository.save(client1);
//	}
//	
//	@Test
//	public void findById() {
//		ClientPhysique client1 = new ClientPhysique();
//		client1.setNom("Lefebvre"); 
//		client1.setPrenom("Paul");
//		client1.setEmail("pl@gg.com");
//		clientPhysiqueRepository.save(client1);
//		clientPhysiqueRepository.findById(client1.getIdClient());
//	}
//	
//	@Test
//	public void findAll() {
//		ClientPhysique client1 = new ClientPhysique();
//		client1.setNom("Lefebvre"); //Lefebvre
//		client1.setPrenom("Paul");
//		client1.setEmail("pl@gg.com");
//		clientPhysiqueRepository.save(client1);
//		clientPhysiqueRepository.findAll();
//	}
	
	
	
	
}
