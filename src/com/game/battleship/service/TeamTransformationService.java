package com.game.battleship.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.game.battleship.model.Battleship;

public class TeamTransformationService implements TransformationService{

	@Override
	public List<Battleship> apply(List<Battleship> list) {
		list.stream().forEach(element ->{
			getNeighbours(element).stream().forEach(neighbour ->{
				int index = list.indexOf(neighbour);
				if(list.contains(neighbour)) {
					neighbour.setTeamName(list.get(index).getTeamName());
					if(!neighbour.getTeamName().equals(element.getTeamName())) {
						neighbour.setTeamName(neighbour.getTeamName().toLowerCase());
						list.set(index, neighbour);
					}
				}
			});
		});
		return list;
	}
	List<Battleship> getNeighbours(Battleship currentTeam){
		List<Battleship> neighbours = new ArrayList<>();
		List<Integer> xVals = Arrays.asList(-1,0,1);
		List<Integer> yVals = Arrays.asList(-1,0,1);
		for(Integer x2:xVals) {
			for(Integer y2:yVals) {
				neighbours.add(new Battleship(currentTeam.getTeamName(), currentTeam.getSectorX()+x2, currentTeam.getSectorY()+y2));
			}
		}
		return neighbours;
	}
}
