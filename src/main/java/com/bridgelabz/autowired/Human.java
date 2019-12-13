package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;

	public Human() {

	}

	public Human(Heart heart) {
		super(); // constructor injection
		this.heart = heart;
	}

	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("the name of the animal " + heart.getNameOfAnimal() + " and " + "no of heart is:"
					+ heart.getNoOfHeart());
		} else {
			System.out.println("not pumping");
		}
	}

}
