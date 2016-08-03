package com.modjk.jbbs.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author gemzone (admin@modjk.com)
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<User, Long>
{
	/**
	 * 유저 검색
	 * @param name
	 * @return
	 */
	@Query(value = "SELECT TOP 1 * FROM [dbo].[jnk_user] WHERE name = :name", nativeQuery = true )
    public User findByName(@Param("name") String name);
	
	/**
	 * 유저 신규등록
	 * @param id
	 * @param password
	 * @param name
	 * @param email
	 * @param comment
	 * @return
	 */
	@Query(value = "INSERT INTO [dbo].[jnk_user] ([user_id], [group_id], [id], [password_sha2_512], [password_sha3], [name], [email], [level], [point], [comment], [is_superadmin]) "
			+ "VALUES ((SELECT (ISNULL(MAX([user_id]), 0) + 1) AS [user_id] "
			+ "FROM [dbo].[jnk_user]),0, :id ,HASHBYTES('SHA2_512' , :password ), NULL, :name, :email, 9, 0, :comment, 0)", 
			nativeQuery = true )
	public void create(@Param("id") String id,
			@Param("password") String password,
			@Param("name") String name,
			@Param("email") String email,
			@Param("email") String comment);
	
	
	/**
	 * 
	 * @param id
	 * @param password
	 * @return
	 */
	@Query(value = "SELECT TOP 1 * "  
			+ "FROM [dbo].[jnk_user] "
			+ "WHERE password_sha2_512 = HASHBYTES('SHA2_512' , :password) AND [id] = :id ", 
			nativeQuery = true)
	public User login(@Param("id") String id,
			@Param("password") String password);
	
	
	
	
	
	
	
	
	
	
}