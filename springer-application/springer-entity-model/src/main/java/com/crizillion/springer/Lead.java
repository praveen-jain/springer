package com.crizillion.springer;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Lead {
	
	@Id
	private Long id; 
	private String column;

}
