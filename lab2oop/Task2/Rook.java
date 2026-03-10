package Task2;

public class Rook extends Piece{
    public Rook(String color){
        super(color);
    }

    @Override
    public boolean isLegalMove(Position from, Position to){
        return from.getRow() == to.getRow() || from.getColumn() == to.getColumn();
    }
}
