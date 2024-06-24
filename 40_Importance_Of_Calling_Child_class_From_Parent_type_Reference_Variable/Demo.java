//Fixing the dynamic Class type in parameter declaration of child class method!
class Computer{
    void show(){
        
    }
}
class Laptop extends Computer{
    void show(){
        System.out.println("Laptop Gaming!");
    };
}

class Desktop extends Computer{
    void show(){
        System.out.println("Desktop Gaming!");
    };
}

class Developer{

    //Instead of fixed Child class, we are now using a parent of parent class to accept any of object i.e Laptop or Desktop
    void provide(Computer cmp){
        cmp.show();
    };
}

class Demo{
    public static void main(String[] args){
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        //Now both are working
        dev.provide(lap); //Laptop Gaming!
        dev.provide(desk); //Desktop Gaming!
       
       
    }
}
 