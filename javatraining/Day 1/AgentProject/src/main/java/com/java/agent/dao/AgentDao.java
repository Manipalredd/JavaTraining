package com.java.agent.dao;

import java.util.List;

import com.java.agent.model.Agent;

public interface AgentDao {
	List<Agent> showAgentDao();
	Agent searchEmployDao(int agentId);
	String updateAgentDao (Agent agent);
	String deleteAgentDao(int agentId);
	String addAgentDao(Agent agent);

}
