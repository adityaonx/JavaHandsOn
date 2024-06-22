abstract class A{
    abstract void show();
}

class Demo{
    public static void main(String[] args){

        //When we have to use only once!
        //Here new A() doesn't instantiate abstract class, instead it instantiated the anonymous class having defined method from abstract class
        A a1 = new A(){
            
        void show(){
            System.out.println("Custom Print!");
            } 
        }; 
        a1.show();    
        }
}
 