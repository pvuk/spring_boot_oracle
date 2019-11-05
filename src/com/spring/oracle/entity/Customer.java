package com.spring.oracle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.spring.oracle.ann.NicePropertyName;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@Column(name = "customer_id")
//	@GeneratedValue(generator = "customerSequence")
//	@SequenceGenerator(name = "customerSequence", sequenceName = "customer_seq")
	private Long id;
	
	@NotNull
	@NotEmpty
	@Size(max = 80)
	private String commonName;

	// @Pattern(regexp = "^[a-zA-Z0-9][a-zA-Z0-9\\s]*", message = ErrorMessages.SPECIAL_CHARACTERS_NOT_ALLOWED)
	@NotNull
	@NotEmpty
	@Size(max = 80)
	private String legalName;
	
	@NotNull
	@NotEmpty
	// @Pattern(
	// regexp = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$|^(\\d{3})[\\.](\\d{3})[\\.](\\d{4})$",
	// message = "Invalid Phone")
	@Size(max = 50)
	private String phone;
	
	@Size(max = 2000)
	@NicePropertyName("Comments")
	private String statusComment;
}
