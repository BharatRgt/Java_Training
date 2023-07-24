package com.messaging;

import java.time.LocalDateTime;

public class Tweet {
	private Integer id;
	
	private String content;
	
	private String author;
	
	private LocalDateTime timeStamp;
	
	
	
	public Tweet(Integer id, String content, String author, LocalDateTime timeStamp) {
		super();
		this.id = id;
		this.content = content;
		this.author = author;
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Tweet [content=" + content + ", timeStamp=" + timeStamp + "]";
	}

	public String reTweet() {
		return null;
	}
	
	public String like() {
		return null;
	}
	
	public String reply() {
		return null;
	}
}
