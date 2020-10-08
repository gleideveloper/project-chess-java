package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'A' || column > 'H' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values from A1 to H8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    /** matrix_row =  8 - chess_row
     * 8 - 8 = 0
     * 8 - 7 = 1
     * 8 - 6 = 2
     * ...
     * matrix_column =  chess_column - 'A'
     * A = 0
     * B = 1
     * C = 2
     * ...
     * 'A' - 'A' = 0
     * 'B' - 'A' = 1
     * 'C' - 'A' = 2
     */
    protected Position toPosition(){
        return new Position(8 - row, column - 'A');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('A' - position.getColumn()), (8 - position.getRow()));
    }

    @Override
    public String toString() {
        return "ChessPosition{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }
}
