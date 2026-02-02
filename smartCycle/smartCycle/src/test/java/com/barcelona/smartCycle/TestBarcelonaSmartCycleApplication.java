package com.barcelona.smartCycle;

import org.springframework.boot.SpringApplication;

public class TestBarcelonaSmartCycleApplication {

	public static void main(String[] args) {
		SpringApplication.from(BarcelonaSmartCycleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
