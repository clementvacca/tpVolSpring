package tpVolSpring.service;

import org.springframework.beans.factory.annotation.Autowired;

import tpVolSpring.repository.LoginRepository;

public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
}
