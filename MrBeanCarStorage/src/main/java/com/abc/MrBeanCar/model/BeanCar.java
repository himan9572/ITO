package com.abc.MrBeanCar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="beancar")
public class BeanCar 
{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private int model;
	@Column
	private String company;
	@Column
	private String color;
	@Column
	private int date_of_purchase;
	@Column
	private int price;
	@Column
	private int engine_capacity;
	@Column
	private String licence_plate_number;
	@Column
	private int seating_capacity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDate_of_purchase() {
		return date_of_purchase;
	}
	public void setDate_of_purchase(int date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public String getLicence_plate_number() {
		return licence_plate_number;
	}
	public void setLicence_plate_number(String licence_plate_number) {
		this.licence_plate_number = licence_plate_number;
	}
	public int getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	@Override
	public String toString() {
		return "BeanCar [id=" + id + ", model=" + model + ", company=" + company + ", color=" + color
				+ ", date_of_purchase=" + date_of_purchase + ", price=" + price + ", engine_capacity=" + engine_capacity
				+ ", licence_plate_number=" + licence_plate_number + ", seating_capacity=" + seating_capacity + "]";
	}
	
	
	
	

}
