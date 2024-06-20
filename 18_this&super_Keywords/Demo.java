//When class is extended then both the parent and child constructors are called by default

//class A extends Object (By default its hidden) so the super keyword points to Object class constructor

class A{
    private int age;
    A(){
        //Here super() is hidden by default but it is there
        super();
        System.out.println("A is running!");
        this.age=6;
    }

    A(int age){
        //Here super() is hidden by default but it is there
        super();
        System.out.println("int A is running!");
        this.age = age;
    }


}

class B extends A{
    private int age;
    B(){
        //Here super() is hidden by default but it is there
        super();
        System.out.println("B is running!");

    }
    B(int age){
        //Here this() keyword helps in running its own parameterized constructor instead of parent class
        this();
        System.out.println("int B is running!");

    }
}
class Demo{
    public static void main(String[] args){
        B obj1 = new B(30);
        
    }
}