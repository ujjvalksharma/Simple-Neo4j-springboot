package com.example.simpleneo4japp.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Comment {

    @GraphId
    private Long id;
    private String content;
    
    Comment(){
    	
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + "]";
	}
    
    

}
