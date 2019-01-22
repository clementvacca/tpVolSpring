package tpVolSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tpVolSpring.entity.CompagnieAerienneVol;
import tpVolSpring.repository.CompagnieAerienneRepository;
import tpVolSpring.repository.CompagnieAerienneVolRepository;

@Service
public class CompagnieAerienneService {

	@Autowired
	private CompagnieAerienneVolRepository compagnieAerienneVolRepository;
	@Autowired
	private CompagnieAerienneRepository compagnieAerienneRepository;
	
	public List<String> findnomCompagnieAerienne() {
		List<String> comps=null;
		List<CompagnieAerienneVol> compagnies = compagnieAerienneVolRepository.findCompagnieAerienne((long) 1);
		for (CompagnieAerienneVol c: compagnies) {
			comps.add(c.getKey().getCompagnieAerienneVol().getNomCompagnieAerienne());
		}
		System.out.println(comps);
		return comps;
	}
}
