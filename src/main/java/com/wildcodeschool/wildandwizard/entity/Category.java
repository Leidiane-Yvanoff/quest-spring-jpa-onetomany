package com.wildcodeschool.wildandwizard.entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	
	 @OneToMany(mappedBy = "category")
	 private List<Potion> potions;
	
	
	//constructor
	public Category () {
		
	}
	
	//getter and setter
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}

	public List<Potion> getPotions() {
		return potions;
	}

	public void setPotions(List<Potion> potions) {
		this.potions = potions;
	}

}
