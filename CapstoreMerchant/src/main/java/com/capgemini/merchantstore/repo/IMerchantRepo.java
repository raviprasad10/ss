package com.capgemini.merchantstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.merchantstore.beans.Merchant;

public interface IMerchantRepo extends JpaRepository<Merchant, Integer>{

}
