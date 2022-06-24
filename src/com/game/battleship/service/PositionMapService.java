package com.game.battleship.service;

import java.util.List;

import com.game.battleship.model.Battleship;

public interface PositionMapService {
	String[][] getPositionMap(List<Battleship> list);
}
