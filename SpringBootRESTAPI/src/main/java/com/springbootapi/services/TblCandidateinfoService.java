package com.springbootapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.DAO.TblCandidateInfoDAO;
import com.springbootapi.entity.TblCandidateinfo;

@Service
public class TblCandidateinfoService {

	@Autowired
	private TblCandidateInfoDAO candidateInfoDAO;
	
	public TblCandidateinfo savecandidate(TblCandidateinfo candidateinfo) {
		return candidateInfoDAO.save(candidateinfo);
	}

	public TblCandidateinfo getcandidate(Integer id) {
		return candidateInfoDAO.getById(id);
	}
	
	public List<TblCandidateinfo> allcandidate(){
		return candidateInfoDAO.findAll();
	}
	
	public void deletecandidate(int id) {
		candidateInfoDAO.deleteById(id);
	}
	
}
