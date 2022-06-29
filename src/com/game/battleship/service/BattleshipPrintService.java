package com.game.battleship.service;

import java.util.Arrays;

import com.game.battleship.util.MatrixUtil;

public class BattleshipPrintService implements PrintService{

	@Override
	public void print(String[][] positionMap) {
		MatrixUtil.reverse(positionMap);
		String[] rowSeparator = {""};
		String[] output = {""};
		int index[] = {positionMap[0].length};
		for(int i=0; i<positionMap[0].length; i++)
			rowSeparator[0]+= "+---";
		rowSeparator[0]+="+\n";
		output[0]+=rowSeparator[0];
		Arrays.stream(positionMap).forEach(row ->{
			index[0]--;
			Arrays.stream(row).forEach(column ->{
				output[0]+="| "+ column +" ";
			});
			output[0]+="| "+ index[0]+ "\n"+ rowSeparator[0];
		});
		rowSeparator[0] = "";
		for(int i=positionMap[0].length; i>0; i--) {
			output[0]+= "  "+ i +" ";
		}
		System.out.print(output[0]);
	}

}
