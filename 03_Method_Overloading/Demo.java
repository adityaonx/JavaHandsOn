//Method Overloading
class Calculator{
    //Method with same name can't be created unless type of parameter(s) is different or return type is different

    //Same method name with 2 parameters
    public int add(int a,int b){
       return a+b; 
    }
    
    //Same method name but no. of parameters are (here 3) different!
    public int add(int a,int b,int c){
       return a+b+c;
    }

    //Same method name and return type is different 
    public double add(double a,int b){
       return a+b;
    }
    
    //Error: In this case same method name and return type is different, still parameter are of same type and in same count.
    /* public double add(int a,int b){
       //return a+b;
    }*/
}

class Demo{

    public static void main(String[] args){

        Calculator obj1= new Calculator();
        int out1= obj1.add(4,6);
        System.out.println(out1);
    }
}