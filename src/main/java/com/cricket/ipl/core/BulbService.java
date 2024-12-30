package com.cricket.ipl.core;

import lombok.Data;

@Data
public class BulbService {
	private Bulb bulb;		
	
	public String askbulb() {
		return bulb.getbulb();
		
	}
	public Bulb getBulb() {
		return bulb;
		
	}
	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

}
