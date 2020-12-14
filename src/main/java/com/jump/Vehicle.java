package com.jump;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Vehicle implements Serializable {

	private static final long serialVersionUID = -8495512695594854131L;
	
		@Id
		private String vin;
		private String brand;
		private String model;
		private Integer year;
		private Integer mileage;
		private String color;
		
		//added later Bimala 
		private Integer customerId;

}
