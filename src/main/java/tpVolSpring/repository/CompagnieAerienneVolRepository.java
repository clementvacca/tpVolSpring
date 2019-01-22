package tpVolSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tpVolSpring.entity.CompagnieAerienne;
import tpVolSpring.entity.CompagnieAerienneVol;
import tpVolSpring.entity.CompagnieAerienneVolPk;

public interface CompagnieAerienneVolRepository extends JpaRepository<CompagnieAerienneVol, CompagnieAerienneVolPk> {
	//Select c from compagnieaerienne c join compagnie_aerienne_vol cav on c.id_compagnie_aerienne=cav.compagnie_aerienne_id where cav.vol_id=1;
	@Query("select cav from CompagnieAerienneVol cav where cav.key.vol.idVol=:idVol")
	public List<CompagnieAerienneVol> findCompagnieAerienne(@Param("idVol") Long idVol);
	
}
