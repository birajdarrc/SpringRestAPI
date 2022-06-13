package com.springbootapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.DAO.TblPortaluserDAO;
import com.springbootapi.entity.TblPortaluser;

@Service
public class TblPortaluserService {

	@Autowired
	private TblPortaluserDAO portaluserDAO;

	public TblPortaluser getUser(Integer id) {
		return portaluserDAO.getById(id);
	}

}
