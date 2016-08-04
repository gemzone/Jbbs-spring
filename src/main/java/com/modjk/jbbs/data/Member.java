package com.modjk.jbbs.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "member", schema="dbo")
public class Member implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "member_id", unique = true, nullable = false)
	public long memberId;
	
	@Column(name = "group_id", nullable = false)
	public int groupId;
	
	@Column(name = "id", nullable = false)
	public String id;
	
	@Column(name = "password_sha2_512")
	public byte[] passwordSha2512;
	
	@Column(name = "password_sha3")
	public byte[] passwordSha3;
	
	@Column(name = "name", nullable = false)
	public String name;
	
	@Column(name = "email", nullable = false)
	public String email;
	
	@Column(name = "level", nullable = false)
	public byte level;
	
	@Column(name = "point", nullable = false)
	public int point;
	
	@Column(name = "comment", nullable = false)
	public String comment;
	
	@Column(name = "is_superadmin", nullable = false)
	public boolean isSuperadmin;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modification_time", length = 23)
	public Date modificationTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_time", length = 23)
	public Date registerTime;
	
}
