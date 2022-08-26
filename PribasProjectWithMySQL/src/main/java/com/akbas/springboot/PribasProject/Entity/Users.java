package com.akbas.springboot.PribasProject.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Users {

	@Id
	private int id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
	private Timeline timeline;
	
	/* mappedBy: ilişkinin hangi tablo üzerinde tutulacağını söyler burada User classı içinde 
	 * Timeline'dan timeline objesi oluşturuldu, bunun üstünde mappedBy= user objesi verildi bu da ilişkinin 
	 * Timeline üzerinde tutulacağını belirtti. timeline user'ı sırtlamış öyle akılda tut !!!
	 */

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
