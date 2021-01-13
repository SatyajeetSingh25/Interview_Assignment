package com.example.assignment.entitty;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Priority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int priority_id;

	@Column
	private String priority_Name;

	@Column
	@Min(1)
	@Max(5)
	private String priority_Satisfaction_Rating;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "priorities")
	private List<User> users;

	public Priority() {
		super();
	}

	public Priority(int priority_id, String priority_Name, @Min(1) @Max(5) String priority_Satisfaction_Rating,
			List<User> users) {
		super();
		this.priority_id = priority_id;
		this.priority_Name = priority_Name;
		this.priority_Satisfaction_Rating = priority_Satisfaction_Rating;
		this.users = users;
	}

	public int getPriority_id() {
		return priority_id;
	}

	public void setPriority_id(int priority_id) {
		this.priority_id = priority_id;
	}

	public String getPriority_Name() {
		return priority_Name;
	}

	public void setPriority_Name(String priority_Name) {
		this.priority_Name = priority_Name;
	}

	public String getPriority_Satisfaction_Rating() {
		return priority_Satisfaction_Rating;
	}

	public void setPriority_Satisfaction_Rating(String priority_Satisfaction_Rating) {
		this.priority_Satisfaction_Rating = priority_Satisfaction_Rating;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
