class A{
    void show(){
    System.out.println("Showing A!");
  }
}

class Demo{
    public static void main(String[] args){
        A a1 = new A(){
            
        //Overriding the class method without defining a new class
        void show(){
            System.out.println("Custom Print!");
            } 
        }; 
        a1.show();    }
}
 