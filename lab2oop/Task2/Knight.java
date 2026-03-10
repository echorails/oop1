package Task2;

public class Knight extends Piece{
    public Knight(String color){
        super(color);
    }

@Override
    public boolean isLegalMove(Position from, Position to) {
    int rowDiff = Math.abs(from.getRow() - to.getRow());
    int colDiff = Math.abs(from.getColumn() - to.getColumn());

    return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
}
    
}
