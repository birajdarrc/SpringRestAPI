package com.springbootapi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootapi.entity.TblPortaluser;

@Repository
public interface TblPortaluserDAO extends JpaRepository<TblPortaluser, Integer> {

}
