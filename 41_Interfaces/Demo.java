//Now Instead of using this below way of abstract class, we can call it a Interface!
// abstract class Computer{
//     abstract void show();
// }

interface Computer{
    void show();
}
class Laptop implements Computer{
    public void show(){
        System.out.println("Laptop Gaming!");
    };
}

class Desktop implements Computer{
    public void show(){
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
        //Now its called Interface Reference instead of class reference
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        //Now both are working
        dev.provide(lap); //Laptop Gaming!
        dev.provide(desk); //Desktop Gaming!
       
       
    }
}
 