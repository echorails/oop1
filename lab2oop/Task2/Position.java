package Task2;

public class Position {
    private int row;
    private int column;

    public Position(int column, int row){

        if (row < 1 || row > 8 || column < 1 || column > 8){
            throw new IllegalArgumentException("wrong move");
    }
        this.column = column;
        this.row = row;
    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    @Override
    public String toString(){
        return row + "," + column;
    }

    

    
}
