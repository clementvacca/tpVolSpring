package tpVolSpring;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tpVolSpring.entity.CompagnieAerienne;
import tpVolSpring.entity.CompagnieAerienneVol;
import tpVolSpring.repository.CompagnieAerienneRepository;
import tpVolSpring.repository.CompagnieAerienneVolRepository;
import tpVolSpring.repository.VolRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/applicationContext.xml"})
public class Vol {
		@Autowired
		private CompagnieAerienneVolRepository compagnieAerienneVolRepository;

	@Test
	public void test() {
		List<CompagnieAerienneVol> ca=compagnieAerienneVolRepository.findCompagnieAerienne((long) 1);
		assertNotNull(ca);

	}

}
