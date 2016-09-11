package com.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(value="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
    private String userName;
	@Column(name="email")
    private String email;
}
}
        public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
