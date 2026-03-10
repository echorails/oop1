package Task1.Taska;

public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(3, 5); 
        Cube cube = new Cube(4);
        Sphere sphere = new Sphere(2);

        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());

        System.out.println();

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());

        System.out.println();


        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere surface area: " + sphere.surfaceArea());

        System.out.println();


    }
}