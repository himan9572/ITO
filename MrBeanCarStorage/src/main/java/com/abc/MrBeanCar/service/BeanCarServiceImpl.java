package com.abc.MrBeanCar.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.MrBeanCar.dao.BeanCarDao;
import com.abc.MrBeanCar.model.BeanCar;

@Service
public class BeanCarServiceImpl implements BeanCarService
{ 
	@Autowired
	private BeanCarDao beancardao;
	
	@Override
	@Transactional
	public List<BeanCar> getBeanCars() {
		return beancardao.getBeanCars();
	}

	@Override
	@Transactional
	public void save(BeanCar beancar) {
		beancardao.save(beancar);
		
	}

	@Override
	@Transactional
	public BeanCar findById(int carId) {
		
	 return beancardao.findById(carId);
	}

	@Override
	@Transactional
	public void deleteById(int carId) {
		beancardao.deleteById(carId);
		
	}

	@Override
	@Transactional
	public List<BeanCar> findByColor(String color) {
		
		return beancardao.findByColor(color);
	}

	@Override
	@Transactional
	public List<BeanCar> findByDop(String date_of_purchase) {
		
		return beancardao.findByDop(date_of_purchase);
	}

	@Override
	@Transactional
	public List<BeanCar> findByPrice(String price) {
		
		return beancardao.findByPrice(price);
	}

	@Override
	@Transactional
	public List<BeanCar> findByModel(String model) {
		
		return beancardao.findByModel(model);
	}

}
  