package tpVolSpring;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tpVolSpring.entity.Login;
import tpVolSpring.repository.LoginRepository;

@RunWith(SpringJUnit4ClassRunner.class) // permet de lancer les test unitaire dans une classe spring
@ContextConfiguration(locations = {"/applicationContext.xml" })
public class LoginTest {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Test
	public void insertTest() {
		Login log = new Login("adqz", "motDePasse", true);
		assertNotNull(loginRepository.save(log));
//		assertNotNull(daoPersonne.findByKey(eleve.getNumero()));
	}
	
	
//	private static ClassPathXmlApplicationContext ctx=null;
//	private static DaoPersonne daoPersonne=null;
//	
//	@BeforeClass 
//	Méthode obligatoirement statique, code executé au démarrage de la phase de test
//	public static void initClassPathApplicationContext() {
//		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//	}
//	
//	@AfterClass
//	public static void closeClassPathApplicationContext() {
//		ctx.close();
//	}
//	@Before
//	public  void initDaoPersonne() {
//		daoPersonne=ctx.getBean(DaoPersonne.class);
//	}
//	
//	@Test
//	public void insert() {
//		Eleve eleve=new Eleve("aaaaa","ppppp");
//		daoPersonne.insert(eleve);
//		assertNotNull(eleve.getNumero());
//		assertNotNull(daoPersonne.findByKey(eleve.getNumero()));
//	}
//	
//	@Test
//	public void delete() {
//		Eleve eleve=new Eleve("aaaaa","ppppp");
//		daoPersonne.insert(eleve);
//		daoPersonne.delete(eleve);
//		assertNull(daoPersonne.findByKey(eleve.getNumero()));
//	}
//	@Test(expected=DataIntegrityViolationException.class)
//	public void prenomNull() {
//		Eleve eleve = new Eleve (null, "ppppp");
//		daoPersonne.insert(eleve);
//	}

}
