//Inner Class : class inside a class
class A{
    class B{
        void show1(){
            System.out.println("Showing Inner B!");
        }
    }
    void show(){
    System.out.println("Showing A!");
    
  }
}

class Demo{
    public static void main(String[] args){
        A a1 = new A();
        A.B b1 = a1.new B();
        b1.show1(); 

    }
}
 