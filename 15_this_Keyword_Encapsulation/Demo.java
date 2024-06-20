class Human{
    private int age = 14;
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
        obj.setAge(26);
        System.out.println(obj.getAge());
    }
}