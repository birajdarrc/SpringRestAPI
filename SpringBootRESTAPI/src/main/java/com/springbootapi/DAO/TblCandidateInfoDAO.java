package com.springbootapi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.entity.TblCandidateinfo;

public interface TblCandidateInfoDAO extends JpaRepository<TblCandidateinfo, Integer> {

}
