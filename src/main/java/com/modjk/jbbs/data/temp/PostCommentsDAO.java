package com.modjk.jbbs.data.temp;

import java.util.List;

import javax.sql.DataSource;

public interface PostCommentsDAO
{
	public void setDataSource(DataSource ds);
	   
	   public long create(Long postId, Long userId, String name, String text);
	   
	   public List<PostComments> list(Long postId);
	   
	   public void delete(Long commentId);
	   
	   public void update(Long commentId, Long postId, Long userId, String name, String text);
}
