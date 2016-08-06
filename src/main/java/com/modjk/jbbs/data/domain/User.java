package com.modjk.jbbs.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user")
public class User implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	private long userId;
	private int groupId;
	private String id;
	private byte[] passwordSha2512;
	private byte[] passwordSha3;
	private String name;
	private String email;
	private byte level;
	private int point;
	private String comment;
	private boolean isSuperadmin;
	private Date modificationTime;
	private Date registerTime;

	public User()
	{
	}

	public User(long userId, int groupId, String id, String name, String email, byte level, int point, String comment,
			boolean isSuperadmin)
	{
		this.userId = userId;
		this.groupId = groupId;
		this.id = id;
		this.name = name;
		this.email = email;
		this.level = level;
		this.point = point;
		this.comment = comment;
		this.isSuperadmin = isSuperadmin;
	}

	public User(long userId, int groupId, String id, byte[] passwordSha2512, byte[] passwordSha3, String name,
			String email, byte level, int point, String comment, boolean isSuperadmin, Date modificationTime,
			Date registerTime)
	{
		this.userId = userId;
		this.groupId = groupId;
		this.id = id;
		this.passwordSha2512 = passwordSha2512;
		this.passwordSha3 = passwordSha3;
		this.name = name;
		this.email = email;
		this.level = level;
		this.point = point;
		this.comment = comment;
		this.isSuperadmin = isSuperadmin;
		this.modificationTime = modificationTime;
		this.registerTime = registerTime;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false)
	public long getUserId()
	{
		return this.userId;
	}

	public void setUserId(long userId)
	{
		this.userId = userId;
	}

	@Column(name = "group_id", nullable = false)
	public int getGroupId()
	{
		return this.groupId;
	}

	public void setGroupId(int groupId)
	{
		this.groupId = groupId;
	}

	@Column(name = "id", nullable = false)
	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Column(name = "password_sha2_512")
	public byte[] getPasswordSha2512()
	{
		return this.passwordSha2512;
	}

	public void setPasswordSha2512(byte[] passwordSha2512)
	{
		this.passwordSha2512 = passwordSha2512;
	}

	@Column(name = "password_sha3")
	public byte[] getPasswordSha3()
	{
		return this.passwordSha3;
	}

	public void setPasswordSha3(byte[] passwordSha3)
	{
		this.passwordSha3 = passwordSha3;
	}

	@Column(name = "name", nullable = false)
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "email", nullable = false)
	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Column(name = "level", nullable = false)
	public byte getLevel()
	{
		return this.level;
	}

	public void setLevel(byte level)
	{
		this.level = level;
	}

	@Column(name = "point", nullable = false)
	public int getPoint()
	{
		return this.point;
	}

	public void setPoint(int point)
	{
		this.point = point;
	}

	@Column(name = "comment", nullable = false)
	public String getComment()
	{
		return this.comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	@Column(name = "is_superadmin", nullable = false)
	public boolean isIsSuperadmin()
	{
		return this.isSuperadmin;
	}

	public void setIsSuperadmin(boolean isSuperadmin)
	{
		this.isSuperadmin = isSuperadmin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modification_time", length = 23)
	public Date getModificationTime()
	{
		return this.modificationTime;
	}

	public void setModificationTime(Date modificationTime)
	{
		this.modificationTime = modificationTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_time", length = 23)
	public Date getRegisterTime()
	{
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime)
	{
		this.registerTime = registerTime;
	}

}
