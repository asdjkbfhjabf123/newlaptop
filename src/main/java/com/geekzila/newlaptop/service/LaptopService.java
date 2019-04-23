package com.geekzila.newlaptop.service;

import java.util.List;

import com.geekzila.newlaptop.model.Laptop;

public interface LaptopService {

	public void add(Laptop laptop);

	public List<Laptop> findAll();

	public Laptop get(String name, String quality);

	public void delete(String name, String quality);

}
