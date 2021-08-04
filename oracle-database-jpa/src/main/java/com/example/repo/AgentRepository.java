package com.example.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Agent;

public interface AgentRepository extends CrudRepository<Agent, String> {

}