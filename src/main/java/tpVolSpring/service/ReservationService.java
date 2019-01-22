package tpVolSpring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tpVolSpring.repository.ReservationRepository;

public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
}
