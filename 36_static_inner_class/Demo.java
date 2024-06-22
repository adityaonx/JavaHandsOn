class A{
    //Can only make inner class static 
    static class B{
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

        //Not required to create a new object of B as its static inner class now 
        //A.B b1 = obj.new B();

        A.B b1 = new A.B();
        b1.show1(); 

    }
}
 