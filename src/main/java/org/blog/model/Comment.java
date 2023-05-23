package org.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Comment {

	@Id
	private long commentId;
	
	@Column(length = 500, updatable = true, nullable = false)
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "postId")
	private Post post;
	
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;


	public long getCommentId() {
		return commentId;
	}


	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Post getPost() {
		return post;
	}


	public void setPost(Post post) {
		this.post = post;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}