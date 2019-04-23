package com.geekzila.newlaptop.model;

public class Laptop {
	public String name;
	public String quality;

	public Laptop(String name, String quality) {
		this.name = name;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
}
