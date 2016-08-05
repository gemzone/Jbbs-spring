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
@Table(name="board_posts")
public class BoardPosts  implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id 
    @Column(name="post_id", unique=true, nullable=false)
	public long postId;
	
	@Column(name="user_id", nullable=false)
	public long userId;
	
	@Column(name="password_sha2_512")
	public byte[] passwordSha2512;
	
	@Column(name="password_sha3")
	public byte[] passwordSha3;
	
	@Column(name="name", nullable=false)
	public String name;
	
	@Column(name="title", nullable=false)
	public String title;
	
	@Column(name="text", nullable=false)
	public String text;
	
	@Column(name="file1", nullable=false)
	public String file1;
	
	@Column(name="file2", nullable=false)
	public String file2;
	
	@Column(name="link1", nullable=false)
	public String link1;
	
	@Column(name="link2", nullable=false)
	public String link2;
	
	@Column(name="ip", nullable=false, length=16)
	public String ip;
	
	@Column(name="hit_count", nullable=false)
	public int hitCount;
	
	@Column(name="comment_count", nullable=false)
	public int commentCount;
	
	@Column(name="is_hide", nullable=false)
	public boolean isHide;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="modification_time", length=23)
	public Date modificationTime;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name="register_time", length=23)
	public Date registerTime;

    

    


}
