package com.akbas.springboot.PribasProject.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="moments")
public class Moments {

	@Id
	private int id;

	
	private String title;

	private String description;

	
	private String moment_date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

	
	private String creation_date;
	
	@ManyToOne
	private Timeline timeline;

//------------------------------------------------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
//------------------------------------------------------------------------------------------------------------------

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//------------------------------------------------------------------------------------------------------------------	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
//-----------------------------------------------------------------------------------------------------------------

	public String getMoment_date() {
		return moment_date;
	}

	public void setMoment_date(String moment_date) {
		this.moment_date = moment_date;
	}

//-----------------------------------------------------------------------------------------------------------------

	public String getCreationDate() {
		return creation_date;
	}

	public void setCreationDate(String creation_date) {
		if (creation_date.equals(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))) {
			this.creation_date = creation_date;
		}

		else {
			this.creation_date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}

	}

//----------------------------------------------------------------------------------------------------------------	

}