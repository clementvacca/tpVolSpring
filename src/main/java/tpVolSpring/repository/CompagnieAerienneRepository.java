package tpVolSpring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import tpVolSpring.entity.CompagnieAerienne;

public interface CompagnieAerienneRepository extends JpaRepository<CompagnieAerienne, Long>{
//	List<CompagnieAerienne> findCompagnieAerienne(@Param("identifiant") Long idVol);
	public List<String> findnomCompagnieAerienne();
}
