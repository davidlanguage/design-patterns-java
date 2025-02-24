package org.example.behavioral_design_patterns.visitor;

public class PerformanceRating {

	private int id;
	
	private int personalRating;
	
	private int teamAverageRating;
	
	private int finalRating;

	public PerformanceRating(final int id, final int personalRating) {
		this.id = id;
		this.personalRating = personalRating;
	}
	
	public int getId() {
		return id;
	}

	public int getPersonalRating() {
		return personalRating;
	}

	public int getTeamAverageRating() {
		return teamAverageRating;
	}

	public int getFinalRating() {
		return finalRating;
	}

	public void setTeamAverageRating(final int teamAverageRating) {
		this.teamAverageRating = teamAverageRating;
	}

	public void setFinalRating(final int finalRating) {
		this.finalRating = finalRating;
	}
	
	
}
