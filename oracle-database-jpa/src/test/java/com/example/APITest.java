package com.example;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.APIController;
import com.example.model.Agent;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("default")
public class APITest {

	@Autowired
	private APIController api;

	//@Test
	public void getAgentTest() {
		String login = "cm";
		Optional<Agent> response = api.getAgent(login);
		System.out.println(response.toString());
	}

	@Test
	public void getAgentAllTest() {
		List<Agent> response = api.getAgentAll();
		System.out.println(response.toString());
	}

}