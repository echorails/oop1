package Task1.Abstract;


public class Cat extends Animal{
    public Cat(int age, String name){
        super(age, name);
    }

    @Override
    public void speaking(){
        System.out.println(getName() + "is saying Meoow");
    }
}
