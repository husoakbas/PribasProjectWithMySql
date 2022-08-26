package com.akbas.springboot.PribasProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tags {

	@Id
	private int id;

	@Column(name = "name_one")
	private String nameOne;

	@Column(name = "name_two")
	private String nameTwo;

	@Column(name = "name_three")
	private String nameThree;

	/*
	 * @OneToOne private Timeline timeline;
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_one() {
		return nameOne;
	}

	public void setName_one(String name_one) {
		this.nameOne = name_one;
	}

	public String getName_two() {
		return nameTwo;
	}

	public void setName_two(String name_two) {
		this.nameTwo = name_two;
	}

	public String getName_three() {
		return nameThree;
	}

	public void setName_three(String name_three) {
		this.nameThree = name_three;
	}

}
