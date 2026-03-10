package Task2;

public class Main {
    public static void main(String[] args) {

        Piece rook = new Rook("white");
        Piece bishop = new Bishop("white");
        Piece queen = new Queen("black");
        Piece king = new King("white");
        Piece knight = new Knight("black");
        Piece pawnWhite = new Pawn("white");
        Piece pawnBlack = new Pawn("black");

        System.out.println("ROOK");
        System.out.println(rook.isLegalMove(new Position(2, 2), new Position(2, 7)));
        System.out.println(rook.isLegalMove(new Position(2, 2), new Position(5, 5)));

        System.out.println();

        System.out.println("BISHOP");
        System.out.println(bishop.isLegalMove(new Position(2, 2), new Position(5, 5)));
        System.out.println(bishop.isLegalMove(new Position(2, 2), new Position(2, 7)));

        System.out.println();


        System.out.println("QUEEN");
        System.out.println(queen.isLegalMove(new Position(3, 3), new Position(3, 7)));
        System.out.println(queen.isLegalMove(new Position(3, 3), new Position(6, 6)));
        System.out.println(queen.isLegalMove(new Position(3, 3), new Position(5, 6)));

        System.out.println();


        System.out.println("KING");
        System.out.println(king.isLegalMove(new Position(4, 4), new Position(5, 5)));
        System.out.println(king.isLegalMove(new Position(4, 4), new Position(6, 4)));

        System.out.println();


        System.out.println("KNIGHT");
        System.out.println(knight.isLegalMove(new Position(4, 4), new Position(6, 5)));
        System.out.println(knight.isLegalMove(new Position(4, 4), new Position(5, 5)));

        System.out.println();


        System.out.println("WHITE PAWN");
        System.out.println(pawnWhite.isLegalMove(new Position(2, 3), new Position(3, 3)));
        System.out.println(pawnWhite.isLegalMove(new Position(2, 3), new Position(1, 3)));

        System.out.println();


        System.out.println("BLACK PAWN");
        System.out.println(pawnBlack.isLegalMove(new Position(7, 3), new Position(6, 3)));
        System.out.println(pawnBlack.isLegalMove(new Position(7, 3), new Position(8, 3)));

        System.out.println();

    }
}