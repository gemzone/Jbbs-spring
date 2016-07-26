package com.modjk.jbbs.data.temp;

import java.util.List;

import javax.sql.DataSource;

import com.modjk.jbbs.data.User;

public interface UserDAO
{
	public void setDataSource(DataSource ds);
	   
	   public long create(String id, String password, String name, String email, String comment);
	   
	   public User get(Long userId);
	   
	   public User login(String id, String password);
	   
	   public List<User> list();
	   
	   public void delete(Integer id);
	   
	   public void update(Integer id, Integer age);
}
