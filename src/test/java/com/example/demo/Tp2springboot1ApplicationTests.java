package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.UserValidator;

@SpringBootTest
class Tp2springboot1ApplicationTests {
	UserValidator u;
@BeforeEach
void initialise()
{
	u=new UserValidator();
	
}
	@Test
	void contextLoads() {
	}
	@Test
	void testMyid()
	{
	assertTrue(u.testId(13));
		
		
	}

}
