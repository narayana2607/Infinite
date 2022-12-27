package com.example.signin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class SignInDAO {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public String authenticate(String mobile,String pwd) {
		String cmd = "select count(*) cnt from Signin where Mobile_No=? "
				+ " AND Passcode=?";
		List str=jdbc.query(cmd,new Object[] {mobile,pwd}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
}
