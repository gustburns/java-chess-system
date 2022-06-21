package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;

	protected Position toPosition() {
		Position position = new Position(row, column);
		return position;
	}

	protected static ChessPosition fromPosition(Position position) {
		ChessPosition chessPosition = new ChessPosition();
		return chessPosition;
	}
}