//Assume you have a Laptop, Desktop class and a developer class, and developer class is dependent on a class type to be parameterized in a class mehtod?

class Laptop{
    void show(){
        System.out.println("Laptop Gaming!");
    };
}

class Desktop{
    void show(){
        System.out.println("Desktop Gaming!");
    };
}

class Developer{

    //But this only will work on Laptop type of object and even if in Demo class Desktop object is provided it wont work.
    void provide(Laptop lap){
        lap.show();
    };
}

class Demo{
    public static void main(String[] args){
        Laptop lap = new Laptop();
        Developer dev = new Developer();
        dev.provide(lap);
        
    }
}
 