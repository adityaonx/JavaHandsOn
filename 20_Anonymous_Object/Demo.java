class A{
    A(){
        System.out.println("A is running!");
    }
}


class Demo{
    public static void main(String[] args){

        //instead of referencing it to a variable we are just creating an object only!
        new A();//Anonymous Object //Can't Reuse
        new A();//A new object is created!
    }
}