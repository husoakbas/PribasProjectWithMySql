package com.akbas.springboot.PribasProject.Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "timeline")
public class Timeline {

	@Id
	@GeneratedValue // id'yi otomatik üretir.
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "creation_date")
	private String creationDate;

//------------------------------------------------------------------------------------------------------------------------------------------	

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	/*
	 * FetchType: aralarında ilişki bulunan entity'lerden birinin yüklenme durumunda
	 * diğerinin durumunu tanıtmaya yarar timeline entity'si yüklendiğinde user'da
	 * yüklensin istiyorsak EAGER istemiyorsak LAZY
	 * 
	 * Cascade: aralarında ilişki bulunan iki objeden ana obje üzerinde bir
	 * değişiklik işlemi yaptığımız zaman ilişkili obje üzerinde de aynı işlemi
	 * yapmaya olanak sağlar
	 */

	@JoinColumn(name = "user_id", referencedColumnName = "id")  // timeline tablosu user tablosu ile user id üzerinden
																// join edilecek, özetle user_id timeline tablosunun
																// foreign key'i.
	private Users user;

//------------------------------------------------------------------------------------------------------------------------------------------

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "tags_id", referencedColumnName = "id")
	private Tags tag;

//-----------------------------------------------------------------------------------------------------------------------------------------	

	@OneToMany(targetEntity = Moments.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "timeline_id", referencedColumnName = "id")
	private List<Moments> moments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		if (creationDate.equals(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")))) {
			this.creationDate = creationDate;
		}

		else {
			this.creationDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		}
		/*
		 * insert ve update yaparken local tarihi girdiysen sorun yok, farkında olmadan
		 * yada bilerek o gününün tarihinden farklı bir tarih girdiysen kontrole girer
		 * ve doğru tarihi atar.
		 */

	}

	public Tags getTag() {
		return tag;
	}

	public void setTag(Tags tag) {
		this.tag = tag;
	}

	public List<Moments> getMoments() {
		return moments;
	}

	public void setMoments(List<Moments> moments) {
		this.moments = moments;
	}

}
