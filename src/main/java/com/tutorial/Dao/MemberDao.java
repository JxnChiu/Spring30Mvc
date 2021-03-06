package com.tutorial.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tutorial.Model.MemberAccount;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addMember(MemberAccount memberAccount) {
		System.out.println("---EXCUTE INSERT MEMBER");
		jdbcTemplate.update(
				"INSERT INTO MEMBER_ACCOUNT(PASSWORD, EMAIL, ADDRESS, CELLPHONE)"
						+ "VALUES (?,?,?,?)",
				memberAccount.getPassword(), memberAccount.getEmail(), memberAccount.getAddress(),
				memberAccount.getCellphone());
	}

}
