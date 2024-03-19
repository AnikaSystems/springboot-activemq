package com.anikasystems.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiWithActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiWithActivemqApplication.class, args);
	}

	public int add(int a, int b) {
        return a + b;
    }

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int modulus(int a, int b) {
		return a % b;
	}

	

}
