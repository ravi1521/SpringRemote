package com.daoImpl;

import java.util.List;

import com.dao.UserDao;
import com.entities.Users;
@Repository
@Transactional
public class UsersDaoImpl implements UserDao {
    
	@Autowired
	SessionFactory session;
	public List<Users> list() {
		// TODO Auto-generated method stub
		return session.getCurrentSession.createQuery("from Users").list();
		return null;
	}

	public boolean delete(Users users) {
		// TODO Auto-generated method stub
		try () {
		session.getCurrentSession.delete(users);
		} catch(Exception e) {
			return false;
		}
		return rue;
	}

	public boolean saveOrUpdate(Users users) {
		// TODO Auto-generated method stub
		session.getCurrentSession.saveOrUpdate(users);
		return true;
	}

}
