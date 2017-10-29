package com.lab.demo;

import org.springframework.jdbc.core.JdbcTemplate;

public class RegisterDAO {
	
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveData(RegisterData e)
	{
		String query="insert into registerData values('"+e.getId()+"','"+e.getPassword()+"')";
		
		return jdbcTemplate.update(query);
		
		
	}
	

}
