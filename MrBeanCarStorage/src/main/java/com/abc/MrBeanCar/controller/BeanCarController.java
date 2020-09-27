package com.abc.MrBeanCar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abc.MrBeanCar.model.BeanCar;
import com.abc.MrBeanCar.service.BeanCarService;

@Controller
@RequestMapping("/")
public class BeanCarController
{
	@Autowired
	private BeanCarService beancarservice;
	
	@RequestMapping("/")
	public String login() {
		return "header";
	}
	@RequestMapping("/list")
	public String listBeanCars(Model model) {
		model.addAttribute("beancars", beancarservice.getBeanCars());
		return "show";	
	}
	@RequestMapping("/showForm")
	public String showFormAdd(Model model) {
		model.addAttribute("beancar", new BeanCar());
		return "add";
	}
	@RequestMapping("/addCar")
	public String addCar( @ModelAttribute("beancar") BeanCar beancar) {
		beancarservice.save(beancar);
		return  "redirect:/list";
	}
	@RequestMapping("/updateForm")
	public String updateForm(@RequestParam("CarId") String id, Model model) {
		int carId = Integer.parseInt(id);
		BeanCar beancar = beancarservice.findById(carId);
		model.addAttribute("beancar", beancar);
		return "add";
	}
	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("CarId") String id, Model model) {
		int carId=Integer.parseInt(id);
		beancarservice.deleteById(carId);
		return "redirect:/list";
	}
	@RequestMapping("/searchCar")
	public String searchCar(Model model) {
		model.addAttribute("beancar", new BeanCar());
		return "search";
	}
	@RequestMapping("/searchColor")
	public String searchColor(@RequestParam("color") String color,Model model) {
		List<BeanCar> result=beancarservice.findByColor(color);
		System.out.println(result);
		model.addAttribute("beancars", result);
		return "test";
	}
	@RequestMapping("/searchDop")
	public String searchDop(@RequestParam("date_of_purchase") String date_of_purchase,Model model) {
		List<BeanCar> result=beancarservice.findByDop(date_of_purchase);
		System.out.println(result);
		model.addAttribute("beancars", result);
		return "test";
	}
	@RequestMapping("/searchPrice")
	public String searchPrice(@RequestParam("price") String price,Model model) {
		List<BeanCar> result=beancarservice.findByPrice(price);
		System.out.println(result);
		model.addAttribute("beancars", result);
		return "test";
	}
	@RequestMapping("/searchModel")
	public String searchModel(@RequestParam("model") String model,Model model1) {
		List<BeanCar> result=beancarservice.findByModel(model);
		System.out.println(result);
		model1.addAttribute("beancars", result);
		return "test";
	}
	

}
