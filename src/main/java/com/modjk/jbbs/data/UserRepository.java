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
//	@Query("select user_id, group_id, id, password_sha2_512, password_sha3, name, email, level, point, comment, is_superadmin, register_time from dbo.jnk_user where user_id = ?1")
//	public User findByEmailAddress(Long user_id);
	
	
	  @Query("SELECT u FROM dbo.jnk_user u WHERE u.name = :name")
	  List<User> findByNameEndsWith(@Param("name") String name);
	
	
}	