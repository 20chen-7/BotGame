package com.kob.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class BackendApplicationTests {

	@Test
	void contextLoads() {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		System.out.println(passwordEncoder.encode("cxy1"));
//		System.out.println(passwordEncoder.encode("gyf1"));
////		System.out.println(passwordEncoder.matches("cxy1", "$2a$10$Ur/LfnnuNXUYSViQTN61buiwwqI7sJ3T0u8LfAoJEIZtXkNCMaWeW"));
//		System.out.println(passwordEncoder.encode("cxy2"));
	}

}
