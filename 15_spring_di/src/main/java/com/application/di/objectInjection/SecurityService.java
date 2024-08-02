package com.application.di.objectInjection;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

	// before (바로 사용)
	// BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	// after (SecurityConfig에서 생성된 객체를 주입하여 사용)
	PasswordEncoder passwordEncoder;
}
