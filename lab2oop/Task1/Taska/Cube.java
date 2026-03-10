package Task1.Taska;

public class Cube extends Shape3D{
    private double length;
    

    public Cube(double length){
        this.length = length;
    }

    @Override
    public double volume(){
        return length * length * length;
    }

    @Override
    public double surfaceArea(){
        return 6 * length * length;
    }
}