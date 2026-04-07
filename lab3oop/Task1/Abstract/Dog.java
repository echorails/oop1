package Task1.Abstract;


    public class Dog extends Animal{
    public Dog(int age, String name){
        super(age,name);
    }

    @Override
    public void speaking(){
        System.out.println("this is " + getName() + " its " + getAge() + " years old and its saying " + "Woof");
    }
}
