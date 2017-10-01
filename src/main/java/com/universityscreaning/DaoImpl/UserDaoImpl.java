package com.universityscreaning.DaoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.universityscreaning.Dao.UserDao;
import com.universityscreaning.RowMappers.UserRowMapper;
import com.universityscreaning.model.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	DataSource ds;
	@Override
	public void setDataSource() {
		
		jdbctemplate=new JdbcTemplate(ds);

	}

	@Override
	public boolean createUser(User usr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User usr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User usr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		String sql="SELECT * from user ";
		List<User> usrList=jdbctemplate.query(sql, new UserRowMapper());
		for(User user:usrList)
		{
			System.out.println("Here-------- "+user);
		}
		return usrList;
	}

}
