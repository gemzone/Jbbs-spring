/**
 * @author gemzone
 *
 */
package com.modjk.jbbs.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="jnk_user")
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	public long userId;
	
	@Column(name="group_id")
	public int groupId;
	
	@Column(name="id")
	public String id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="email")
	public String email;
	
	@Column(name="level")
	public short level;
	
	@Column(name="point")
	public int point;
	
	@Column(name="comment")
	public String comment;
	
	@Column(name="is_superadmin")
	public boolean isSuperadmin;

//	@Column(name = "creation_time", nullable = false)
//	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
//	private ZonedDateTime creationTime;
//
//
//	@Column(name = "modification_time")
//    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentZonedDateTime")
//    private ZonedDateTime modificationTime;
	
	
	@Column(name="register_time")
	@Temporal(TemporalType.TIMESTAMP)
	public Date registerTime;
}
