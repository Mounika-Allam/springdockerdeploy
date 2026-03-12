package com.example.demo;


	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	@SpringBootTest
	public class csecontrollerTest {
		@Autowired
		csecontroller c;
		//demo c = new demo();
			@Test
			void csetest() {
				int result = c.addcse(2,3);
				assertEquals(5,result);
			}
			void csetest1() {
				int result = c.mulcse(2,3);
				assertEquals(6,result);
			}


		}
		


