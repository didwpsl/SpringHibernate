package com.luv2code.springdemo;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneSevice) {
		this.fortuneService = fortuneSevice;
	}

	public TrackCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		return "Run a hrad 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It " + fortuneService.getFortune();
	}
	
}
