package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "V_EBI_AGENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Agent {

	@Id
	private String agent_login;
	private String agent_name;
}