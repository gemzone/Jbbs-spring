package com.modjk.jbbs.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.modjk.jbbs.data.domain.User;

/**
 * @author gemzone (admin@modjk.com)
 * @version 1.0
 */

public interface UserJpaRepository extends JpaRepository<User, Long>
{
	// @Query(value = "SELECT TOP 1 * FROM [dbo].[user] WHERE name = :name", nativeQuery = true )
    public User findByName(@Param("name") String name);
	

    @Query(value = "SELECT (ISNULL(MAX([user_id]), 0) + 1) FROM [dbo].[user]", nativeQuery = true )
    public long getNewIdentity();
    
    
}