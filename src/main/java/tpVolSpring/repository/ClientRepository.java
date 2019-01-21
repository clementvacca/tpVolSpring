package tpVolSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpVolSpring.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
