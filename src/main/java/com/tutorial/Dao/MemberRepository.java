package com.tutorial.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tutorial.Model.MemberAccountJPA;

public interface MemberRepository extends JpaRepository<MemberAccountJPA, Long> {

	@Query(value = "select id,email,password,address,cellphone from spring30mvc.member_account where EMAIL = ?1 and PASSWORD = ?2 ", nativeQuery = true)
	List<MemberAccountJPA> findCheckMemberAccount(String email, String password);
}
