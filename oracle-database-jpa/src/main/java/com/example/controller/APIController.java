package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Agent;
import com.example.repo.AgentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/app")
public class APIController {

	private AgentRepository agentRepo;

	public APIController(AgentRepository agentRepo) {

		this.agentRepo = agentRepo;
	}

	@GetMapping("/getagent")
	public Optional<Agent> getAgent(@RequestParam("login") String login) {

		log.info("Calling agent endpoint...");
		return agentRepo.findById(login);
	}

	@GetMapping("/getagentall")
	public List<Agent> getAgentAll() {
		log.info("Calling all agent endpoint...");
		return (List<Agent>) agentRepo.findAll();
	}

	@GetMapping("/test")
	public String testService() {
		return "Test Success";
	}

}