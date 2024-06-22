class Parent1{
    
    int add( int n1, int n2){
        return n1+n2;
    }
}

class Parent2{
    
    int add( int n1, int n2){
        return n1+n2;
    }
}

//Multiple Inheritcance Unsupported, but a demo that the Child will get confuse from which parent it should call add() method?
class Child extends Parent1,Parent2{
    
    int mul( int n1, int n2){
        return n1*n2;
    }

}

class Demo {
    public static void main(String[] args){
        Child obj = new Child();
        int a1 = obj.add(2,3);
    
    }
    

}