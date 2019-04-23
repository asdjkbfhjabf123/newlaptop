package com.geekzila.newlaptop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.newlaptop.model.Laptop;
import com.geekzila.newlaptop.service.LaptopService;

public class LaptopServiceImpl implements LaptopService {

	public List<Laptop> laptops = new ArrayList<Laptop>();

	public LaptopServiceImpl() {

		laptops.add(new Laptop("Acer", "average"));
		laptops.add(new Laptop("hp", "good"));

	}

	public List<Laptop> findAll() {
		return laptops;
	}

	public Laptop get(String name, String quality) {
		for (Laptop laptop : laptops) {
			if (laptop.getName().equals(name) && laptop.getQuality().equals(quality)) {

				return laptop;

			}
		}
		return null;
	}

	public void delete(String name, String quality) {
		Laptop laptopFromDb = get(name, quality);
		laptops.remove(laptopFromDb);
	}

	public void add(Laptop laptop) {
		// TODO Auto-generated method stub

		laptops.add(laptop);

	}
}
