package com.linkia.jessica.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the options database table.
 * 
 */
@Entity
@Table(name="options")
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int optionID;

	private int optionGroupID;

	private String optionName;

	public Option() {
	}

	public int getOptionID() {
		return this.optionID;
	}

	public void setOptionID(int optionID) {
		this.optionID = optionID;
	}

	public int getOptionGroupID() {
		return this.optionGroupID;
	}

	public void setOptionGroupID(int optionGroupID) {
		this.optionGroupID = optionGroupID;
	}

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

}