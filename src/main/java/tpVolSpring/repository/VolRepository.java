package tpVolSpring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpVolSpring.entity.CompagnieAerienne;
import tpVolSpring.entity.Vol;

public interface VolRepository extends JpaRepository<Vol, Long>{
//	@Query("select ca from CompagnieAerienne ca left join fetch ca.CompagnieAerienneVol where ca.CompagnieAerienneVol.numero=:idVol")
	public List<CompagnieAerienne> findCompagnieAerienne(/*@Param("idVol") Long idVol*/);
}
