package tpVolSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tpVolSpring.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@Query("select c from Client c left join fetch c.login l")
	List<Client> findAllWithLogin();
	
	public void deleteClientWithLogin(Long id);
	
	
//	@Query("delete c from Client c left join fetch c.login l")
//	void deleteById();
	
}
