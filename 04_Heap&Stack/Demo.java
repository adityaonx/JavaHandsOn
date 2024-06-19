class Calculator{
    //num=5 will be stored in heap memory because its stored inside an instance(object)
    int num=5;

    //n1 and n2 will have their own stack
    public int add(int n1,int n2){
       return n1+n2; 
    }
    
}

class Demo{

    public static void main(String[] args){

        //data = 10 stored inside (stack)
        int data = 10;
        
        // obj1 and obj2 stored inside (stack) with a memory address of the object in heap memory
        Calculator obj1= new Calculator();
        Calculator obj2= new Calculator();
        
        //out1 stored inside stack
        int out1= obj1.add(4,6);
        System.out.println(out1);

        //changing the object's variable value doesn't impact the other object's variables value!
        obj2.num=8;
        System.out.println(obj1.num);//5
        System.out.println(obj2.num);//8
    }
}