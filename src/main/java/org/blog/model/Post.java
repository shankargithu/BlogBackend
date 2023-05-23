package org.blog.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Entity
@Data
public class Post {
	
	@Id
	private long postId;
	
	@Column(length = 50, nullable = false, updatable = true)
	private String postTitle;
	
	@CreationTimestamp
	private Date postCreation;
	
	@UpdateTimestamp
	private Date postUpdation;
	
	@Column(length = 400, nullable = false, updatable = true)
	private String postContent;
	
	@Column(nullable = false)
	@Lob //learge object
	private byte[] postImage;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="categoryId")
	private Category category;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="userId")
	private User user;

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public Date getPostCreation() {
		return postCreation;
	}

	public void setPostCreation(Date postCreation) {
		this.postCreation = postCreation;
	}

	public Date getPostUpdation() {
		return postUpdation;
	}

	public void setPostUpdation(Date postUpdation) {
		this.postUpdation = postUpdation;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public byte[] getPostImage() {
		return postImage;
	}

	public void setPostImage(byte[] postImage) {
		this.postImage = postImage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
