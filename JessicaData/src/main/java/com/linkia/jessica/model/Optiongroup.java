package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the optiongroups database table.
 * 
 */
@Entity
@Table(name="optiongroups")
@NamedQuery(name="Optiongroup.findAll", query="SELECT o FROM Optiongroup o")
public class Optiongroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int optionGroupID;

	private String optionGroupName;

	public Optiongroup() {
	}

	public int getOptionGroupID() {
		return this.optionGroupID;
	}

	public void setOptionGroupID(int optionGroupID) {
		this.optionGroupID = optionGroupID;
	}

	public String getOptionGroupName() {
		return this.optionGroupName;
	}

	public void setOptionGroupName(String optionGroupName) {
		this.optionGroupName = optionGroupName;
	}

}