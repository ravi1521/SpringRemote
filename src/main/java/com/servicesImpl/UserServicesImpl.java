package com.servicesImpl;

import java.util.List;

import com.dao.UserDao;
import com.entities.Users;
import com.services.UserServices;
@Service
public class UserServicesImpl implements UserServices {

	 @Autowired
	 UserDao userDao;
	
	public List<Users> list() {
		// TODO Auto-generated method stub
		return userDao.list()
		
	}

	public boolean delete(Users users) {
		// TODO Auto-generated method stub
		return userDao.delete(users);
		
	}

	public boolean saveOrUpdate(Users users) {
		// TODO Auto-generated method stub
		return userDao.saveOrUpdate(users);
	}

}
