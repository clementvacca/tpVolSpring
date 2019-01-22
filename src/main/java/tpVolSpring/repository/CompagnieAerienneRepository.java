package tpVolSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tpVolSpring.entity.CompagnieAerienne;

public interface CompagnieAerienneRepository extends JpaRepository<CompagnieAerienne, Long>{
	List<CompagnieAerienne> findByNomCompagnieAerienne(String nomCompagnieAerienne);
}
