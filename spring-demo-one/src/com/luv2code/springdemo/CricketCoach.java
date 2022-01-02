package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for email address and team 
	private String emailAddress;
	private String team;
	
	//create no-arg constructor 
	public CricketCoach() {
		System.out.println("Cricketcoach: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCcoach: inside setter method - setFortuneService");
	}


	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAdress) {
		this.emailAddress = emailAdress;
		System.out.println("CricketCcoach: inside setter method - setEmailAddress");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCcoach: inside setter method - setTeam");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
