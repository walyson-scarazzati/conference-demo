package com.pluralsight.conferencedemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name= "sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long session_id;
	private String session_name;
	private String session_description;
	private String session_lenght;
	
	@ManyToMany
	@JoinTable(name = "session_speakers",
	joinColumns = @JoinColumn(name= "session_id"),
	inverseJoinColumns = @JoinColumn(name = "speaker_id"))
	private List<Speaker> speakers;
	
	public Session() {
		super();
	}
	
	public Session(Long session_id, String session_name, String session_description, String session_lenght) {
		super();
		this.session_id = session_id;
		this.session_name = session_name;
		this.session_description = session_description;
		this.session_lenght = session_lenght;
	}



	public Long getSession_id() {
		return session_id;
	}
	public void setSession_id(Long session_id) {
		this.session_id = session_id;
	}
	public String getSession_name() {
		return session_name;
	}
	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}
	public String getSession_description() {
		return session_description;
	}
	public void setSession_description(String session_description) {
		this.session_description = session_description;
	}
	public String getSession_lenght() {
		return session_lenght;
	}
	public void setSession_lenght(String session_lenght) {
		this.session_lenght = session_lenght;
	}
	
	
}

