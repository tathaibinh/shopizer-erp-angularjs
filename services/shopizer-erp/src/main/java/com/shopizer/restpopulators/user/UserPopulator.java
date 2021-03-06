package com.shopizer.restpopulators.user;

import java.util.Locale;

import org.springframework.stereotype.Component;

import com.shopizer.business.entity.user.User;
import com.shopizer.restentity.user.RESTUser;
import com.shopizer.restpopulators.DataPopulator;

@Component
public class UserPopulator implements DataPopulator<RESTUser, User> {

	@Override
	public User populateModel(RESTUser source, Locale locale) throws Exception {

		
		
		User target = new User();
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setUserName(source.getUserName());
		target.setPermissions(source.getPermissions());
		target.setPassword(source.getPassword());
		target.setRoles(source.getRoles());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public RESTUser populateWeb(User source, Locale locale) throws Exception {

		
		RESTUser target = new RESTUser();
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setPermissions(source.getPermissions());
		target.setId(source.getId());
		target.setRoles(source.getRoles());
		target.setPassword(source.getPassword());
		target.setUserName(source.getUserName());
		
		return target;
	}

}
