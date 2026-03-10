package Task2;

public class Bishop extends Piece {
    public Bishop(String color){
        super(color);
    }

@Override
    public boolean isLegalMove(Position from, Position to) {
    int rowDiff = Math.abs(from.getRow() - to.getRow());
    int colDiff = Math.abs(from.getColumn() - to.getColumn());

    return rowDiff == colDiff && rowDiff != 0;
}
    
}
