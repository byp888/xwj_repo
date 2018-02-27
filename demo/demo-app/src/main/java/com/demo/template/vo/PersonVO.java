package com.demo.template.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class PersonVO implements Serializable {

	private static final long serialVersionUID = 3065563830936812151L;
	
	@ApiModelProperty(value = "名", required = true)
	private String firstName;
	
	@ApiModelProperty(value = "姓", required = true)
    private String lastName;
    
    public PersonVO() {}

	public PersonVO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "PersonVO [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
}
