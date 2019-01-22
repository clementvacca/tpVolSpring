package tpVolSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpVolSpring.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
