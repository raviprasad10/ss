package com.capgemini.merchantstore.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.merchantstore.beans.Merchant;



public interface UserDao extends JpaRepository<Merchant,Integer> {
	

	@Query("SELECT t FROM Merchant t WHERE t.email =:email")
	Merchant findUserByEmail(@Param("email")String email);

}
