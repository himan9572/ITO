package com.abc.MrBeanCar.dao;

import java.util.List;

import com.abc.MrBeanCar.model.BeanCar;

public interface BeanCarDao
{
	public List<BeanCar> getBeanCars();

	public void save(BeanCar car);

	public BeanCar findById(int carId);

	public void deleteById(int carId);

	public List<BeanCar> findByColor(String color);

	public List<BeanCar> findByDop(String date_of_purchase);

	public List<BeanCar> findByPrice(String price);

	public List<BeanCar> findByModel(String model);


}
