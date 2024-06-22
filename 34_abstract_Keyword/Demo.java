//Abstract Class : only empty method declaration; 
//1. Can't create Object of an abstract class.

abstract class Car{
    //Not compulsary to have a abstract method inside abstract class
    abstract void drive();
    abstract void fly();

    void playMusic (){

    System.out.println("");

    }
}

//must be abstracted if any of abstract method is not defined.
abstract class BMW extends Car{
   
    void drive(){
        System.out.println("Driving BMW");
    };

    void AutoDrive (){

    System.out.println("AutoDrive Mode ON!");

    }
}

//This is a concrete class instead of abstract class
class SuperBMW extends BMW{
    //Must define the abstracted method from abstract class or won't work.
    void drive(){
        System.out.println("Driving SuperBMW");
    };

    void fly(){
        System.out.println("Flying SuperBMW");
    };

    void AutoDrive (){

    System.out.println("AutoDrive Mode ON!");

    }
}
class Demo{
    public static void main(String[] args){
        //Error: Car is abstract; cannot be instantiated
        // Car c1 = new Car();
        // c1.playMusic();

        SuperBMW b1 = new SuperBMW();
        b1.drive();
        b1.AutoDrive();

    }
}
 