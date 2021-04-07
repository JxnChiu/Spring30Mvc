package com.tutorial.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.Model.MemberAccountJPA;

public interface MemberRepository extends JpaRepository<MemberAccountJPA, Long>{

}
