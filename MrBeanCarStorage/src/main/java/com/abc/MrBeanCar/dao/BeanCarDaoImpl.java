package com.abc.MrBeanCar.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.abc.MrBeanCar.model.BeanCar;

@Repository
public class BeanCarDaoImpl implements BeanCarDao
{
	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public List<BeanCar> getBeanCars() {
		
		Session session=entitymanager.unwrap(Session.class);
		List<BeanCar> beancars=session.createQuery("from BeanCar ",BeanCar.class).getResultList();
		return beancars;
	}
	@Override
	public void save(BeanCar beancar) {
		
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(beancar);
	}
	@Override
	public BeanCar findById(int carId) {
	
		Session session = entitymanager.unwrap(Session.class);
		return session.get(BeanCar.class, carId);
	}
	@Override
	public void deleteById(int carId) {
		
		Session session = entitymanager.unwrap(Session.class);
		session.createQuery("delete from BeanCar where id=:id").setParameter("id", carId).executeUpdate();
	}
	@Override
	public List<BeanCar> findByColor(String color) {
	
		Session session = entitymanager.unwrap(Session.class);
	      Query query = session.createQuery("FROM BeanCar e WHERE e.color = :color");
	      query.setParameter("color", color);
	      List<BeanCar> results = query.getResultList();
		System.out.println(results);
		return results;
	}
	@Override
	public List<BeanCar> findByDop(String date_of_purchase) {
		
		Session session = entitymanager.unwrap(Session.class);
	      Query query = session.createQuery("FROM BeanCar e WHERE e.date_of_purchase = :date_of_purchase");
	      query.setParameter("date_of_purchase", date_of_purchase);
	      List<BeanCar> results = query.getResultList();
		System.out.println(results);
		return results;
	}
	@Override
	public List<BeanCar> findByPrice(String price) {
	
		Session session = entitymanager.unwrap(Session.class);
	      Query query = session.createQuery("FROM BeanCar e WHERE e.price = :price");
	      query.setParameter("price", price);
	      List<BeanCar> results = query.getResultList();
		System.out.println(results);
		return results;
	}
	@Override
	public List<BeanCar> findByModel(String model) {
		
		Session session = entitymanager.unwrap(Session.class);
	      Query query = session.createQuery("FROM BeanCar e WHERE e.model = :model");
	      query.setParameter("model", model);
	      List<BeanCar> results = query.getResultList();
		System.out.println(results);
		return results;
	}

}
