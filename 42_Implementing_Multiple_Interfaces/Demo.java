//Now Instead of using this below way of abstract class, we can call it a Interface!
// abstract class Computer{
//     abstract void show();
// }

interface Computer{
    void show();
}
interface Software extends Computer{
    void showVersion();
}

class Desktop implements Computer,Software{
    public void show(){
        System.out.println("Desktop Gaming!");
    };
    public void showVersion(){
        System.out.println("SoftwareVersion 11");
    };
}

class Developer{

    //Instead of fixed Child class, we are now using a parent of parent class to accept any of object i.e Laptop or Desktop
    void provide(Computer cmp){
        cmp.show();
        cmp.showVersion();
    };
}

class Demo{
    public static void main(String[] args){
        //Now its called Interface Reference instead of class reference
        Desktop desk = new Desktop();
        Developer dev = new Developer();
        //Now both are working
        dev.provide(desk); //Desktop Gaming!
       
       
    }
}
 