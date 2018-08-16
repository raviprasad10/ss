package com.capgemini.merchantstore.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.merchantstore.beans.Merchant;
import com.capgemini.merchantstore.repo.IMerchantRepo;
@Component("MerchantServices")
public class MerchantServiceImpl implements IMerchantService {

	@Autowired(required = true)
	IMerchantRepo repo;
	
	@Override
	public Merchant addMerchant(Merchant merchant) {
		merchant.setAddMerchantDate(new Date());
		return repo.save(merchant);
	}

}
