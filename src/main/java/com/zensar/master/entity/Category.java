package com.zensar.master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Category")
@Table(name = "categories")
public class Category extends BaseEntity{
	
	@Column(name = "category")
	private String category;
}
