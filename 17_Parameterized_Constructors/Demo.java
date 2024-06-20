//Only one constructor will run based on the parameter or default

class Human{
    private int age;
    private String name;

    //default Constructor
    Human(){
        this.age = 15;
        this.name = "Jimmy";
        System.out.println("Default is running");
    }

    //Coding standard
    //Parameterized Constructor
    Human(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Parameterized is running");
    }
    String getAgeAndName(){
        return  age + " " + name ;
    }
}
class Demo{
    public static void main(String[] args){
        Human obj = new Human(26,"Aditya");
        System.out.println(obj.getAgeAndName());
    }
}