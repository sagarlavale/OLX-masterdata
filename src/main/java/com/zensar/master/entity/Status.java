package com.zensar.master.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Status")
@Table(name = "status")
public class Status extends BaseEntity{
	
	@Column(name = "status")
	private String status;

}
