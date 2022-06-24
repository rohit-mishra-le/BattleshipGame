package com.game.battleship;

import java.util.Arrays;
import java.util.List;

import com.game.battleship.model.Battleship;
import com.game.battleship.service.BattleshipPositionMapService;
import com.game.battleship.service.BattleshipPrintService;
import com.game.battleship.service.PositionMapService;
import com.game.battleship.service.PrintService;
import com.game.battleship.service.TeamTransformationService;
import com.game.battleship.service.TransformationService;

public class GameConsole {

	public static void main(String[] args) {
		List<Battleship> list = Arrays.asList(
				new Battleship("A", 3, 5),
				new Battleship("Z", 7, 1),
				new Battleship("Z", 4, 4),
				new Battleship("A", 2, 6)
				);
		PositionMapService mapService = new BattleshipPositionMapService();
		TransformationService transformService = new TeamTransformationService();
		PrintService printService = new BattleshipPrintService();
		list = transformService.apply(list);
		String[][] positionMap = mapService.getPositionMap(list);
		printService.print(positionMap);
	}

}
