package Task2;

public class Queen  extends Piece{
    public Queen(String color){
        super(color);
    }

@Override
    public boolean isLegalMove(Position from, Position to) {
    int rowDiff = Math.abs(from.getRow() - to.getRow());
    int colDiff = Math.abs(from.getColumn() - to.getColumn());

    if (rowDiff == 0 && colDiff == 0) {
        return false;
    }

    return from.getRow() == to.getRow() || from.getColumn() == to.getColumn() || rowDiff == colDiff;
}
    
}
