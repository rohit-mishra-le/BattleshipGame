package com.game.battleship.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.game.battleship.model.Battleship;

public class BattleshipPositionMapService implements PositionMapService{

	@Override
	public String[][] getPositionMap(List<Battleship> list) {
		int maxX = list.stream().max(Comparator.comparing(Battleship::getSectorX)).get().getSectorX();
		int maxY = list.stream().max(Comparator.comparing(Battleship::getSectorY)).get().getSectorY();
		String[][] positionMap = new String[maxY][maxX];
		Arrays.stream(positionMap).forEach(a -> Arrays.fill(a, " "));
		list.stream().forEach(element ->{
			positionMap[element.getSectorY()-1][element.getSectorX()-1] = element.getTeamName();
		});
		return positionMap;
	}

}
