class Human{
    private int age;

    //Constructor (a class method), called by default to initialize variables with values when an object is instanciated.
    //Constructor name should be same as class name (Constructor never returns anything)
    //Values can be assigned outside constructor inside class but assignment should be done using methods.
    //Coding standard
    Human(){
        age = 12;
    }
    int getAge(){
        return age;
    }

    //Error: what if I have to use "age" as a local variable? a confusion with instance variable and a local variable?
    // void setAge(int age){
    //     age = age;
    // }

    void setAge(int age){
        //this keyword will refer to the instance variable of its object 
        this.age = age;
    }
}
class Demo{
    public static void main(String[] args){
        Human obj = new Human();
        // obj.setAge(26);
        System.out.println(obj.getAge());
    }
}