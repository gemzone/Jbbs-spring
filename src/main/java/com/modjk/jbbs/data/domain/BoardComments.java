package com.modjk.jbbs.data.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="board_comments")
public class BoardComments  implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="comment_id", unique=true, nullable=false)
	private long commentId;
	
	@Column(name="post_id", nullable=false)
	private long postId;
	
	@Column(name="user_id", nullable=false)
	private long userId;
	
	@Column(name="password_sha2_512")
	private byte[] passwordSha2512;
	
	@Column(name="password_sha3")
	private byte[] passwordSha3;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="text", nullable=false)
	private String text;
	
	@Column(name="ip", nullable=false, length=16)
	private String ip;
	
	@Column(name="is_hide", nullable=false)
	private boolean isHide;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="register_time", length=23)
	private Date registerTime;

}
