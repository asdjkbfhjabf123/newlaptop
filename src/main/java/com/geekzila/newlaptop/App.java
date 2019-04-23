package com.geekzila.newlaptop;

import java.util.List;

import com.geekzila.newlaptop.model.Laptop;
import com.geekzila.newlaptop.service.LaptopService;
import com.geekzila.newlaptop.service.impl.LaptopServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LaptopService laptopService = new LaptopServiceImpl();

		List<Laptop> laptops = laptopService.findAll();

		for (int i = 0; i < laptops.size(); i++) {
			Laptop laptop = laptops.get(i);

			System.out.println("Laptop name: " + laptop.getName() + " and the quality: " + laptop.getQuality());
		}

		System.out.println("A new brand laptop with quality is given below");

		Laptop lenovo = new Laptop("Lenovo", "cool");
		lenovo.getName();
		System.out.println("Brand: " + lenovo.getName() + ", Quality: " + lenovo.getQuality());

		laptopService.delete("Acer", "average");

		for (int i = 0; i < laptops.size(); i++) {
			Laptop laptop = laptops.remove(i);
			System.out.println("Lower is removed successfully " + laptop.getName() + "-" + laptop.getQuality());
		}

	}
}
