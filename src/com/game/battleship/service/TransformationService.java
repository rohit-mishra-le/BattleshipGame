package com.game.battleship.service;

import java.util.List;

import com.game.battleship.model.Battleship;

public interface TransformationService {
	List<Battleship> apply(List<Battleship> list);
}
