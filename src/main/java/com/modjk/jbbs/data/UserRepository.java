/**
 * @author Jung Seong Hun
 *
 */
package com.modjk.jbbs.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>
{
	@Query(value = "SELECT TOP 1 * FROM [dbo].[jnk_user] WHERE name = :name", nativeQuery = true )
    public User findByName(@Param("name") String name);
	
	
	@Query(value = "INSERT INTO [dbo].[jnk_user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin]) "
			+ "VALUES ((SELECT (ISNULL(MAX([user_id]), 0) + 1) AS [user_id] "
			+ "FROM [dbo].[jnk_user]),0, :id ,HASHBYTES('SHA2_512' , CONVERT(NVARCHAR, :password ) ), NULL, :name, :email, 9, 0, :comment, 0)", 
			nativeQuery = true )
	public User create(@Param("id") String id,
			@Param("password") String password,
			@Param("name") String name,
			@Param("email") String email,
			@Param("email") String comment);
	
	
	@Query(value = "SELECT TOP 1 [user_id] "  
			+ "FROM [Jbbs].[dbo].[jnk_user] "
			+ "WHERE password_sha2_512 = HASHBYTES('SHA2_512' , CONVERT(NVARCHAR, N':id')) AND [id] = N':password' ", 
			nativeQuery = true)
	public User login(@Param("id") String id,
			@Param("password") String password);
	
	
	
}