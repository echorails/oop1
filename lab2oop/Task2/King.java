package Task2;

public class King extends Piece {
    public King(String color){
        super(color);
    }

    @Override
    public boolean isLegalMove(Position from, Position to){
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        int colDiff = Math.abs(from.getColumn() - to.getColumn());

    return rowDiff <= 1 && colDiff <= 1 && !(rowDiff == 0 && colDiff == 0);
    }
}
