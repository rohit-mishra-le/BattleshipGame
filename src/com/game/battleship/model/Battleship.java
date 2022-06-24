package com.game.battleship.model;

import java.util.Objects;

public class Battleship {
	private String teamName;
	private int sectorX;
	private int sectorY;
	public Battleship(String teamName, int sectorX, int sectorY) {
		super();
		this.teamName = teamName;
		this.sectorX = sectorX;
		this.sectorY = sectorY;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getSectorX() {
		return sectorX;
	}
	public void setSectorX(int sectorX) {
		this.sectorX = sectorX;
	}
	public int getSectorY() {
		return sectorY;
	}
	public void setSectorY(int sectorY) {
		this.sectorY = sectorY;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sectorX, sectorY);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Battleship other = (Battleship) obj;
		return sectorX == other.sectorX && sectorY == other.sectorY;
	}
	
}
