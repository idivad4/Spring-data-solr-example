package com.mscharhag.solr.document;

import java.util.List;

import org.apache.solr.client.solrj.beans.Field;

public class FileIndex {
	
    @Field
    private String id;

    @Field
    private String name;
    
    @Field
    private String description;

    @Field
    private String path;
    
    @Field
    private String zippath;
    
    @Field
    private String content;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String title) {
		this.name = title;
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getZippath() {
		return zippath;
	}

	public void setZippath(String zippath) {
		this.zippath = zippath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "File [path=" + path + ", name=" + name + "]";
		
	}
}
