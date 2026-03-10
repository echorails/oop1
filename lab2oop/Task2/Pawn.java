package Task2;

public class Pawn extends Piece{
    public Pawn(String color){
        super(color);
    }

@Override
    public boolean isLegalMove(Position from, Position to) {
    int rowDiff = to.getRow() - from.getRow();
    int colDiff = to.getColumn() - from.getColumn();

    if (getColor().equalsIgnoreCase("white")) {
        return rowDiff == 1 && colDiff == 0;
    } else if (getColor().equalsIgnoreCase("black")) {
        return rowDiff == -1 && colDiff == 0;
    }

    return false;
}
    


}
