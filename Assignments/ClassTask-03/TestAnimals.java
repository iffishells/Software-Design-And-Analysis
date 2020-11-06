public class TestAnimals{
   


    public static void main(String[] args) {
        System.out.println("-----Starting.....");

        Fish D = new Fish();
        Cat C = new Cat("Fluffy");
        Animal A = new Fish();
        Animal E = new Spider();
        Pet P = new Cat();
    
        // Experiment by: 
        //     a) calling the methods in each object,
        //     b) exhibiting polymorphismusing interfaces and inheritance, 
        //     c) using super to call super class method
    


    //Calling the method in eact object
    // D.eat();
    // D.walk();//
    // C.walk();
    // C.setName("Catto");
    // C.getName();
    // System.out.println(C.getName());
    // A.eat();
    // A.walk();
    // E.eat();
    // P.getName();
    // P.walk(); not possible


    //b) exhibiting polymorphismusing interfaces and inheritance,
    //Actually what is doing here the code . A is object of type of animal but we are saving new object of fish 
    // in this way he get all thoese funcution of the fish function...
    A.eat();
    A.walk();
    E.eat();
    // System.out.println("E.eat() : "  E.eat());
    

    // using super to call super class method



    }
    

}


abstract class  Animal {

    protected int legs;
    // protected Constructor
    protected Animal(int legs){
        System.out.println("Animal constructor "+legs);
        this.legs = legs;
    }
    //abstract Method
    abstract  void eat();
    public void walk(){
        System.out.println("This animla is walk with "+legs+" legs");
    }   
}

class Spider extends Animal{
    Spider(){
        // System.out.println("Spider Constructor.....");
        super(8);
    }
    public void eat(){
        System.out.println("The spider eat the flyy....;;");
    }
}
interface  Pet{
    String getName();
    void setName(String Name);
}
class Cat extends Animal implements Pet{
    public String Name;
    Cat (String Name){
        
        // System.out.println(" Cat constructor......."+ Name);
        super(4);
        this.Name= Name;
    }
    Cat(){
        // System.out.println("Constructor caling without parameter ");
        this(" ");   // can be mistake here~~~~~~
    }
    
    public String  getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    void eat() {
        System.out.println("   Cat Eat Meat   .....")
    }
}
class Fish extends Animal{
    Fish(){
        // System.out.println(" fish Construactor  ");
        super(0);
    }
    @Override
    public void walk() {
        // TODO Auto-generated method stub
        super.walk();   // using super to call super class method
        System.out.println("Fish can't be Walk");
    }
    @Override
    void eat() {
        // TODO Auto-generated method stub
        System.out.println("   Fish eat the meat");
    }    
}

