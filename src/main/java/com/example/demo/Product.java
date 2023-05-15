package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pro_id;
	private String pro_code;
	private String pro_name;
	private String pro_brand;
	private String pro_price;
	private String pro_about;
	private String sell_date;
	
//	String pattern = "dd/MM/yyyy";
//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//	String date = simpleDateFormat.format(new Date());

//	private Date timestamp = new Date(System.currentTimeMillis());
	
}
