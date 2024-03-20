package com.anikasystems.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootApiWithActivemqApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testAdd() {
		SpringBootApiWithActivemqApplication app = new SpringBootApiWithActivemqApplication();
		assert(app.add(1, 2) == 3);
	}

	@Test
	void testSubtract() {
		SpringBootApiWithActivemqApplication app = new SpringBootApiWithActivemqApplication();
		assert(app.subtract(1, 2) == -1);
	}

	@Test
	void testMultiply() {
		SpringBootApiWithActivemqApplication app = new SpringBootApiWithActivemqApplication();
		assert(app.multiply(1, 2) == 2);
	}

	@Test
	void testDivide() {
		SpringBootApiWithActivemqApplication app = new SpringBootApiWithActivemqApplication();
		assert(app.divide(1, 2) == 0);
	}

	@Test
	void testModulus() {
		SpringBootApiWithActivemqApplication app = new SpringBootApiWithActivemqApplication();
		assert(app.modulus(1, 2) == 1);
	}

}
